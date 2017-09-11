import java.util.*;
import java.io.*;

public class BinarySearch{

    public static void main(String[] args){
    
        int[] data = {1, 3, 6, 7, 10, 15, 18, 99, 100};
        System.out.println(BinarySearch(data, 13, 0, data.length - 1));
    }

    public static boolean BinarySearch(int[] data, int target, int low, int high){
        if(low > high)
            return false;
        else{
            int mid = (low + high) / 2;
            if(target == data[mid])
                return true;
            else if (target > data[mid])
                return BinarySearch(data, target, mid + 1, high);
            else
                return BinarySearch(data, target, low, mid - 1);
        }
        
    }

}
