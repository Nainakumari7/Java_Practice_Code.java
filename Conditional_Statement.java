
if-else
import java.util.*;
public class conditional{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
        System.out.println(age + "ADULT");
        }else{
        System.out.println(age + "NOT ADULT");
        }
        
        }
}


1.check the greatest number among the two.
import java.util.*;
public class conditional{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        if(age1>age2){
        System.out.println("AGE 1 IS GREATER");
        }else{
        System.out.println( "AGE 2 IS GREATER");
        }
        
        }
}


2.check the given number iseven or odd
import java.util.*;
public class conditional{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
        System.out.println("EVEN");
        }else{
        System.out.println( "ODD");
        }
        
        }
}


else-if
import java.util.*;
public class conditional{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>18){
            System.out.println("ADULT");
        }else if(a<18){
            System.out.println("TEENAGER");
        }else{
        }
        }
}


Tax calculator

import java.util.*;
public class conditional{
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int income = sc.nextInt();
        int tax ;
        if(income < 500000){
            tax = 0;
        }else if(income >= 500000 && income < 1000000){
            tax =  income*20/100;
        }else{
            tax = income*30/100;
        }
        System.out.println(tax);
    }
}


Print the largest of three number 

import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("A");
        }else if(b>c){
            System.out.println("B");
        }else{
            System.out.println("c");
        }
    }
}

Ternary operator
public class conditional{
    public static void main(String[] args) {
        int a = 4;
        String type = (a % 2 == 0)?"even":"odd";
        System.out.println(type);
        
        
    }
}


import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String marks = (a>=30)?"pass":"fail";
        System.out.println(marks);
        
        
    }
}


Switch statement
public class conditional{
    public static void main(String[] args) {
        int a = 2;
        switch(a){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("mango shake");
            break;
            default : System.out.println("wake up to the reality");
            break;

        }
        
        }
    }


import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("wakeup");
        }
    }
    
}

Practice problem 
1....
import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println("The entered number is positive");
        }else{
            System.out.println("The entered number is not positive");
        }
    }
}


2...
public class conditional {
    public static void main(String[] args) {
    double temp = 103.5;
    if(temp>100){
        System.out.println("You have a fever");
    }
    else{
        System.out.println("you dont have a fever");
    }
    }
    }
    

3...
import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekdays = sc.nextInt();
        switch(weekdays){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thursday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            case 7 : System.out.println("Sunday");
            break;
            default : System.out.println("wakeup guys");
            break;
        }
    }
}


4...
public class conditional {
    public static void main(String args[]) {
    int a = 63, b = 36;
    boolean x = (a < b ) ? true : false;
    int y= (a > b ) ? a : b;
    }
    }


5...
import java.util.*;
public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int year = sc.nextInt();
        boolean x = (year % 4 ) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if(x&&(y||z)){
            System.out.println("ITS A LEAP YEAR");
        }else{
            System.out.println("ITS NOT A LEAP YEAR");
        }


    }
}














