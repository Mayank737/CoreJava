package Array;

public class ZIgZag {

	   public static void main(String[] args) {
		
		   int[][] twoDimArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12} };
	        printZigZag(twoDimArray, 4, 3);

		}

	    /**
	     * should print 
	     * 1 2 3
	     * 6 5 4
	     * 7 8 9
	     * 12 11 10
	     */
	    private static void printZigZag(int[][] twoDimArray, int nRows, int nCols) {
	     

	for(int i=0;i<nRows;i++){

	    if(i==0||i%2==0){

	    for(int j=0;j<nCols;j++){
	System.out.print(twoDimArray[i][j]+" ");
	    }
	    System.out.println();
	    }
	    

	    else{
	for(int j=nCols-1;j>=0;j--)
	System.out.print(twoDimArray[i][j]+" ");
	    }
	    System.out.println();
	}

	}
}
