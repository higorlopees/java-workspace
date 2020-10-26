
import javax.swing.JOptionPane;

public class Banco {
	public static void main(String[] args) {
		int opcao;
		double valor;
		ContaBancaria c1 = new ContaBancariaEspecial("Higor Lopes", "123.123.123-12", 1234, 12345, 6, 1000, 2000);

		do {
			//System.out.println("Selecione uma das op��es: \n 1 - Dep�sito\n 2 - Saque\n 3 - Informa��es\n-1 - Sair");
			//opcao = sc.nextInt();
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das op��es: \n 1 - Dep�sito\n 2 - Saque\n 3 - Informa��es\n-1 - Sair"));

			switch (opcao) {
			case 1:
				//System.out.println("Digite o valor a depositar: ");
				//valor = sc.nextInt();
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a depositar: "));
				c1.depositar(valor);
				break;
			case 2:
				//System.out.println("Digite o valor a sacar: ");
				//valor = sc.nextInt();
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar: "));
				if (c1.sacar(valor)) {
					//System.out.println("SAQUE AUTORIZADO");
					JOptionPane.showMessageDialog(null, "SAQUE AUTORIZADO");
				} else {
					//System.out.println("SAQUE N�O AUTORIZADO");
					JOptionPane.showMessageDialog(null, "SAQUE N�O AUTORIZADO");
				}
				break;
			case 3:
				//c1.imprimir();
				JOptionPane.showMessageDialog(null, c1.imprimir());
				break;
			case -1:
				//System.out.println("****** OBRIGADO POR FAZER PARTE DO NOSSO BANCO ******");
				JOptionPane.showMessageDialog(null, "****** OBRIGADO POR FAZER PARTE DO NOSSO BANCO ******");
				break;
			default:
				//System.out.println("ERRO: OP��O INV�LIDA");
				JOptionPane.showMessageDialog(null, "ERRO: OP��O INV�LIDA");
			}
		} while (opcao != -1);
	}
}
