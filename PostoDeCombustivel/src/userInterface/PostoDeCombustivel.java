package userInterface;

import javax.swing.JOptionPane;

import core.BombaDeCombustivel;

public class PostoDeCombustivel {
	public static void main(String[] args) {
		int opcao, nBomba;
		String opcoes = "";
		BombaDeCombustivel bombas[] = new BombaDeCombustivel[5];
		
		bombas[0] = new BombaDeCombustivel("Gasolina Comum", 4.194);
		bombas[1] = new BombaDeCombustivel("Gasolina Aditivada", 4.394);
		bombas[2] = new BombaDeCombustivel("Gasolina Podium", 5.994);
		bombas[3] = new BombaDeCombustivel("Etanol", 2.594);
		bombas[4] = new BombaDeCombustivel("Diesel", 4.004);
		
		for(int i = 0; i < bombas.length; i ++) {
			opcoes += i + " - " + bombas[i].getNome() + "\n";
		}
		
		do {
			nBomba = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de combustível: \n" + opcoes + "-1 - Sair\n"));
			opcao = (nBomba != -1) ? Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções: \n 1 - Abastecer por litro\n 2 - Abastecer por valor\n-2 - Voltar\n-1 - Sair\n")) : -1;

			switch (opcao) {
			case 1:
				bombas[nBomba].abastecerPorLitros(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros desejada: ")));
				JOptionPane.showMessageDialog(null, bombas[nBomba].exibirRecibo());
				break;
			case 2:
				bombas[nBomba].abastecerPorValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: ")));
				JOptionPane.showMessageDialog(null, bombas[nBomba].exibirRecibo());
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "****** OBRIGADO POR ABASTECER CONOSCO ******");
				break;
			case -2:
				break;
			default:
				JOptionPane.showMessageDialog(null, "ERRO: OPÇÃO INVÁLIDA");
			}
		} while (opcao != -1);
	}
}
