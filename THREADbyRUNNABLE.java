import java.util.*;
import java.lang.*;

class A implements Runnable{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Iteration"+i+" of runnable interface.");
        }
    }
}

public class THREADbyRUNNABLE {
    public static void main(String[] args) {
        A a = new A();
        Thread thrd1 = new Thread(a);
        thrd1.start();
    }
}
