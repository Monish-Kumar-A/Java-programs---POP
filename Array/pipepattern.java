import java.util.*;
 
public class pipepattern{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int c=n,r=arr[0];
        for(int i=1;i<n;i++){
                if(r<arr[i])r=arr[i];
            }
        
        for (int i = r; i > 0; i--){
            for (int j=0;j<c;j++){ 
                if(i<=arr[j]){
                    System.out.print("| ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}