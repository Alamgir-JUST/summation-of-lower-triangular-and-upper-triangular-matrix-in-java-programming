package Matrix;

/*
 * Summation of Upper Triangular Matrix in JAVA
 * Alamgir, CSE, JUST
 * */
import java.util.Scanner;

public class upper_trigular {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the row number of the matrix : ");
		int r = scanner.nextInt();
		System.out.println("Enter the column number of the matrix : ");
		int c = scanner.nextInt();
		int[][] M = new int[r][c];
		System.out.println("Enter the matrix : ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				M[i][j] = scanner.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i<=j) {
					sum = sum+M[i][j];
				}
			}
		}
		
		System.out.println("Summation of Upper Triangular matrix is : "+sum);
	}

}
