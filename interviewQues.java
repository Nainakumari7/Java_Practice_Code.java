1...
public class interviewQues{
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        System.out.println("before swaping value of a:-"+ a + " " +"before swaping value of b :-"+ b );

        int swap = a;
        a = b;
        b = swap;
        System.out.println("After swaping value of a:-"+ a + " " +"After swaping value of b :-"+ b );

    } 
}


2...
import java.util.*;
public class interviewQues{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:-");
        int num = sc.nextInt();
        int rev = 0;

        while(num!=0){
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num = num/10;
        }
        System.out.println(rev);
    } 
}


3...
import java.util.*;
public class interviewQues{
        public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your string:-");
            String str = sc.next();
            String rev = "";
            int len = str.length();
            for(int i = len-1;i>=0;i--){
                rev = rev+str.charAt(i);
            }
            System.out.println(rev);
    } 
}


4...
import java.util.*;
public class interviewQues{
        public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your NUMBER :-");
            int num = sc.nextInt();
            int org_num = num;
            int rev = 0;
            while(num!=0){
                int lastDigit = num%10;
                rev = rev*10+lastDigit;
                num = num / 10;
            }
            if(org_num == rev){
                System.out.println("PALLINDROM");
            }
            else{
                System.out.println("NOT PALLINDROM");
            }
    } 
}

5...
import java.util.*;
public class interviewQues{
        public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your STRING :-");
            String str = sc.next();
            String org_str = str;
            String rev = "";
            int len = str.length();
            for(int i=len-1;i>=0;i--){
                rev = rev+str.charAt(i);
            }
            
            if(org_str.equals(rev)){
                System.out.println("PALLINDROM");
            }
            else{
                System.out.println("NOT PALLINDROM");
            }
}
}
