package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] numbers_str;
        Integer [] numbers;
        Integer count=0;
        Integer sum=0;
        System.out.println("Input text:");
        String str = in.nextLine();
        String str1 = str.replaceAll("\\D+", "");
        System.out.println(str1);
        numbers_str = str1.split("");
        for (int i = 0; i < numbers_str.length ; i++) {
            count=Integer.parseInt(numbers_str[i]);
            sum=sum+count;
        }
        System.out.println(sum);
    }
}

