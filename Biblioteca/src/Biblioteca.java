
public class Biblioteca {
	public static void main(String[] args) {
		Livro l1, l2, l3;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		
		l1.setTitulo("Java Básico");
		l1.setAutor("Isidro");
		l1.setAnoPublicacao(2020);
		l1.setCategoria("Terror");
		l1.setNumEstante(1);
		l1.setNumPrateleira(2);
		l1.emprestar();

		l2.setTitulo("Java Orientado a Objetos");
		l2.setAutor("Isidro");
		l2.setAnoPublicacao(2020);
		l2.setCategoria("2020");
		l2.setNumEstante(1);
		l2.setNumPrateleira(3);
		l2.devolver();
		
		l3.setTitulo("Java Web");
		l3.setAutor("Isidro");
		l3.setAnoPublicacao(2020);
		l3.setCategoria("Ciências Ocultas");
		l3.setNumEstante(1);
		l3.setNumPrateleira(4);
		l3.devolver();
		
		l1.exibirInfo();
		l2.exibirInfo();
		l3.exibirInfo();
	}
}
