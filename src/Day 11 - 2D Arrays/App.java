import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static int hourglass(int[][] arr){
        int max = 0;
        int sum = 0;

        for (int i = 0; i < 6; i++) {
              

            for (int j = 0; j < 6; j++) {
                sum = sum + arr[i][j];
                sum = sum + arr[i+1][j];
                sum = sum + arr[i+2][j];

                sum = sum + arr[i+1][j+1];

                sum = sum + arr[i][j+2];
                sum = sum + arr[i+1][j+2];
                sum = sum + arr[i+2][j+2];

                
                

                
            }
            
            
        }
        if(max >sum){
            return max;
        }
        return sum;


    }



    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        System.out.println(hourglass(arr));
        System.out.println("a");
    }

    
}

