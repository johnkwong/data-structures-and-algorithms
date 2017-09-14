import java.util.*;
import java.io.*;

public class fibonacciBad {

    public static void main(String[] args){
        System.out.println(fibonacciBad(3));
    }
    
    public static int fibonacciBad(int n){
        if(n <= 1)
            return n;
        return fibonacciBad(n-2)+fibonacciBad(n-1);
    }

}
