package exercicios;
import java.util.Scanner;

public class exercicio1 {
	
	static Scanner leia = new Scanner(System.in);		
	
	static int pontuacao[] = new int[5];
	static int maiorNumero = 0;
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o valor da " + (i + 1) + "ª nota");
			pontuacao[i] = leia.nextInt();
			if(pontuacao[i] > maiorNumero) {
				maiorNumero = pontuacao[i];
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Nota " + (i + 1) + ": " + pontuacao[i]);
		}
		
		System.out.println("O maior numero é: " + maiorNumero);
	}

}
