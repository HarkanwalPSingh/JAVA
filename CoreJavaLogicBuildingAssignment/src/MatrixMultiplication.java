
public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] firstMatrix = {{1,2},{3,4}};
		int [][] secondMatrix = {{5,5},{6,7}};
		int [][] product = new int[2][2];	

		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++)
				System.out.print(product[i][j]+" ");
			System.out.println();
		}
			
	}

}
