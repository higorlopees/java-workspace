package userInterface;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cliente;
import model.ClienteFiel;

public class ClienteTeste {
	public static void main(String[] args) {
		int opcao, nCliente;
		double valor;
		String opcoes = "";
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
		
		clientes.add(new Cliente("Higor Lopes", "higor.silva@itau-unibanco.com.br", 20000, 0));
		clientes.add(new Cliente("Joao das Neves", "joao.neves@itau-unibanco.com.br", 200, 0));
		clientes.add(new ClienteFiel("Professor Isidro", "professor.isidro@isidrocompany.com.br", 20000, 0, 15));
		clientes.add(new ClienteFiel("Neymar Junior", "njr11@hotmail.com", 1000000000, 0, 500));
		clientes.add(new ClienteFiel("Jeff Bezos", "jeff.bezos@amazon.com", 1000000000000.0, 10000, 10000));
		
		for(Cliente c : clientes) {
			opcoes += clientes.indexOf(c) + " - " + c.getNome() + '\n';
		}
		
		do {
			nCliente = Integer.parseInt(JOptionPane.showInputDialog("Selecione o cliente: \n" + opcoes + "-1 - Sair\n"));
			opcao = (nCliente != -1) ? Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione uma das -opções: \n 1 - Pagar fatura\n 2 - Comprar\n 3 - Exibir fatura\n-2 - Voltar\n-1 - Sair")) : -1;

			switch (opcao) {
			case 1:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a adicionar: "));
				clientes.get(nCliente).pagarFatura(valor);
				break;
			case 2:
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da compra: "));
				if (clientes.get(nCliente).comprar(valor)) {
					JOptionPane.showMessageDialog(null, "COMPRA AUTORIZADA");
				} else {
					JOptionPane.showMessageDialog(null, "COMPRA NÃO AUTORIZADA");
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, clientes.get(nCliente).exibirFatura());
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "****** OBRIGADO POR UTILIZAR NOSSO CARTÃO ******");
				break;
			case -2:
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO: OPÇÃO INVÁLIDA");
			}
		} while (opcao != -1);
	}
}
