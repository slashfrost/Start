package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Integer[] human_num = new Integer[3];
        Integer[] random_num = new Integer[3];
        Integer[] delta = new Integer[3];
        int max_delta = 0;
        int human = 0;
        int rand = 0;
        Integer sum = 0;
        Operationable op = (int x, int y) -> {
            if (x > y)
                return x;
            else
                return y;
        };
        Operationable2 op2 = (int x, int y, int z, int p) -> {
            if (x > y && x > z) {
                p = x;
            } else if (y > x && y > z) {
                p = y;
            } else {
                p = z;
            }
        };
        for (int i = 0; i < human_num.length; i++) {
            System.out.println("input " + i + " number:");
            human_num[i] = in.nextInt();
            sum = sum + human_num[i];
        }
        sum = sum / 3;
        System.out.println("srednee: " + sum);
        for (int a = 0; a < human_num.length; a++) {
            delta[a] = human_num[a] - sum;
        }
        op2.calculate(delta[0], delta[1], delta[2], max_delta);
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

    interface Operationable {
        int calculate(int x, int y);
    }

    interface Operationable2 {
        void calculate(int x, int y, int z, int p);
    }
}
