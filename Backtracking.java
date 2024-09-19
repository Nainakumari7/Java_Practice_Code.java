public class Backtraking {
     public static void changeArray(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);
            return ;
        }
        arr[i]=val;
        changeArray(arr, i+1, val+1);
        arr[i]=arr[i]-2;
     }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArray(arr, 0, 1);
        printArr(arr);
    }    
}


public class Backtraking{
    public static void findSubset(String str,int i,String ans){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        findSubset(str, i+1, ans+str.charAt(i));
        findSubset(str, i+1, ans);
    } 
    public static void main(String[] args){
        String str = "abc";
        findSubset(str, 0,"");
    }
}


public class Backtraking{
    
    public static void permutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        
        }
        for(int i= 0;i<str.length();i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0,i)+str.substring(i+1);
            permutation(NewStr, ans+curr);
        }
    } 
    public static void main(String[] args){
        String str = "abc";
        permutation(str,"");
    }
}
