import java.util.*;
import java.io.*;

public class LinearSum {

    public static void main(String[] args){
        int[] data = {1, 3, 5, 7, 9};
        System.out.println(linearSum(data, data.length - 1));
    }

    public static int linearSum(int[] data, int n){
        if(n < 0)
            return 0;
        return linearSum(data, n - 1) + data[n];
    }

}
