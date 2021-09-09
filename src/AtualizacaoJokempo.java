import java.util.Random;
import java.util.Scanner;

public class AtualizacaoJokempo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random computador = new Random();
		int partida, escolhaUsuario, sorteioComputador;
		int contagem = 0;

		System.out.println("------------------------");
		System.out.println("         JOKENPO        ");
		System.out.println("------------------------");
		System.out.println();

		System.out.print("Quantas partidas? ");
		partida = leitor.nextInt();

		int resto = partida % 2;

		if (partida >= 2 && resto == 0) {
			System.out.println("Não é possível brincar");
			System.out.println("Escolha um número ímpar e que seja maior ou igual a 3");
		} else {
			System.out.println("");
		}
		System.out.println("------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("------------------------");
		System.out.println("");

		while (partida > contagem) {
			System.out.println("Partida " + (contagem + 1));

			System.out.println("Qual a sua opção?");
			escolhaUsuario = leitor.nextInt();
			sorteioComputador = computador.nextInt(3) + 1;
			System.out.println(sorteioComputador);
			if (escolhaUsuario == 3) {
				if (sorteioComputador == 1) {
					System.out.println("O computador venceu!");
				} else if (sorteioComputador == 2) {
					System.out.println("Você venceu!");
				} else {
					System.out.println("Deu empate");
				}
			}
			contagem++;
		}

	}

}
