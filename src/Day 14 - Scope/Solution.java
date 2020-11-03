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
        maximumDifference = 0;
        

        for(int i = 0; i<elements.length;i++){

            for(int j = 1; j<elements.length;j++){

                sum = elements [i] - elements[j];

                if( sum < 0){

                    sum = -sum;

                    if( maximumDifference < sum ){

                        maximumDifference = sum;
                    }

                    sum=0;
                }
                else{
                    
                    if( maximumDifference < sum ){
                        maximumDifference = sum;

                    }

                    sum=0;

                }
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