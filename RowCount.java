import objectdraw.*;

/**
 *
 *  Lab 9 (part 1) - RowCount
 *  Erika Sklaver
 *  05/06/15
 *  
 *  This program is given a set of sets of numbers. It is stored in a multidimensional array: an array of an array of
 * ints. The program takes each set of numbers and takes their sum and returns them in another window. 
 * 
 *  
 */
public class RowCount extends FrameWindowController {
    
    // Test the computeRowSums method.
    // You can add your own tests if you wish, but you should not
    // change the existing testing code here.
    public void begin() {
        
        // initialize a 2D array with three rows
        int[][] values = {   { 1, 2, 3 },
                             { 4, 5, 6, 7 },
                             { 8, 9 }
                         };
        
        // calculate the sum of each row and store the results in a 1D array
        int[] rowTotals = computeRowSums(values);
        
        // print out the sum of each row
        for (int r = 0; r < rowTotals.length; r++) {
            System.out.println("Sum of row " + r + " is " + rowTotals[r]);
        }
    }
    
    // sumRowTotals method goes here!
    // This method takes a 2 dimensional array and returns a 1 dimensional array with the sums 
    public int[] computeRowSums(int[][] twoDimArray){
        
        //creates the Array which will contain the sums 
        int[] newArray = new int[twoDimArray.length]; 
        
        //goes through each index of the 2 dimensional array
        for (int r = 0; r < twoDimArray.length; r++){
            //the variable that will hold the sum for each set of numbers
            int number = 0; 
            
            //goes through each index of the 1 dimensional array
            for (int c = 0; c < twoDimArray[r].length; c++){
                
                //adds each number in the index to create the sum
                number = number + twoDimArray[r][c]; 
                
            }
            
            //creates the new array which contains the sums 
            newArray[r] = number; 
            
        }
        
        return newArray;
    }
    
}
