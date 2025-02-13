import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        char name= scan.next().charAt(0);
        int a=scan.nextInt();
        int b=89;
        int c=12;
        System.out.println(" My first letter "+name);
        System.out.print(a+b+c);
    }
}