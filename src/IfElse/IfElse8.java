package IfElse;

import java.util.Scanner;

public class IfElse8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number:");
        int number1=sc.nextInt(),number2=sc.nextInt(),min,max;
        if(number1>number2) min=number2;
        else min=number1;
        if(number1>number2) max=number1;
        else max=number2;
        System.out.println("Smaller value:"+min);
        System.out.println("Larger value:"+max);
    }
}
