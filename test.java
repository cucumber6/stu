package Test11;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个n>1");
        n=sc.nextInt();
        N(n);

    }

    public static void N(int n){
        int sum=0;
        int k=0;
        int b=0;
        for(int i=1;i<=n;i++) {
            for (int a = 1; i <= n; i++) {
                k++;
                for (int j = i; j <= n; j++) {
                    if(j==i)
                        sum=sum+i;
                    if (j != k)
                        sum = sum + j;
                    b++;
                }
                sum = 0;
                k = 0;
            }
        }
        System.out.println("有"+" "+b+" "+"个组合");
    }
}
