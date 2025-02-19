import java.util.*;

public class comparingstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="Perumal";
        String b="Perumal";
        String c=new String("Perumal");
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(a.equals(c));
    }
}

