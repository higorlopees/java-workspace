import javax.swing.JOptionPane;

public class CartaoPrePagoTeste {
	public static void main(String[] args) {
		int opcao;
		double valor;
		CartaoPrePago c1 = new CartaoCashBack("1234 5678 9101 1121", "Higor Lopes da Silva", 2027, 10, 0, 1);

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma das op��es: \n 1 - Adicionar Cr�dito\n 2 - Comprar\n 3 - Informa��es\n-1 - Sair"));

			switch (opcao) {
			case 1:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a adicionar: "));
				c1.adicionarCredito(valor);
				break;
			case 2:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
				if (c1.comprar(valor)) {
					JOptionPane.showMessageDialog(null, "COMPRA AUTORIZADA");
				} else {
					JOptionPane.showMessageDialog(null, "COMPRA N�O AUTORIZADA");
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, c1.exibirInfo());
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "****** OBRIGADO POR UTILIZAR NOSSO CART�O ******");
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO: OP��O INV�LIDA");
			}
		} while (opcao != -1);
	}
}
