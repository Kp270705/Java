// import java.util.Scanner;
// import java.util.ArrayList;


// public class ARRAYLIST {
//     public static void main(String[] args) {
//         System.out.println("\nHello");

//         Scanner sc = new Scanner(System.in);
//         ArrayList <Integer> arr = new ArrayList<>();

//         System.out.print("\nEnter the size of your ArrayList: ");
//         int n = sc.nextInt();

//         System.out.println("\n\t---: Enter your Arraylist elements :---");
//         for(int i=0; i<n; i++){

//             int temp = sc.nextInt();
//             arr.add(temp);
//         }

//         System.out.println("\n\t---: Here is your ARRAYLIST :---");
//         System.out.println("\n"+arr);
//     }
// }

// ==========================================================================

import java.util.Scanner;
import java.util.ArrayList;


public class ARRAYLIST {
    public static void main(String[] args) {
        System.out.println("\nHello");

        Scanner sc = new Scanner(System.in);
        ArrayList <String> arr = new ArrayList<>();

        System.out.println("\nEnter the size of your ArrayList: ");
        // =======================================
        // two methods to take input:- 

        // int n = sc.nextInt();
        // sc.nextLine();
        
                    // or 

            int n = Integer.parseInt(sc.nextLine());

        // =======================================

        System.out.println("\n\t---: Enter your Arraylist elements :---");
        for(int i=0; i<n; i++){

            String temp = sc.nextLine();
            arr.add(temp);
        }

        System.out.println("\n\t---: Here is your ARRAYLIST :---");
        System.out.println("\n"+arr);
    }
}
