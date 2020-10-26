package model;

public class QuestaoMultiplaEscolha extends QuestaoSimples {
	private String altA, altB, altC, altD;

	public QuestaoMultiplaEscolha(String enunciado, String resposta, String altA, String altB, String altC,
			String altD) {
		super(enunciado, resposta);
		this.altA = altA;
		this.altB = altB;
		this.altC = altC;
		this.altD = altD;
	}
	
	public String aplicarQuestao() {
		return super.aplicarQuestao() +
				"\na) " + this.altA +
				"\nb) " + this.altB +
				"\nc) " + this.altC +
				"\nd) " + this.altD;
	}
}
