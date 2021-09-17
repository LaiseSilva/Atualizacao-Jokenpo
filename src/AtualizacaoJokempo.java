import java.util.Random;
import java.util.Scanner;

public class AtualizacaoJokempo {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Random computador = new Random();
		int partida, escolhaUsuario, sorteioComputador;
		int contagem = 0;
		String resposta = "";
		
		System.out.println("------------------------");
		System.out.println("         JOKENPO        ");
		System.out.println("------------------------");
		System.out.println();

		System.out.print("Quantas partidas? ");
		partida = leitor.nextInt();
		int resto = partida % 2;
		int valorVitoria = (partida / 2) + 1;
		int pontuacaoComputador = 0, pontuacaoUsuario = 0;

		while (partida == 1 || resto == 0) {
			System.out.println("Digite um número que seja ímpar maior ou igual a 3");
			System.out.print("Quantas partidas? ");
			partida = leitor.nextInt();
			resto = partida % 2;
		}
		while (partida > contagem && pontuacaoComputador < valorVitoria && pontuacaoUsuario < valorVitoria) {
			System.out.println("------------------------");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("------------------------");
			System.out.println("");

			System.out.println("Partida " + (contagem + 1));
			System.out.println("Qual a sua opção?");
			escolhaUsuario = leitor.nextInt();
			while (escolhaUsuario >= 4) {
				System.out.println("Digite uma das opções que tenha");
				escolhaUsuario = leitor.nextInt();
			}
			sorteioComputador = computador.nextInt(3) + 1;

			if (escolhaUsuario != 0) {
				if (escolhaUsuario == 1) {
					System.out.println("Você escolheu pedra");
				} else if (escolhaUsuario == 2) {
					System.out.println("Você escolheu papel");
				} else {
					System.out.println("Você escolheu tesoura");
				}

			}

			if (sorteioComputador != 0) {
				if (sorteioComputador == 1) {
					System.out.println("O computador escolheu pedra");
				} else if (sorteioComputador == 2) {
					System.out.println("O computador escolheu papel");
				} else {
					System.out.println("O computador escolheu tesoura");
				}
			}

			if (escolhaUsuario == 3) {
				if (sorteioComputador == 1) {
					System.out.println("O computador venceu!");
					pontuacaoComputador = pontuacaoComputador + 1;

				} else if (sorteioComputador == 2) {
					System.out.println("Você venceu!");
					pontuacaoUsuario = pontuacaoUsuario + 1;

				} else {
					System.out.println("Deu empate");
				}
			} else if (escolhaUsuario == 2) {
				if (sorteioComputador == 1) {
					System.out.println("Você venceu!");
					pontuacaoUsuario = pontuacaoUsuario + 1;

				} else if (sorteioComputador == 2) {
					System.out.println("Deu empate!");

				} else {
					System.out.println("O computador venceu!");
					pontuacaoComputador = pontuacaoComputador + 1;
				}
			} else {
				if (sorteioComputador == 1) {
					System.out.println("Deu empate!");

				} else if (sorteioComputador == 2) {
					System.out.println("O computador venceu!");
					pontuacaoComputador = pontuacaoComputador + 1;

				} else {
					System.out.println("Você venceu!");
					pontuacaoUsuario = pontuacaoUsuario + 1;
				}
			}
			contagem++;
			System.out.println();
			System.out.println("Você " + pontuacaoUsuario + " X " + pontuacaoComputador + " Computador");
		}

		while (pontuacaoComputador == pontuacaoUsuario) {
			System.out.println("--------RODADA DE OURO!--------");
			System.out.println("------------------------");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("------------------------");
			System.out.println("");
			System.out.println("Qual a sua opção?");
			escolhaUsuario = leitor.nextInt();
			while (escolhaUsuario >= 4) {
				System.out.println("Digite uma das opções que tenha");
				escolhaUsuario = leitor.nextInt();
			}
			sorteioComputador = computador.nextInt(3) + 1;

			if (escolhaUsuario != 0) {
				if (escolhaUsuario == 1) {
					System.out.println("Você escolheu pedra");
				} else if (escolhaUsuario == 2) {
					System.out.println("Você escolheu papel");
				} else {
					System.out.println("Você escolheu tesoura");
				}

			}

			if (sorteioComputador != 0) {
				if (sorteioComputador == 1) {
					System.out.println("O computador escolheu pedra");
				} else if (sorteioComputador == 2) {
					System.out.println("O computador escolheu papel");
				} else {
					System.out.println("O computador escolheu tesoura");
				}
			}

			if (escolhaUsuario == 3) {
				if (sorteioComputador == 1) {
					System.out.println("O computador venceu!");
					pontuacaoComputador = pontuacaoComputador + 1;

				} else if (sorteioComputador == 2) {
					System.out.println("Você venceu!");
					pontuacaoUsuario = pontuacaoUsuario + 1;

				} else {
					System.out.println("Deu empate");
				}
			} else if (escolhaUsuario == 2) {
				if (sorteioComputador == 1) {
					System.out.println("Você venceu!");
					pontuacaoUsuario = pontuacaoUsuario + 1;

				} else if (sorteioComputador == 2) {
					System.out.println("Deu empate!");

				} else {
					System.out.println("O computador venceu!");
					pontuacaoComputador = pontuacaoComputador + 1;
				}
			} else {
				if (sorteioComputador == 1) {
					System.out.println("Deu empate!");

				} else if (sorteioComputador == 2) {
					System.out.println("O computador venceu!");
					pontuacaoComputador = pontuacaoComputador + 1;

				} else {
					System.out.println("Você venceu!");
					pontuacaoUsuario = pontuacaoUsuario + 1;
				}
			}
		}

