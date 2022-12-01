package java;

import java.util.*;

public class taxcal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Your Income.");
        double inc = sc.nextDouble();
        double tax;

        if(inc< 500000){
            System.out.println("NO Tax");
        }

        else if(inc >= 500001 && inc<= 10000000){
            tax = 0.20 * inc ; 
            System.out.println("Tax to be paid ="+tax);
        }

        else{
            tax= 0.30 * inc;
            System.out.println("Tax to be paid ="+tax);
        }
    }
}
