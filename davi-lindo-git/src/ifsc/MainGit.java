package ifsc;

public class MainGit {

	public static void main(String[] args) {

		
		
		/**
		 * Pega um vetor e multiplicar todos os elementos desse vetor e retorna um novo
		 * vetor.
		 * 
		 * @param vetor
		 * @return
		 */

		public Double[] multiplicaVetor(Double[] vetor){
			Double[] novoVetor = new Double[vetor.length];
			for (int i = 0; i < vetor.length; i++) {
				novoVetor[i] = vetor[i] * vetor[i];
			}

			return novoVetor;
		}
		}
	}