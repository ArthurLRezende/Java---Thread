package trabalho;

import java.util.Arrays;

public class Mediana extends Thread{
	
	private int threadCorrespondente;
	private int [][]matrix;
	
	public Mediana (int threadCorrespondent, int [][]matrix) {
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
		int [][]matriz = new int [5][5];
		
		for(int z=0; z<5; z++) {
			for(int k=0;k<5;k++) {
				matriz[z][k] = vetor[conta];
				conta++;
				System.out.print(matriz[z][k]+ "\t");
			}
			System.out.println();
		}
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e ) {
			
		}
		System.out.println("\n\n");
		System.out.println("A mediana é igual a "+vetor[(vetor.length)/2]+" Thread "+ threadCorrespondente);
		
	}
	
	
}
