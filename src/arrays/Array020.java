package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array020 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        System.out.println("Enter range K to L:");
        int k=sc.nextInt();
        System.out.println("Enter range K to L:");
        int l=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]= (random.nextInt(1,20));
            System.out.print(array[i]+" ");
        }
        int sum=0;
        for (int i = k; i < l; i++) {
            sum+=array[i];
        }
        System.out.println();
        System.out.println(sum);


    }
}
