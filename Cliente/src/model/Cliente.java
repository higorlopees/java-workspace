package model;

public class Cliente {
	private String nome, email;
	private double linhaCredito, valorFatura;
	
	public Cliente(String nome, String email, double linhaCredito, double valorFatura) {
		this.nome = nome;
		this.email = email;
		this.linhaCredito = linhaCredito;
		this.valorFatura = valorFatura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getLinhaCredito() {
		return linhaCredito;
	}

	public void setLinhaCredito(double linhaCredito) {
		this.linhaCredito = linhaCredito;
	}

	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	public void pagarFatura(double valor) {
		this.valorFatura -= valor;
	}
	
	public boolean comprar(double valor) {
		if(this.valorFatura + valor <= this.linhaCredito) {
			this.valorFatura += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public String exibirFatura() {
		return "-------------------------- Fatura --------------------------" +
			   "\nNome: " + this.nome +
			   "\nE-mail: " + this.email +
			   "\nLimite total: R$ " + String.format("%.2f", this.linhaCredito) +
			   "\nValor da fatura: R$ " + String.format("%.2f", this.valorFatura);
	}
}
