import java.util. Scanner;

public class ARRAY {
    public static void main(String[] args) {
        System.out.println("Hello Sir! ");

        Scanner sc = new Scanner(System.in);

        System.out.println(" ---: Enter your ARRAY size :---");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("\n\t ---: Enter your ARRAY elements :---");
        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\n\t ---: Here is your ARRAY elements :--- ");
        for(int i= 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}
