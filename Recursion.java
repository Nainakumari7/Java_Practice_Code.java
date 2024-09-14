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
