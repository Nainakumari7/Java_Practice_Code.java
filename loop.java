while loop

public class loop {
    public static void main(String[] args) {
        int counter = 0;
        while(counter<100){
            System.out.println("Hellow naina");
            counter++;

        }
    }
    
}

 print number from 1 to 10
public class loop {
    public static void main(String[] args) {
        int counter = 1;
        while(counter<=10){
            System.out.println(counter);
            counter++;

        }
    }
    
}

import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int counter = 1;
        while(counter<=number){
            System.out.println(counter);
            counter++;

        }
    }
    
}


import java.util.*;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter <= number){
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
    
}


for loop
public class loop{
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            System.out.println("Hellow World");
        }
    }
    
}

public class loop{
    public static void main(String[] args) {
        for(int line = 0; line < 4; line++){
            System.out.println("****");
        }
        int line = 0;
        while(line < 4){
            System.out.println("****");
            line++;
        }
    }
    
}


Printing the reverse of a number
public class loop{
    public static void main(String[] args) {
        int number = 10899;
        while(number>0){
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number/10;
        }
    }
}

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter your number here:");
        int n = sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }
}


Reverse the given number 
public class loop{
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            rev = (rev*10)+lastDigit;
        }
        System.out.println(rev);
    }
}

do while loop
public class loop{
    public static void main(String[] args) {
        int n = 1;
        do{
            System.out.println("Hello Naina");
            n++;
        }while(n<=10);
    }
}


Break
public class loop{
    public static void main(String[] args) {
        for(int n = 1;n<5;n++){
            if(n == 3){
                break;
            }
            System.out.println(n);

        }
        System.out.println("we are out from the loop");
        
        
    }
}

import java.util.*;
public class loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;

            }
            System.out.println(n);
        }while(true);    
    }
}


continue statement
public class loop{
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++){
            if(i == 3){
                continue;
            }
            System.err.println(i);
        }

        }
    }


display all the numbers entered by user except multiple of 10
import java.util.*;
public class loop{
        public static void main(String[] args) { 
        Scanner sc =  new Scanner(System.in);
        do{
        System.out.print("Enter your number:-");
        int n = sc.nextInt();
        if(n % 10 == 0){
                continue;
        }
        System.out.println("number was :- "+n);
                
        }while(true);
        
        }
}

check whether the given number is prime or not

import java.util.*;
public class loop{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                boolean isPrime = true;

                for(int i = 2; i < n-1;i++){
                if(n % i == 0){
                isPrime = false;
                }
                }

                if(isPrime==true){
                        System.out.println("Entered number is PRIME");
                }else {
                        System.out.println("Entered number is not PRIME");

                }
        }
}

import java.util.*;
public class loop{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the numer :-");
                int n = sc.nextInt();
                for(int i=1;i<=10;i++){
                        System.out.println(n*i);
                }
        }
}

import java.util.*;
public class loop{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the numer :-");
                int fact = 1;
                int n = sc.nextInt();


                for(int i=1;i<=n;i++){
                fact *= i;
                }
                System.out.print(fact);
        }
}
