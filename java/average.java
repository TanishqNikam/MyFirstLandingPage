package java;

import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 3 nos.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b + c) / 3;
        System.out.println("Average = " + avg);
    }
}
