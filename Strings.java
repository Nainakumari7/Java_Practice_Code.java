import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.length());
        
    }
    
}

concatination....
import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String fullName = firstName +" "+lastName;
        System.out.println(fullName+"your name is ");
        
    }
    
}


charAt();
public class string{
    public static void printChar(String str) {
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();    
    }
    public static void main(String args[]){
        String name1 = "Naina";
        String name2 = "kumari";
        String name3 = name1+" "+name2;
        printChar(name3);
    }
}

public class string{
    public static boolean calcPallindrom(String str){
        for(int i =0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;

            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mam";
        System.out.println(calcPallindrom(str));
        
    }
}

public class string{
    public static boolean calcPallindrom(String str){
        for(int i=0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(calcPallindrom(str));
        
    }
}

public class string{
    public static float getShortestPath(String path){
        int x=0;int y=0;
        for(int i = 0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));

    }
}


public class string{  
    public static void main(String[] args) {
        String str1 ="naina";
        String str2 = "naina";
        if(str1.equals(str2)){
            System.out.println("The strings are equals");
        }else{
            System.out.println("The strings rae not equal");
        }
    }
}


public class string{
    public static void main(String[] args) {
        String path = "HELLOWORLD";
        System.out.println(path.substring(0,5));
    }
}


public class string{
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        String largest = fruits[0];
        for(int i =0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];

            }
        }
        System.out.println(largest);

    }
}

public class string{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
            // O(26)...
        }
        System.out.println(sb.length());
    }
}


public class string{
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str ="hi, my name is naina";
        System.out.println(toUpperCase(str));
    }
}


public class string{
    public static String compress(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
                
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;

        }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
