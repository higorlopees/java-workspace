package model;

public class Comissionado extends Funcionario {
	private float salarioBase, comissao;

	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return this.salarioBase * (1 + (this.comissao / 100));
	}
}
