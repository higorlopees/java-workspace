
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado emp1;
		emp1 = new Empregado();
		
		emp1.setNome("Higor Lopes da Silva");
		emp1.setCargo("Analista de Suporte de TI Pleno");
		emp1.setSalario(100);
		
		emp1.imprimir();
		
		emp1.aumentarSalario(25);
		
		emp1.imprimir();
	}
}
