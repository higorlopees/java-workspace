
public class CartaoCashBack extends CartaoPrePago {
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		switch(this.tipo) {
		case 1:
			return super.comprar(valor * 0.92);
		case 2:
			return super.comprar(valor * 0.95);
		case 3: 
			return super.comprar(valor * 0.98);
		default:
			return false;
		}
	}
	
	
}
