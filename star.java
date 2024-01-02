// Star Pattern:- 

// Pattern 1:-         ***** 
//                     **** 
//                     *** 
//                     ** 
//                     * 

// Above pattern code:- 

// import java.util.*;

// public class star {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         char c = '*'; int n=0; 
//         System.out.println("\n");

//         for(int i=0; i<5; i++){
//             for(int j=0; j<5-(n);j++){
//                 System.out.print(c);
//             }
//             System.out.println("\n");
//             n++;
//         }
//         System.out.println("\n");
//         sc.close();
//     }
// }

// =======================================================

// Pattern 2:- 

//                       * 

//                     * * 

//                   * * * 

//                 * * * * 

//               * * * * * 

// // Above pattern code:-

// import java.util.*;

// public class star {
//     public static void main(String[] args) {

//         char c = '*';
//         int n = 1;

//         System.out.println("\n");

//         for (int i = 0; i < 5; i++) {

//         for (int j = 0; j < 5-(n) ; j++) {
//             System.out.print("  ");
//         }

//         for (int k = 0; k < n ; k++) {
//             System.out.print(c+" ");
//         }

//             System.out.println("\n");
//             n++;
//         }
//     }
// }

// =======================================================

// pattern 3:- 

//              * 

//              * * 

//              * * * 

//              * * * * 

//              * * * * * 

// // Above pattern code:- 

// import java.util.*;

// public class star{
//     public static void main(String[] args) {

//         int n = 1;
//         char c = '*';

//         System.out.println("\n");

//         for (int i = 0; i < 5; i++) {

//             for (int j = 0; j <= i ; j++) {

//                 System.out.print(c+" ");
//             }

//             System.out.println("\n");
//             n++;
//         }

//     }
// }

// =======================================================


// Pattern 4:- 


//               * * * * * 

//                 * * * * 

//                   * * * 

//                     * * 

//                       * 


// // Above pattern code:- 

// import java.util.*;

// public class star{
//     public static void main(String[] args) {

//         char c= '@', c2='*';
//         int n = 0;

//         System.out.println("\n");
//         for (int i = 0; i < 5; i++) {
//             for (int j = 1; j <= i; j++) {

//                 if (i==0) {
//                 break;                    
//                 }

//                 System.out.print("  ");

//             }

//             for (int k = 0; k < (5-n); k++) {
//                 System.out.print(c2+" ");    
//             }

//             n++;
//             System.out.println("\n");    
//         }

//     }

// }


// ========================================================================

