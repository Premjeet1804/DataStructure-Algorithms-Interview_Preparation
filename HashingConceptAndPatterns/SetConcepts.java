package HashingConceptAndPatterns;

import java.util.HashSet;

public class SetConcepts {
    //Whenever u want to store unique elements use Set
    public static void main(String[] args) {
        int []arr = {1,2,4,6,4,2,5,6,4,3,5,9};
        System.out.println(numberOfDistinctEle(arr));

    }
    //Given an array return number of distinct elements in it.
    public static int numberOfDistinctEle(int []arr)
    {
        int count=0;
        HashSet<Integer> set = new HashSet<>();

        for(int el : arr) set.add(el);

        return set.size();

    }


}
