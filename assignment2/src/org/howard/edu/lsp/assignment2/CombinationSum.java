package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;

/**
 * In a given array this program prints out the positions of
 * all the possible combinations that will add up 
 * @author temip
 *
 */
public class CombinationSum 
{
	
	// sumCheck[i][sum] is a helper variable that will store true
	// if the sum is achievable with elements in the array from 0 to i
	static boolean[][] sumCheck;
	   
	/**
	* Helper method to print out arrays
	* @param pos
	*/
	static void printArray(ArrayList<Integer> pos)
	{
		System.out.println(pos);
	}
	
	
	/**
	 * Recursive helper function for printCombos which uses sumCheck and intArr
	 * to store all of the combinations in arr that add up to the target sum
	 * 
	 * @param arr: array containing the set of integers
	 * @param i: position tracker 
	 * @param sum: target sum
	 * @param intArr: array list containing the subsets
	 * 
	 */
    static void printCombosHelper(int arr[], int i, int sum, ArrayList<Integer> intArr)
    {
    	
    	// Print intArr if we reach the end of the list and sum is non-zero,
    	// arr[0] == sum or sumCheck[0][sum] is true 
        if (i == 0 && sum != 0 && sumCheck[0][sum])
        {
            intArr.add(i);
            printArray(intArr);
            intArr.clear();
            return;
        }

        // Print intArr if sum becomes 0
        if (i == 0 && sum == 0)
        {
            printArray(intArr);
            intArr.clear();
            return;
        }

        // If the target sum is reached after ignoring the current element...
        if (sumCheck[i-1][sum])
        {
            // create a new vector list and store elements
            ArrayList<Integer> listArr = new ArrayList<>();
            listArr.addAll(intArr);
            printCombosHelper(arr, i-1, sum, listArr); // repeat recursively after decrementing i
        }

        // If given sum still greater than current element.
        if (sum >= arr[i] && sumCheck[i-1][sum-arr[i]])
        {
           intArr.add(i); // add the position of current element to intArr
           printCombosHelper(arr, i-1, sum-arr[i], intArr); // repeat recursively after decrementing i
        }
    }
    
    
    /**
     * Working method to print all combinations to achieve target sum
     * 
     * @param arr: array of positive integers
     * @param n: length of array
     * @param sum: Target sum
     */
    
    public void printCombos(int arr[], int n, int sum)
    {
        if (n == 0 || sum < 0) // if array is empty, return
            return;

        sumCheck = new boolean[n][sum + 1];
        for (int i = 0; i < n; ++i)
        {
            sumCheck[i][0] = true;   
        }

        if (arr[0] <= sum)
            sumCheck[0][arr[0]] = true;

        for (int i = 1; i < n; ++i)
        {
            for (int j = 0; j < sum + 1; ++j)
                sumCheck[i][j] = (arr[i] <= j) ? (sumCheck[i-1][j] || sumCheck[i-1][j-arr[i]]) 
                		: sumCheck[i - 1][j];
        
                if (sumCheck[n-1][sum] == false)
                {
                    System.out.println("No combinations for sum " + sum);
                    return;
                }

                // Recursively check through sumCheck[][] for all paths from sumCheck[n-1][sum]
                ArrayList<Integer> finalArr = new ArrayList<>();
                printCombosHelper(arr, n-1, sum, finalArr);
        }
    }
}
