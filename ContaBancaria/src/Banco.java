import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria c1 = new ContaBancaria("Higor Lopes", "123.123.123-12", 1234, 12345, 6);

		do {
			System.out.println("Selecione uma das op��es: \n 1 - Dep�sito\n 2 - Saque\n 3 - Informa��es\n-1 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o valor a depositar: ");
				valor = sc.nextInt();
				c1.depositar(valor);
				break;
			case 2:
				System.out.println("Digite o valor a sacar: ");
				valor = sc.nextInt();

				if (c1.sacar(valor)) {
					System.out.println("SAQUE AUTORIZADO");
				} else {
					System.out.println("SAQUE N�O AUTORIZADO");
				}
				break;
			case 3:
				c1.imprimir();
				break;
			case -1:
				System.out.println("****** OBRIGADO POR FAZER PARTE DO NOSSO BANCO ******");
				break;
			default:
				System.out.println("ERRO: OP��O INV�LIDA");
			}
		} while (opcao != -1);

		sc.close();
	}
}
