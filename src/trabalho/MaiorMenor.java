package trabalho;

import java.util.Arrays;

public class MaiorMenor extends Thread{
	
	private int threadCorrespondente;
	private int [][]matrix;
	
	public MaiorMenor (int threadCorrespondent, int [][]matrix) {
		this.threadCorrespondente = threadCorrespondent;
		this.matrix = matrix;
	}
	
	@Override
	public void run() {
		
		int cont = 0; 
		int []vetor = new int[25];
		
		
		for(int i = 0; i<5; i++) {
			for(int o = 0; o<5;o++) {
				 vetor[cont] = matrix[i][o];
				 cont++;
			} 
		}
		
		Arrays.sort(vetor);
		
		System.out.println("Menor: "+vetor[0]+" || Maior: "+ vetor[vetor.length - 1]);
	
	}
}
