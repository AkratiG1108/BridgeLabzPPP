import java.util.*;
public class arrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number of elements:");
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                System.out.println("enter element at index "+i);
                int a=sc.nextInt();
                arr[i]=a;
                
            }   }
    }
    

}
