import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter n(1-200): ");
    int n = in.nextInt();
    while(n<1 || n>200){
        System.out.println("error, enter again");
        n = in.nextInt();
    }


    File f1= new File(""); //write file address here
    PrintWriter outfill1= new PrintWriter(f1);

    int Fibo1[]=new int[100000];
    int cFibo1=fibo(n,Fibo1);
    for (int i = cFibo1-1; i>=0; i--) {
        outfill1.print(Fibo1[i]);
    }
    outfill1.close();


    File f2= new File("");// write file address here
    PrintWriter outfill2= new PrintWriter(f2);

    int Aval1[]=new int[100000];
    int cAval1=aval(n,Aval1);
    for (int i = cAval1-1; i>=0; i--) {
        outfill2.print(Aval1[i]);
    }
    outfill2.close();

    int m=0;
    int cres=1;
    int res[]=new int[100000];
    for (int x=1;x<=n;x++){
        int Fibo2[]=new int[100000];
        int cFibo2=fibo(x,Fibo2);
        int Aval2[]=new int[100000];
        int cAval2=aval(x,Aval2);
        int temp[]=new int[100000];
        int ctemp=BigDiv(Fibo2,cFibo2,Aval2,cAval2,temp);
        cres=BigSum(res,cres,temp,ctemp,res);
    }
    for(int y=cres-1;y>=0;y--){
        System.out.println(res[y]);
    }






    }
    public static int Compare(int [] A, int cA , int [] B , int cB){

        int max=cA;
        if (cB>cA){
            max =cB;
        }

        int C[]= new int[max];
        int D[]= new int[max];
        int Resualt= -1;

        if(cA==max){
            for (int x=0;x<max;x++){
                C[x]=A[x];
            }
        }
        else if (cA<max){
            for (int y=0;y<cA;y++){
                C[y]=A[y];
            }
            for (int z=cA;z<max;z++){
                C[z]=0;
            }
        }
        if(cB==max){
            for (int x=0;x<max;x++){
                D[x]=B[x];
            }
        }
        if (cB<max) {
            for (int x=0;x<cB;x++){
                D[x]=B[x];
            }
            for (int y=cB;y<max;y++){
                D[y]=0;
            }
        }

        for (int h=max-1;h>=0; h=h-1){
            if (C[h]>D[h]){
                Resualt=1;
                break;
            }
            else if (D[h]>C[h]){
                Resualt= -1;
                break;
            }
            else if (C[h]==D[h]){
                Resualt= 0;
            }
        }
        return Resualt;

    }
    public static int BigSum (int [] A, int cA , int [] B , int cB, int [] Resualt) {

        int max =cA;
        if (cB>cA){
            max=cB;
        }

        int A2[]= new int[max];
        int B2[]= new int[max];


        for (int x=cA-1;x>=0;x--){
            A2[x]=A[x];
        }
        for (int z=cA;z<max;z++){
            A2[z]=0;
        }


        for (int y=cB-1;y>=0;y--){
            B2[y]=B[y];
        }
        for (int h=cB;h<max;h++){
            B2[h]=0;
        }

        int q=0;
        for (int t=0;t<max;t++){
            if (A2[t]+B2[t]+q>9){
                Resualt[t]=(A2[t]+B2[t]+q)%10;
                q=(A2[t]+B2[t]+q)/10;
            }
            else{
                Resualt[t]=A2[t]+B2[t]+q;
                q=0;
            }
        }

        int cResualt=max;
        while(q>0){
            Resualt[max]=q;
            q=0;
            cResualt=max+1;
        }

        return cResualt;
    }

    public static int BigMinus (int [] A, int cA , int [] B , int cB,int [] Resualt) {


        int A2[]=new int[100000];
        int B2[]=new int[100000];
        for (int x=0;x<cA;x++){
            A2[x]=A[x];
        }
        int cA2=cA;


        for (int u=0;u<cB;u++){
            B2[u]=B[u];
        }
        int cB2=cB;


        int max=cA;
        if (cB>cA){
            max=cB;
        }

        int t=0;
        int q=0;
        if(Compare(A2,cA2,B2,cB2)>=0){
            for (int x=0;x<max;x++){
                t=A2[x]-B2[x]+q;
                if(t>=0){
                    Resualt[x]=t;
                    q=0;
                }
                if(t<0){
                    Resualt[x]=t+10;
                    q=-1;
                }
            }
        }

        if(Compare(A2,cA2,B2,cB2)<0){
            for (int x=0;x<max;x++){
                t=B2[x]-A2[x]-q;
                if(t>=0){
                    Resualt[x]=t;
                    q=0;
                }
                if(t<0){
                    Resualt[x]=t+10;
                    q=-1;
                }
                if (x>0){
                    Resualt[x]=-Resualt[x];
                    Resualt[x-1]=-Resualt[x-1];
                }
            }
        }

        int cResualt=1;
        for(int z=max;z>=0;z--){
            if(Resualt[z]!=0){
                cResualt=z+1;
                break;
            }
        }


        return cResualt;
    }

    public static int BigMultiple(int [] A, int cA , int [] B , int cB , int [] Resualt) {



        if (Compare(A,cA,B,cB)>=0){
            for(int x=0;x<cB;x++){
                int q=0;
                int t=0;
                for (int y=0;y<cA;y++){
                    t=A[y]*B[x]+Resualt[x+y]+q;
                    q=0;
                    if (t>9){
                        Resualt[x+y]=t%10;
                        q=t/10;
                    }
                    if(t<10){
                        Resualt[x+y]=t;
                    }
                }
                while (q>0){
                    if(Resualt[cA]>9){
                        Resualt[cA]=(Resualt[cA]+q)%10;
                        q=(Resualt[cA]+q)/10;
                    }
                    if(Resualt[cA]+q<10){
                        Resualt[cA]=q+Resualt[cA];
                        q=0;
                    }
                    cA++;
                }
            }
        }

        if (Compare(A,cA,B,cB)<0){
            for(int x=0;x<cA;x++){
                int q=0;
                int t=0;
                for (int y=0;y<cB;y++){
                    t=A[x]*B[y]+Resualt[x+y]+q;
                    q=0;
                    if (t>9){
                        Resualt[x+y]=t%10;
                        q=t/10;
                    }
                    if(t<10){
                        Resualt[x+y]=t;
                    }
                }
                while (q>0){
                    if(Resualt[cB]>9){
                        Resualt[cB]=(Resualt[cA]+q)%10;
                        q=(Resualt[cB]+q)/10;
                    }
                    if(Resualt[cB]+q<10){
                        Resualt[cB]=q+Resualt[cB];
                        q=0;
                    }
                    cB++;
                }
            }
        }

        int cResualt=0;
        for(int x=cA+cB;x>=0;x--){
            if(Resualt[x]!=0){
                cResualt=x+1;
                break;
            }
        }
        return cResualt;
    }

    public static int BigDiv(int[] A, int cA , int [] B , int cB, int [] Resualt) {

        int A2[]= new int[100000];
        for (int x=0;x<cA;x++){
            A2[x]=A[x];
        }
        int cA2=cA;
        int B2[]= new int [100000];
        for (int x=0;x<cB;x++){
            B2[x]=B[x];
        }
        int cB2=cB;


        int cResualt=1;
        if (Compare(A2,cA2,B2,cB2)>=0) {
            while (Compare(A2, cA2, B2, cB2) >= 0) {
                cA2=BigMinus(A2,cA2,B2,cB2,A2);
                Resualt[0]++;

                if (Resualt[cResualt-1] == 10){
                    cResualt++;
                }

                for (int x = 0; x <cResualt ; x++) {
                    if (Resualt[x] == 10) {
                        Resualt[x + 1]++;
                        Resualt[x] = 0;
                    }
                }
            }
        }

        return cResualt;
    }

    public static int BigMode(int[] A, int cA , int [] B , int cB,int [] Resualt) {

        int A2[]=new int[100000];
        for (int x=0;x<cA;x++){
            A2[x]=A[x];
        }
        int cA2=cA;

        int B2[]=new int[100000];
        for (int x=0;x<cB;x++){
            B2[x]=B[x];
        }
        int cB2=cB;

        int cResualt=0;
        while (Compare(A2,cA2,B2,cB2)>=0) {
            cA=BigMinus(A2,cA2,B2,cB2,A2);
        }

        for(int x=0;x<cA2;x++){
            Resualt[x]=A2[x];
        }

      return cA;
    }

    public static int fibo(int n, int[] Resualt){

        int A[]=new int[100000];
        int cA=1;
        int B[]= new int[100000];
        int cB=1;
        Resualt[0]=1;
        int cResualt=1;
        int m=1;
        while(m<=n){
            if(m!=1){
                cResualt=BigSum(A,cA,B,cB,Resualt);
                for (int x=0;x<cB;x++){
                    A[x]=B[x];
                }
                cA=cB;

            }
            for(int y=0;y<cResualt;y++){
                B[y]=Resualt[y];
            }
            cB=cResualt;
            m++;
        }
        return cResualt;
    }

    public static int aval(int n, int[] Resualt){

        int C[]= new int[100000];
        int cC=0;
        int cResualt=1;
        Resualt[0]=1;
        int B[]=new int[100000];
        int cB=1;
        B[0]=1;
        int m=1;
        while(m<=n){
            Resualt[0]++;
            int f=0;
            for (int x=0;x<cResualt;x++){
                if(Resualt[x]==10){
                    Resualt[x]=0;
                    Resualt[x+1]++;
                    f++;
                }
            }
            if (f==cResualt){
                cResualt++;
            }
            for(int y=0;y<cB;y++){
                B[y]=0;
            }
            B[0]=1;
            cB=1;
            int count=0;
            while (Compare(Resualt,cResualt,B,cB)>=0) {
                cC=BigMode(Resualt,cResualt,B,cB,C);
                if(cC==1 && C[0]==0){
                    count++;
                }

                if(count>2){
                    break;
                }
                B[0]++;
                int r=0;
                for (int x=0;x<cB;x++){
                    if(B[x]==10){
                        B[x]=0;
                        B[x+1]++;
                        r++;
                    }
                }
                if(r==cB){
                    cB++;
                }

            }
            if(count==2){
                m++;
            }

        }
        return cResualt;
    }
}