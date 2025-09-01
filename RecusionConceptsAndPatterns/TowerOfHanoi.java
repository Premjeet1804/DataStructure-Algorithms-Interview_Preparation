package RecusionConceptsAndPatterns;

public class TowerOfHanoi {
    public static void main(String[] args) {

        System.out.println(TOH(3,'A','B','C'));



    }

    public static int TOH(int N,char src,char dest,char inter)
    {

        //Assumption: TOH function return sthe correct
        // value of min no. of steps to move N rings
        // form src to dest using inter.
        if(N==1) return 1;

        int  x = TOH(N-1,src,inter,dest);
        int y = TOH(1,src,dest,inter);
        int z = TOH(N-1,inter,src,dest);

        return (x+y+z);
    }

}