		System.out.println("Jogar novamente?");
		System.out.println("Digite S (para sim) e N (para não)");
		resposta = leitor.next();

		while (resposta.equals("S") || resposta.equals("s")) {
			System.out.println("------------------------");
			System.out.println("         JOKENPO        ");
			System.out.println("------------------------");
			System.out.println();

			System.out.print("Quantas partidas? ");
			partida = leitor.nextInt();
			resto = partida % 2;
			valorVitoria = (partida / 2) + 1;
			pontuacaoComputador = 0;
			pontuacaoUsuario = 0;
			while (partida == 1 || resto == 0) {
				System.out.println("Digite um número que seja ímpar maior ou igual a 3");
				System.out.print("Quantas partidas? ");
				partida = leitor.nextInt();
				resto = partida % 2;
			}
			contagem = 0;
			while (partida > contagem && pontuacaoComputador < valorVitoria && pontuacaoUsuario < valorVitoria) {
				System.out.println("------------------------");
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println("------------------------");
				System.out.println("");

				System.out.println("Partida " + (contagem + 1));
				System.out.println("Qual a sua opção?");
				escolhaUsuario = leitor.nextInt();
				while (escolhaUsuario >= 4) {
					System.out.println("Digite uma das opções que tenha");
					escolhaUsuario = leitor.nextInt();
				}
				sorteioComputador = computador.nextInt(3) + 1;

				if (escolhaUsuario != 0) {
					if (escolhaUsuario == 1) {
						System.out.println("Você escolheu pedra");
					} else if (escolhaUsuario == 2) {
						System.out.println("Você escolheu papel");
					} else {
						System.out.println("Você escolheu tesoura");
					}

				}

				if (sorteioComputador != 0) {
					if (sorteioComputador == 1) {
						System.out.println("O computador escolheu pedra");
					} else if (sorteioComputador == 2) {
						System.out.println("O computador escolheu papel");
					} else {
						System.out.println("O computador escolheu tesoura");
					}
				}

				if (escolhaUsuario == 3) {
					if (sorteioComputador == 1) {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;

					} else if (sorteioComputador == 2) {
						System.out.println("Você venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else {
						System.out.println("Deu empate");
					}
				} else if (escolhaUsuario == 2) {
					if (sorteioComputador == 1) {
						System.out.println("Você venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else if (sorteioComputador == 2) {
						System.out.println("Deu empate!");

					} else {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;
					}
				} else {
					if (sorteioComputador == 1) {
						System.out.println("Deu empate!");

					} else if (sorteioComputador == 2) {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;

					} else {
						System.out.println("Você venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;
					}
				}
				contagem++;
				System.out.println();
				System.out.println("Você " + pontuacaoUsuario + " X " + pontuacaoComputador + " Computador");
			}

			while (pontuacaoComputador == pontuacaoUsuario) {

				System.out.println("--------RODADA DE OURO!--------");
				System.out.println("------------------------");
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println("------------------------");
				System.out.println("");
				System.out.println("Qual a sua opção?");
				escolhaUsuario = leitor.nextInt();
				while (escolhaUsuario >= 4) {
					System.out.println("Digite uma das opções que tenha");
					escolhaUsuario = leitor.nextInt();
				}
				sorteioComputador = computador.nextInt(3) + 1;

				if (escolhaUsuario != 0) {
					if (escolhaUsuario == 1) {
						System.out.println("Você escolheu pedra");
					} else if (escolhaUsuario == 2) {
						System.out.println("Você escolheu papel");
					} else {
						System.out.println("Você escolheu tesoura");
					}

				}

				if (sorteioComputador != 0) {
					if (sorteioComputador == 1) {
						System.out.println("O computador escolheu pedra");
					} else if (sorteioComputador == 2) {
						System.out.println("O computador escolheu papel");
					} else {
						System.out.println("O computador escolheu tesoura");
					}
				}

				if (escolhaUsuario == 3) {
					if (sorteioComputador == 1) {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;

					} else if (sorteioComputador == 2) {
						System.out.println("Você venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else {
						System.out.println("Deu empate");
					}
				} else if (escolhaUsuario == 2) {
					if (sorteioComputador == 1) {
						System.out.println("Você venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;

					} else if (sorteioComputador == 2) {
						System.out.println("Deu empate!");

					} else {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;
					}
				} else {
					if (sorteioComputador == 1) {
						System.out.println("Deu empate!");

					} else if (sorteioComputador == 2) {
						System.out.println("O computador venceu!");
						pontuacaoComputador = pontuacaoComputador + 1;

					} else {
						System.out.println("Você venceu!");
						pontuacaoUsuario = pontuacaoUsuario + 1;
					}
				}
			}

			System.out.println("Jogar novamente?");
			System.out.println("Digite S (para sim) e N (para não)");
			resposta = leitor.next();
		}
		leitor.close();

	}
}