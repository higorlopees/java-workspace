package model;

public class ClienteFiel extends Cliente{
	private double descontoCompra;

	public ClienteFiel(String nome, String email, double linhaCredito, double valorFatura, double descontoCompra) {
		super(nome, email, linhaCredito, valorFatura);
		this.descontoCompra = descontoCompra;
	}

	public double getDescontoCompra() {
		return descontoCompra;
	}

	public void setDescontoCompra(double descontoCompra) {
		this.descontoCompra = descontoCompra;
	}
	
	public boolean comprar(double valor) {
		return super.comprar(valor - this.descontoCompra);
	}
}
