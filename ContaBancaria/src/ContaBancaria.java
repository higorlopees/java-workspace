
public class ContaBancaria {
	private String nome, cpf;
	private int agencia, conta, dv;
	private double saldo;

	public ContaBancaria(String nome, String cpf, int agencia, int conta, int dv, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.dv = dv;
		this.saldo = saldo;
	}

	public ContaBancaria(String nome, String cpf, int agencia, int conta, int dv) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.dv = dv;
		this.saldo = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getDv() {
		return dv;
	}

	public void setDv(int dv) {
		this.dv = dv;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void imprimir() {
		System.out.println("Conta bancária: " + this.nome + " - " + this.cpf);
		System.out.println("		Agência: " + this.agencia + " Conta corrente: " + this.conta + "-" + this.dv);
		System.out.printf("		Saldo em conta: R$ %.2f\n", this.saldo);
		System.out.println("------------------------------------------------------");
	}
}
