package RecusionConceptsAndPatterns;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(pow(2,7));
        System.out.println(power(2,7,50));

    }
    public static int pow(int a,int n)
    {
        if(n==0) return 1;
        int x = pow(a,n/2);
        int square = x*x;
        if((n&1)==1)
        {
            return a*square;
        }
        else {
            return square;
        }
    }
    //function to calculate a^n%m;
    public static int power(int a,int n,int m)
    {
        if(n==0) return 1;
        int x = power(a,n/2,m);
        int square = ((x%m)*(x%m))%m;
        if((n&1)==1)
        {
            return ((a%m)*square)%m;
        }
        else {
            return square;
        }
    }
}
