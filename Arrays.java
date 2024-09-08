public class array {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }else{
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println("index at:-"+linearSearch(number, key));      
    }   
}


public class array{
    public static int linearSearch(String fruits[],String key){
        for(int i=0;i<=fruits.length;i++){
            if(fruits[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String fruits[] = {"mango","orange","papaya","guava","apple","banana"};
        String key = "guava";
        int result = linearSearch(fruits, key);
        if(result == -1){
            System.err.println("string not found");
        }else{
            System.out.println("foundat :- " + result);
        }
    }
}

import java.util.*;
public class array{
    public static int findLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println(findLargest(num));
    }
    
}


import java.util.*;
public class array{
    public static int findSmallest(int num[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[]={1,2,6,3,5};
        System.out.println(findSmallest(num));
    }
    
}


public class array{
    public static int binarySearch(int num[],int key){
        int start = 0 ,end=num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }if(num[mid]<key){
                start=mid+1;
            }else{
                end=end-1;
            }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int key = 10;
        System.out.println(binarySearch(num, key));
        
    }
}


Reverse an array
public class array{
    public static void reverseArray(int num[]){
        int start =0,end=num.length-1;
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = num[temp];
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int num[] ={2,4,6,8,10};
        reverseArray(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}

public class array{
    public static void pairs(int num[]){
        for(int i=0;i<num.length;i++){
            int curr = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + curr + "," + num[j] + ")");
            }
            System.out.println();
        }
        }
    public static void main(String[] args) {
        int num[] ={2,4,6,8,10};
        pairs(num);
        
    }
}


print subarrays
import java.util.*;
public class array{
    public static void subarray(int n[]){
        int ts = 0;
        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays "+ ts);
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        subarray(n);
        
    }
}

public class array{
    public static void maxSubarraySum(int n[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<n.length;i++){
            int start = i;
            for(int j=i;j<n.length;j++){
                int end = j;
                currSum =0;
                for(int k=start;k<=end;k++){
                    currSum+=n[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum:-"+maxSum);

        public static void kadanes(int n[]){
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i=0;i<n.length;i++){
                currSum = currSum+n[i];
                if(currSum<0){
                    currSum=0;
                }
                maxSum = Math.max(maxSum,currSum);
            }
            System.out.println("max sum :- "+ maxSum);
        }
    public static void main(String[] args) {
        int n []={-2,-3,4,-1,-2,1,5,-3};
        kadanes(n);
        
    }
}


trapping rain water
public class array{
    public static int trappingRainWater(int height[]){
        int n = height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappingRainWater(height));

        
    }
}
