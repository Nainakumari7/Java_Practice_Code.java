import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you input here:-");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you input here:-");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=(n-i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number:-");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here:-");
        int num = sc.nextInt();
        char ch = 'A';
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
}

import java.util.*;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here:-");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i = 1;i<=num1;i++){
            for(int j = 1;j<=num2;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
