package com.company;
import  java.util.Scanner;

public class experiment1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("****** Welcome to the Internation Bank of India  ****** ");


        double currentbal = 10000 ,withdraw, credit; //by default balance in the account

        while (true)
        {
            System.out.println("Choose 1 for Withdraw ");
            System.out.println("Choose 2 for Deposit ");
            System.out.println("Choose 3 for Balance ");
            System.out.println("Choose 4 for Exit ");
            int n = input.nextInt();


            switch (n)
            {
                case 1:
                    System.out.println("Enter the Money to be Withdraw: ");
                    withdraw = input.nextDouble();
                    if (currentbal>= withdraw)
                    {
                        currentbal = currentbal - withdraw;
                        System.out.println("Please collect the Amount");
                        System.out.println("Now Your current balance is :"+currentbal);

                    }else
                    {
                        System.out.println("Insufficient fund");
                    }
                    System.out.println(" ");
                    break;


                case 2:
                    System.out.println("Enter the amount to be deposit: ");
                    credit = input.nextDouble();
                    currentbal = currentbal+ credit;
                    System.out.println("Your amount have successfully deposit");
                    System.out.println("Now your balance is "+currentbal);

                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance in your account is :" +currentbal);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);


            }
        }

    }

}
