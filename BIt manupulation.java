Binary AND operation in java....
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 & 6);
    }
    
}

Binary OR 
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 | 6);
    }
    
}


Binary XOR 
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 ^ 6);
    }
    
}


Binary Ones compliment
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(~5);
    }
    
}

Binary left shift operation
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5<<2);
    }
    
}


Binary right shift operation 
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(6>>1);
    }
    
}

Check if the number is even or odd
public class bitManipulation{
    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(10);
        evenOrOdd(11);
        evenOrOdd(21);
        
    }
}

get ith bit
public class bitManipulation{
    public static int getIthBit(int n ,int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(9, 2));
        
    }
}


public class bitManipulation{
    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10,2));
        
    }
}


update ith bit
public class bitManipulation{
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        if(newBit ==0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10,2, 1));
        
    }
}

clear last ith bit
public class bitManipulation{
    public static int clearLastBit(int n,int i){
        int bitMask= (~0)<<i;
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(clearLastBit(15, 2));
        
    }
    
}

public class bitManipulation{
    public static int clearRangeBit(int n,int i,int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(clearRangeBit(10,2, 4));
        
    }
    
}


public class bitManipulation{
    public static boolean powerOfTwo(int n){
        return (n&(n-1)) == 0;

    }
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4));
        
    }
    
}


count set bit in a number 
public class bitManipulation{
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
        if((n & 1)!=0){
            count++;
        }
        n=n>>1;
    }
    return count++;
}
    public static void main(String[] args) {
        System.out.println(countSetBit(15));
        
    }
    
}


 public class bitManipulation{
    public static int fastExpo(int a,int n){
        int ans = 1; 
        while(n>0){
            if((n & 1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n =n>>1;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(fastExpo(3,5));
    }   
    }
    
