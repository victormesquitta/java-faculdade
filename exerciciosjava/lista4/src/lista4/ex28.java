package lista4;

public class ex28 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int soma[]=new int[3];
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]=linha;
					soma[linha]+= matrix[linha][coluna];
				}
			}
		
		for (int i=0; i<soma.length;i++) {
			System.out.println("A soma da "+(i+1)+"? ?: "+soma[i]);
			
		}

	}

}
