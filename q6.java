import java.util.*;
class q6{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println("fizzbus");
        }else if(number%3==0){
            System.out.println("fizz");
        }else if(number%5==0){
            System.out.println("bus");
        }else{
            System.out.println("none");
        }
    }
}