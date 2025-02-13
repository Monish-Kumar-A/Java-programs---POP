import java.util.*;
class q4{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println("divisible");
        }else{
            System.out.println("not divisible");
        }
    }
}