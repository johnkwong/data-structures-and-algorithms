import java.util.*;
import java.io.*;

public class Power2{
    public static void main(String[] args){
        System.out.println(power(2, 13));
    }
    
    public static double power(double x, int n){
        if(n == 0)
            return 1;
        else{
            double partial = power(x, n/2);
            double result = partial*partial;
            if(n % 2 == 1)
                result *= x;
            return result;
        }
    }
}
