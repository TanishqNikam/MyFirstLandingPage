package java;

import java.util.*;

class largestno{
    public static void main(String[] args) {
        int a = 3, b = 7, c = 2;

        int lno;

        if(a > b && a > c){
            lno = a;
        }

        else if(b > c){
            lno = b;
        }

        else{
            lno = c;
        }

        System.out.println("The Largest of three is "+ lno);
    }
}