package matrixs;

import java.util.Scanner;

public class Matrix22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix rows:");
        int m=sc.nextInt();
        System.out.println("Enter matrix cloumns:");
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < m; j++) {
                sum+=matrix[j][i];
            }
            System.out.println((i)+" column elements mean arifmetic value:"+sum);
            sum=0;
        }

    }
}
