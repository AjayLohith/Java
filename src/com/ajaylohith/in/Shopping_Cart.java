package com.ajaylohith.in;


import java.text.NumberFormat;
import java.util.Scanner;

public class Shopping_Cart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String item;
        int quantity;
        float rate;
        String toBePaid;

        System.out.print("Enter item:");
        item=sc.nextLine();

        System.out.print("Enter qunatity:");
        quantity=sc.nextInt();

        System.out.print("Price:");
        rate=sc.nextFloat();

        float ans=quantity*rate;

        toBePaid= NumberFormat.getCurrencyInstance().format(ans);

        System.out.println(toBePaid);

        sc.close();
    }

}
