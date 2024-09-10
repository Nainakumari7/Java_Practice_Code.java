import java.util.*;
public class twoArray {
    public static void main(String[] args) {
        int matrix [][] =new int  [3][3];
        Scanner sc = new Scanner(System.in);
        int n=3,m=3;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

        
    }
}



import java.util.*;
public class twoArray {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at :-("+ i +" , "+ j +" )");
                    return true;

                }

            }
        }
        return false;

    }
    public static void main(String[] args) {
        int matrix [][] =new int  [3][3];
        Scanner sc = new Scanner(System.in);
        int n=3,m=3;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
        search(matrix,5);

        
    }
}


spiral matrix
public class twoArray{
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=matrix.length-1;
        int endColumn=matrix[0].length-1;
        while(startRow<=endRow && startColumn<=endColumn ){
        for(int j=startColumn;j<=endColumn;j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        for(int i=startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endColumn]+" ");
        }
        for(int j=endColumn-1;j>=startColumn;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[endRow][j]+" ");
        }
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startRow==endRow){
                break;
            }
            System.out.print(matrix[i][startRow]+" ");
        }
        startColumn++;
        startRow++;
        endColumn--;
        endRow--;
    }
    System.out.println();
}
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        printSpiral(matrix);    
}
}


public class twoArray{
    public static int calDiagonalSum(int matrix[][]){
    int sum = 0;
    for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i);
        sum+=matrix[i][matrix.length-1-i];

    }
    return sum;
}
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
        };
        System.out.println(calDiagonalSum(matrix));

    }
}


public class twoArray{
    public static boolean stairCase(int matrix[][],int key){
        int row =0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found at:- (" + row + " ,"+ col +")");
                return true;
            }
            else if(matrix[row][col] > key){
                col--;

            }
            else{
                row++;
            }
        }
        System.out.println(" not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        stairCase(matrix, key);
    }


}
