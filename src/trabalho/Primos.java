package trabalho;

import java.util.Arrays;

public class Primos extends Thread{

	private int threadCorrespondente;
	private int [][]matrix;
	
	public Primos (int threadCorrespondent, int [][]matrix) {
		this.threadCorrespondente = threadCorrespondent;
		this.matrix = matrix;
	}
	
	@Override
	public void run() {
		
		int cont = 0; 
		
		for(int i = 0; i<5; i++) {
			for(int o = 0; o<5;o++) {
				if(matrix[i][o] !=1 && (matrix[i][o]==2||matrix[i][o]==3||matrix[i][o]==5||matrix[i][o]==7)) {
					cont++;
				}else {
					for(int z=7; z<matrix[i][o]; z++) {
						if(matrix[i][o]%z==0 && matrix[i][o]==z) {
							cont++;
						}
					}
				}
			} 

		}
		System.out.println("A quantidade de primos na matriz é "+ cont+ " calculado pela thread "+ threadCorrespondente);		
	}
}