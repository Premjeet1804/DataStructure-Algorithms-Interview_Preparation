package StringsConecptsAndPatterns;

public class LongestPalindromicSubString {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("a"));

    }
    public static String longestPalindrome(String s) {

        int n =  s.length();
        if(n==1) return s;
        int max=0;
        String max1 = "";
        String max2 = "";

        for(int i=0;i<n-1;i++){
            String s1 = palindromeLength(s,i,i);
            if(s1.length()>max1.length()) max1 = s1;
            String s2 = palindromeLength(s,i,i+1);
            if(s2.length()>max2.length()) max2 = s2;
        }

        return max1.length()>max2.length()?max1:max2;

    }

    public static String palindromeLength(String s,int i,int j)
    {
        int n = s.length();
        int len=0;

        while(i>=0 && j<n && s.charAt(i)==s.charAt(j))
        {
            i--;j++;
        }
        return s.substring(++i,j);
    }


}
