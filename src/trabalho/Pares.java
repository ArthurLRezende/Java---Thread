package trabalho;

import java.util.Arrays;

public class Pares extends Thread{

	private int threadCorrespondente;
	private int [][]matrix;
	
	public Pares (int threadCorrespondent, int [][]matrix) {
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
		
		int conta = 0;
		
		for(int z=0; z<vetor.length;z++) {
			if(vetor[z]%2 == 0) {
				conta+=vetor[z];
			}
		}
		
		System.out.println("A soma de numeros pares resulta em: "+ conta+" Calculado pela Thread "+threadCorrespondente);
	}
	
}
