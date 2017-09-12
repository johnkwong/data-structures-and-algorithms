import java.util.*;
import java.io.*;

public class ReverseArray {

    public static void main(String[] args){
        int[] data = {4,3,6,2,7,8,9,5};
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(reverseArray(data, 0, data.length - 1)));
    }

    public static int[] reverseArray(int[] data,int low,int high){
        if(low > high){
            return data;
        }else{
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            return reverseArray(data, low + 1, high - 1);
        }
        
    }

}
