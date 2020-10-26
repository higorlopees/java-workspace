package userInterface;

import java.util.ArrayList;
import java.util.Scanner;

import model.QuestaoComDica;
import model.QuestaoMultiplaEscolha;
import model.QuestaoSimples;

public class Simulado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<QuestaoSimples> questoes;
		questoes = new ArrayList<QuestaoSimples>();
		int pontuacao = 0;
		String resposta;
		
		questoes.add(new QuestaoSimples("Quem descobriu o Brasil?", "Pedro �lvares Cabral"));
		questoes.add(new QuestaoComDica("Qual a cor do cavalo branco de Napole�o?", "Marrom", "Cuidado com a pegadinha"));
		questoes.add(new QuestaoMultiplaEscolha("Qual a f�rmula da �gua?", "H2O", "H2O2", "H2O4", "H4O", "H2O"));
		questoes.add(new QuestaoSimples("Quanto � 2 + 2?", "4"));
		
		for(QuestaoSimples q : questoes) {
			System.out.println(q.aplicarQuestao());
			resposta = sc.nextLine();
			if(q.corrigir(resposta)) {
				pontuacao ++;
			} else {
				System.out.println("Errou !! A resposta correta � " + q.getResposta());
			}
		}
		
		System.out.println("Voc� acertou um total de " + pontuacao + "/" + questoes.size());
		
		sc.close();
	}
}
