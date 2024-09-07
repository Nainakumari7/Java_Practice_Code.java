// Advance pattern
// 1...
// public class pattern{
//     public static void hollow_rect(int rows,int col){
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=col;j++){
//                 if(i == 1 || i == rows || j == 1|| j == col){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rect(4,5);    
//     }
    
// }


// 2...
// public class pattern{
//     public static void inverted_pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     public static void main(String[] args) {
//         inverted_pyramid(4);    
//     }
    
// }


// 3..
// public class pattern{
//     public static void inverted_number_pyramid(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//                 System.out.println();
//             }
//         }
//     public static void main(String[] args) {
//         inverted_number_pyramid(5);    
//     }
    
// }

// 4...
// public class pattern{
//     public static void floydes_triangle(int n){
//         int counter = 1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(counter+" ");
//                 counter++;
//             }
//                 System.out.println();
//             }
//         }
//     public static void main(String[] args) {
//         floydes_triangle(5);    
//     }
    
// }

// 5...
// public class pattern{
//     public static void triangle(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j) % 2 == 0){
//                     System.out.print("1");

//                 }else{
//                     System.out.print("0");
//                 }
//             }
//                 System.out.println();
//             }
//         }
//     public static void main(String[] args) {
//         triangle(5);    
//     }
    
// }


// 6...
// public class pattern{
//     public static void triangle(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 if((i+j) % 2 == 0){
//                     System.out.print("1");

//                 }else{
//                     System.out.print("0");
//                 }
//             }
//                 System.out.println();
//             }
//         }
//     public static void main(String[] args) {
//         triangle(5);    
//     }
    
// }

// 7..
// public class pattern{
//     public static void butterfly(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String[] args) {
//         butterfly(4);
        
//     }
// } 

// 8...
// public class pattern{
//     public static void rhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         rhombus(4);
        
//     }
// }


// 9...
// public class pattern{
//     public static void hollow_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 if(i==1|| i==n || j==1 || j==n){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rhombus(4);
        
//     }
// }


// 10...
public class pattern{
    public static void diamond_pattern(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        diamond_pattern(4);
        
    }

}
