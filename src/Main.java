import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yuzani kiriting=");
        double S = sc.nextDouble();
        double R = Math.sqrt(S / Math.PI);
        System.out.println("R = " + R);
        sc.close(); // Scanner'ni yopish
    }
}

