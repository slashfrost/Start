package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Integer[] human_num = new Integer[3];
        Integer[] random_num = new Integer[3];
        int delta1 = 0;
        int delta2 = 0;
        int delta3 = 0;
        int max_delta = 0;
        int count = 0;
        int human = 0;
        int rand = 0;
        Integer sum = 0;
        for (int i = 0; i < human_num.length; i++) {
            System.out.println("input " + i + " number:");
            human_num[i] = in.nextInt();
            sum = sum + human_num[i];
        }
        sum = sum / 3;
        System.out.println("srednee: " + sum);
        delta1 = human_num[0] - sum;
        delta2 = human_num[1] - sum;
        delta3 = human_num[2] - sum;
        if (delta1 > delta2 && delta1 > delta3) {
            max_delta = delta1;
        } else if (delta2 > delta1 && delta2 > delta3) {
            max_delta = delta2;
        } else {
            max_delta = delta3;
        }
        for (int j = 0; j < random_num.length; j++) {
            random_num[j] = random.nextInt(sum - Math.abs(max_delta));
            System.out.println(random_num[j]);
        }

        for (int t = 0; t < random_num.length; t++) {
            if (sum > random_num[t]) {
                human = human + 1;
            } else if (random_num[t] > sum) {
                rand = rand + 1;
            } else if (sum == random_num[t]) {
                human = human + 1;
                rand = rand + 1;
            }
        }
        if (human > rand) {
            System.out.println("human win!!!");
        } else {
            System.out.println("random win!!!");
        }
    }

}
