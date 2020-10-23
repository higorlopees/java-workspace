
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado emp1;
		emp1 = new Empregado("Higor Lopes da Silva", "Analista de Suporte de TI Pleno", 100);
		
		emp1.imprimir();
		
		emp1.aumentarSalario(25);
		
		emp1.imprimir();
	}
}
