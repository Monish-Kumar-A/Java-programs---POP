public class timecomplexityO {
    public static void main(String[] args) {
        int n=8;
        //O(1) - constant time
        System.out.println("O(1) Example");
        for (int i=1;i<=5;i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //O(log n) - lograthimic time
        System.out.println("O(log n) Example");
        for (int i=1;i<=n;i*=2){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //O(n) - linear time
        System.out.println("O(n) Example");
        for (int i=0;i<n;i++){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //O(n log n) - linearithimic time
        System.out.println("O(n logn) Example");
        for (int i=0;i<n;i++){
            for(int j=1;j<=n;j*=2){
            System.out.print(i + " ");
        }
    }
        System.out.println("\n");

        //O(n^2) - quadratic time
        System.out.println("O(n^2) Example");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print("("+i +","+j+")  ");

        }
        System.out.println("\n");

    }
}
