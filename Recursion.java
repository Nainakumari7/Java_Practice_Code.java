public class Recursion {
    public static void printNum(int n){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printNum(n);
    }
    
}



public class Recursion{
    public static void printNumInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNumInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printNumInc(n);
        
    }
}


public class Recursion{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fNM=fact(n-1);
        int fN = n*fact(n-1);
        return fN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));    
    }
}


public class Recursion{
    public static int naturalNum(int n){
        if(n==1){
            return 1;
        }
        int sNM=naturalNum(n-1);
        int sN = n+naturalNum(n-1);
        return sN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(naturalNum(n));    
    }
}


public class Recursion{
    public static int fabb(int n){
        if(n==0 || n ==1){
            return n;
        }
        int fabNM = fabb(n-1);
        int fabN =fabb(n-2);
        int fab = fabNM+fabN;
        return fab;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fabb(n));
    }
}


public class Recursion{
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr,0));
    }
}


public class Recursion{
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
            if(arr[i]==key){
                return i;
            }
            return firstOccurence( arr,key,i+1);

        }
        
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,8,3};
        int key = 5;
        System.out.println(firstOccurence(arr,5,0));
    }
}
public class Recursion{
    public static int lastOccurence(int arr[],int key,int i){
        if(i ==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }

        if(arr[i]==key){
            return i;
        }
        return isFound;

    }
            public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,8,3};
        int key = 5;
        System.out.println(lastOccurence(arr,5,0));
    }
}

public class Recursion{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return  x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    
}


public class Recursion{
    public static int optimisedPower(int x,int n){
        if(n==0){
            return 1;
        }
        int half = optimisedPower(x,n/2)*optimisedPower(x,n/2);

        if(n %2 != 0){
            half = x*half;
        }
        return half;
    
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimisedPower(2,10));
    }
    
}

public class Recursion{
    public static int till(int n){
        if(n==0 || n==1){
            return 1;

        }
        int fnm1 = till(n-1);

        int fnm2 = till(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(till(3));
        
    }
}

public class Recursion{
    public static void removeDuplicate(String str,int i, StringBuilder newStr ,boolean map[]){
        if(i == str.length()){
            System.err.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str,i+1,newStr,map);

        }else{
            if(map[currChar -'a']=true){
                removeDuplicate(str,i+1,newStr.append(currChar),map);

            }
        }

    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicate(str,0,new StringBuilder(" "),new boolean[26]);
    }
}

public class Recursion{
    public static int friendsPairing(int n){
        if( n == 1 || n == 2){
            return n;
        }
         int fnm1 = friendsPairing(n-1);
         int fnm2 = (n-1)*friendsPairing(n-2);
        return fnm1+fnm2;
        
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
        
    }
    
}


public class Recursion{
    public static void binaryString(int n,int lastPlace,StringBuilder str){
        if(n == 0){
            System.out.println(str);
        }
        if(lastPlace == 0){
            binaryString(n-1,0,str.append("0"));
            binaryString(n-1,1,str.append("1"));
        }else{
            binaryString(n-1,0,str.append("0"));

        }

    }
    public static void main(String[] args) {
        binaryString(3,0,new StringBuilder(" "));
        
    }
    
}

