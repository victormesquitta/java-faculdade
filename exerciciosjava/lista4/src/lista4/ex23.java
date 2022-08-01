package lista4;

public class ex23 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					if(linha%2==0) {
					matrix[linha][coluna]=10;
					
					}
					else {
						matrix[linha][coluna]=21;
					}
				}
			}
		
		for (int linha=0; linha<matrix.length;linha++) {
			
			for(int coluna=0; coluna<matrix[linha].length;coluna++)
			{
				System.out.print(matrix[linha][coluna]+"\t");
			}
			System.out.println();
		}

	}

}
