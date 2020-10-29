package model;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	public float calcularSalario() {
		return this.valorEmpreita;
	}
}
