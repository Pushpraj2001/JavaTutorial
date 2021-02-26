package com.company;
import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter the Number 1: ");

        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Number 3: ");
        int num3 = sc.nextInt();

        if(num1 >= num2) {

            if (num1 >= num3) {

                System.out.println(num1 + " is the largest Number");
            } else {
                System.out.println(num3 + " is the largest Number");
            }
        }
            else{

            if(num2 >= num3) {

                System.out.println(num2 + " is the largest Number");
            }  else
                {
                System.out.println(num3+" is the largest Number");

                }
    }


    }

}
