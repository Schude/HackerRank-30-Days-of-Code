import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    /**
     * @param elements
     */
    public Difference(int[] elements) {
        this.elements = elements;
        
    }

    // Add your code here
    public void computeDifference(){
        int sum = 0;

        for(int i = 0; i<elements.length;i++){
            int a = elements[i];
            int b = elements[i+1];
            
            if((a-b) < 0){
                sum = -(a-b);
                
            }
            else{
                sum = a-b;
            }
        }


    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}