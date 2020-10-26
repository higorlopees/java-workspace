
public class ContaBancariaEspecial extends ContaBancaria {
	private double limite;

	public ContaBancariaEspecial(String nome, String cpf, int agencia, int conta, int dv, double saldo, double limite) {
		super(nome, cpf, agencia, conta, dv, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void depositar(double valor) {
		if(super.getSaldo() < 0) {
			if(super.getSaldo() + valor <= 0) {
				this.limite += valor;
			} else {
				limite -= super.getSaldo();
			}
		}
		super.depositar(valor);
	}
	
	public boolean sacar(double valor) {
		if(super.sacar(valor)) {
			return true;
		} else if(this.getSaldo() >= 0) {
			if(super.getSaldo() + limite >= valor) {
				super.setSaldo(super.getSaldo() - valor);
				this.limite += super.getSaldo();
				return true;
			} else {
				return false;
			}
		} else {
			if(this.limite >= valor) {
				this.limite -= valor;
				super.setSaldo(super.getSaldo() - valor);
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public String imprimir() {
		return super.imprimir() + "\n	Limite Disponível: R$ " + this.limite;
	}
}
