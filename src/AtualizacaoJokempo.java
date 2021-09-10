import java.util.Random;
import java.util.Scanner;

public class AtualizacaoJokempo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Random computador = new Random();
		int partida, escolhaUsuario, sorteioComputador, pontuacaoComputador = 0, pontuacaoUsuario = 0;
		int contagem = 0;
		String resposta;

		System.out.println("------------------------");
		System.out.println("         JOKENPO        ");
		System.out.println("------------------------");
		System.out.println();

		System.out.print("Quantas partidas? ");
		partida = leitor.nextInt();

		int resto = partida % 2;

		if (partida >= 2 && resto == 0) {
			System.out.println("N�o � poss�vel brincar");
			System.out.println("Escolha um n�mero �mpar e que seja maior ou igual a 3");
		} else {
			System.out.println("------------------------");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("------------------------");
			System.out.println("");
			while (partida > contagem) {
				System.out.println("");
				System.out.println("Partida " + (contagem + 1));
				System.out.println("Qual a sua op��o?");
				escolhaUsuario = leitor.nextInt();
				System.out.println("Voc� escolheu " + escolhaUsuario);
				sorteioComputador = computador.nextInt(3) + 1;
				System.out.println("Computador escolheu " + sorteioComputador);

				if (escolhaUsuario == 3) {
					if (sorteioComputador == 1) {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;
						System.out.println(pontuacaoComputador);
					} else if (sorteioComputador == 2) {
						System.out.println("Voc� venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;
						System.out.println(pontuacaoUsuario);
					} else {
						System.out.println("Deu empate");
						pontuacaoComputador = pontuacaoComputador + 1;
						pontuacaoUsuario = pontuacaoUsuario + 1;
						System.out.println(pontuacaoComputador + "X" + pontuacaoUsuario);
					}
				} else if (escolhaUsuario == 2) {
					if (sorteioComputador == 1) {
						System.out.println("Voc� venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else if (sorteioComputador == 2) {
						System.out.println("Deu empate!");
						pontuacaoComputador = pontuacaoComputador + 1;
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;
					}
				} else {
					if (sorteioComputador == 1) {
						System.out.println("Deu empate!");
						pontuacaoComputador = pontuacaoComputador + 1;
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else if (sorteioComputador == 2) {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;

					} else {
						System.out.println("Voc� venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;
					}
				}
				contagem++;
			}

		}
		System.out.println("Jogar novamente?");
		System.out.println("Digite S (para sim) e N (para n�o)");
		resposta = leitor.next();
		
		while(resposta.equals("S") | resposta.equals("s")) {
			contagem = 0;
			
			System.out.println("------------------------");
			System.out.println("         JOKENPO        ");
			System.out.println("------------------------");
			System.out.println();

			System.out.print("Quantas partidas? ");
			partida = leitor.nextInt();
			if (partida >= 2 && resto == 0) {
				System.out.println("N�o � poss�vel brincar");
				System.out.println("Escolha um n�mero �mpar e que seja maior ou igual a 3");
			} else {
				System.out.println("------------------------");
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println("------------------------");
				System.out.println("");
				while (partida > contagem) {
					System.out.println("");
					System.out.println("Partida " + (contagem + 1));
					System.out.println("Qual a sua op��o?");
					escolhaUsuario = leitor.nextInt();
					System.out.println("Voc� escolheu " + escolhaUsuario);
					sorteioComputador = computador.nextInt(3) + 1;
					System.out.println("Computador escolheu " + sorteioComputador);

					if (escolhaUsuario == 3) {
						if (sorteioComputador == 1) {
							System.out.println("O computador venceu!");
							pontuacaoComputador = pontuacaoComputador + 1;
							System.out.println(pontuacaoComputador);
						} else if (sorteioComputador == 2) {
							System.out.println("Voc� venceu!");
							pontuacaoUsuario = pontuacaoUsuario + 1;
							System.out.println(pontuacaoUsuario);
						} else {
							System.out.println("Deu empate");
							pontuacaoComputador = pontuacaoComputador + 1;
							pontuacaoUsuario = pontuacaoUsuario + 1;
							System.out.println(pontuacaoComputador + "X" + pontuacaoUsuario);
						}
					} else if (escolhaUsuario == 2) {
						if (sorteioComputador == 1) {
							System.out.println("Voc� venceu!");
							pontuacaoUsuario = pontuacaoUsuario + 1;

						} else if (sorteioComputador == 2) {
							System.out.println("Deu empate!");
							pontuacaoComputador = pontuacaoComputador + 1;
							pontuacaoUsuario = pontuacaoUsuario + 1;

						} else {
							System.out.println("O computador venceu!");
							pontuacaoComputador = pontuacaoComputador + 1;
						}
					} else {
						if (sorteioComputador == 1) {
							System.out.println("Deu empate!");
							pontuacaoComputador = pontuacaoComputador + 1;
							pontuacaoUsuario = pontuacaoUsuario + 1;

						} else if (sorteioComputador == 2) {
							System.out.println("O computador venceu!");
							pontuacaoComputador = pontuacaoComputador + 1;

						} else {
							System.out.println("Voc� venceu!");
							pontuacaoUsuario = pontuacaoUsuario + 1;
						}
					}
					contagem++;
				}

			}
		}

	}
}