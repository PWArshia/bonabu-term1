import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("tedad adad : ");
         int n= in.nextInt();

         System.out.print("p1 o p2 adad : ");
         int p1= in.nextInt();
         int p2= in.nextInt();

         int A[]= new int[n];

         for (int x=0;x<n;x++) {
             System.out.print("A[" + x + "] : ");
             A[x] = in.nextInt();
         }

         int b= p2-p1+1;
         for (int y=p2;y<n;y++) {
             A[y-b]=A[y];
         }

         for (int z=0;z<n-b;z++) {
             System.out.print(A[z]+" ");
         }
    }
}