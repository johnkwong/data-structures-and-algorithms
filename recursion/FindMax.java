import java.util.*;
import java.io.*;

public class FindMax {

    public static void main (String args[]){
        int[] data = {1, 12, 10, 4, 9, 5, 3};
        System.out.println(max(data, data.length - 1));
    }

    public static int max(int[] data, int n){
        if(n == 0) return data[0];
        int max = max(data, n - 1);
        return (max > data[n]) ? max : data[n];        
    }

}
