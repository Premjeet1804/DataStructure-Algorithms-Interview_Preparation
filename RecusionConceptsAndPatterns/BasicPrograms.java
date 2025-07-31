package RecusionConceptsAndPatterns;

public class BasicPrograms {
    public static void main(String[] args) {
//        System.out.println(fibonaaci(37));
//        System.out.println(isPalindrome("nitin",0,4));
//        System.out.println(sumOfN(10));
//        System.out.println(sumOfDigits(1293));
//        System.out.println(factorial(5));
        System.out.println(power(2,8));
    }

    public static int sumOfN(int n)
    {
        if(n==1) return 1;
        return n+sumOfN(n-1);
    }

    public static int fibonaaci(int n)
    {
        if(n==0 || n==1) return n;
        return fibonaaci(n-1)+fibonaaci(n-2);
    }
    public static boolean isPalindrome(String s,int i,int j)
    {
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindrome(s,i+1,j-1);

    }
    public static int sumOfDigits(int num)
    {
        if(num<10) return num;
        return num%10 + sumOfDigits(num/10);
    }

    public static int factorial(int n)
    {
        if(n==1) return 1;

        return n*factorial(n-1);
    }
    public static int power(int a,int n)
    {
        if(n==1) return a;
        return a*power(a,n-1);
    }
}
