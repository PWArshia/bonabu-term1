import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File f1= new File("");// write file address for import n and matris
        Scanner sc = new Scanner(f1);

        int n= sc.nextInt();
        double A[][]=new double[n][n+1];
        for (int x = 0; x < n; x++) {
            int y=0;
            while(sc.hasNextInt()) {
                if (y==n+1)
                    break;
                A[x][y]= sc.nextInt();
                y++;
            }
        }

        sc.close();



        for(int x=0; x<n; x++){
            for (int y=0; y<n; y++){
                double t=A[y][x];
                for(int z=0; z<n+1; z++){
                    if (y!=x){
                        if (A[x][x]==0){
                            System.out.println("");// write file address for upload answer
                            x=n;
                            y=n;
                            break;
                        }
                        double ajab= (-t/A[x][x])*A[x][z];
                        A[y][z]+=ajab;
                    }
                }
            }
        }
        int t=0;
        for (int x = 0; x < n; x++) {
            t+=1;

            System.out.println( "a"+t+"="+A[x][n]/A[x][x] + " ");
        }

    }
}