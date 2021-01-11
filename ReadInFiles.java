import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class ReadInFiles {
	public static void main(String[] args) throws FileNotFoundException {
		// instantiate Scanner object to read in from file
      Scanner scan = new Scanner(new File("hidden.txt"));
		
		// read in rows
		int rows = scan.nextInt();
      
		// read in columns
		int cols = scan.nextInt();
		// instantiate WordSearch object passing in number of rows & columns for 2D array
		WordSearch puzzle = new WordSearch(rows, cols);
		// loop through the rows in the file
		for(int r = 0; r < rows; r++) {
			// loop through the columns in the file
			for(int c = 0; c < cols; c++) {
				// read in value from file using local variable
				String w = scan.next();
				// pass row, column, and value into the 2D array
				puzzle.setSpot(w, r, c);
         }
      }
	}
}
