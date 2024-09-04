1.Relational operator
2.Arithematic operator
3.Logical operator
4.Bitwise operator
5.Assignment operator 

import java.util.*;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = A+B;
        System.out.println("The sum of A and B is = "+sum);
        int diff = A-B;
        System.out.println("The diff of A and B is = "+diff);
        int product = A*B;
        System.out.println("The product of A and B is = "+product);
        int divide = A/B;
        System.out.println("The divide of A and B is = "+divide);
        int modulo = A%B;
        System.out.println("The modulo of A and B is = "+modulo);
    }
    }


    PREINCRIMENT
public class operator{
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}

POSTINCRIMENT
public class operataor{
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}

predecremnt
public class operataor{
    public static void main(String[] args) {
        int a = 10;
        int b = --a;
        System.out.println(a);
        System.out.println(b);
    }
}

Postdecrement
public class operataor{
    public static void main(String[] args) {
        int a = 10;
        int b = a--;
        System.out.println(a);
        System.out.println(b);
    }
}

Relational operator
public class operataor{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
    }
}


Logical operator
public class operator{
    public static void main(String[] args) {
        System.out.println((3>0)&&(6>2));
    }
}

public class operator{
    public static void main(String[] args) {
        System.out.println((3>4)||(6>8));
    }
}

public class operator{
    public static void main(String[] args) {
        System.out.println((3>0)&&(6>2));
    }
}

public class operator{
    public static void main(String[] args) {
    int A = 20;
    A = A+10;
    A+=10;
    A = A-10;
    A -= 10;
    A*=10;
    A/=10;
    System.out.println(A);
    }
}


public class operator {
    public static void main(String[] args){
    int x = 9, y = 12;
    int a = 2, b = 4, c = 6;
    int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
    System.out.println(exp);
    }
    }
    
