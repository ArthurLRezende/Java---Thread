package trabalho;

public class Media extends Thread{
	
	private int threadCorrespondente;
	private int [][]matrix;
	
	public Media (int threadCorrespondent, int [][]matrix) {
		this.threadCorrespondente = threadCorrespondent;
		this.matrix = matrix;
	}
	
	@Override
	public void run() {
		
		int cont = 0; 
		
		for(int i = 0; i<5; i++) {
			for(int o = 0; o<5;o++) {
				cont += matrix[i][o];
			} 
		}
		int media = cont/25;
		System.out.println("\nMedia: " + media + " Calculada pela thread " + threadCorrespondente);
	}
}