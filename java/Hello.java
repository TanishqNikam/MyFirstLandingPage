package java;

import java.util.*;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hello world");
        System.out.println("enter 2 values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int pro = a * b;
        int sub = a - b;
        int div = a / b;

        System.out.println(sum);
        System.out.println(pro);
        System.out.println(sub);
        System.out.println(div);
    }
}