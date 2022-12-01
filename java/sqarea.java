package java;

import java.util.*;

public class sqarea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the side of the square.");
        double s = sc.nextDouble();

        double area = s * s;
        System.out.println("Area of Sq =" + area);
    }
}