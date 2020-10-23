
public class Empregado {
	private String nome, cargo;
	private double salario;

	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void imprimir() {
		System.out.println("Empregado: " + this.nome);
		System.out.println("Cargo: " + this.cargo);
		System.out.printf("Salário: R$ %.2f\n", this.salario);
		System.out.println("------------------------------------");
	}

	public void aumentarSalario(double percentual) {
		this.salario *= percentual/100 + 1;
	}
}
