
import java.util.Scanner;

class q7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;
            System.out.print(a+ " ");
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println(a);
    }
}