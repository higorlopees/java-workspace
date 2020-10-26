package core;

public class BombaDeCombustivel {
	private String nome;
	private double precoLitro, qtdeLitros, totalPagar;
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdeLitros() {
		return qtdeLitros;
	}

	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	public void abastecerPorLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
		this.totalPagar = this.qtdeLitros * this.precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.qtdeLitros = valor / this.precoLitro;
		this.totalPagar = valor;
	}
	
	public String exibirRecibo() {
		return " ***** OBRIGADO POR ABASTECER CONOSCO ***** \n      Valor total a pagar: R$ " + String.format("%.2f", this.totalPagar) + "\n     " + "Quantidade de litros: " + String.format("%.3f", this.qtdeLitros) + "L\n      " + "Preço por litro: RS " + String.format("%.3f", this.precoLitro); 
	}
}
