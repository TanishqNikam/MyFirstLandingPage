package questions;

import java.util.*;

public class charge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a no.");
        double no = sc.nextDouble();

        if(no > 0){
            System.out.println("The no is positive.");
        }

        else{
            System.out.println("The no is negative.");
        }
    }
}
