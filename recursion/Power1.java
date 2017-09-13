import java.util.*;
import java.io.*;

public class Power1{
    public static void main(String[] args){
        System.out.println(power(2, 13));
    }
    
    public static int power(int x, int n){
        if(n == 0)
            return 1;
        else
            return x * power(x, n-1);    
    }
}
