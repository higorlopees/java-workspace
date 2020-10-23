
public class Livro {
	private String titulo, autor, categoria;
	private int anoPublicacao, numEstante, numPrateleira;
	private boolean emprestado;

	public void exibirInfo() {
		System.out.println("Livro:  " + this.titulo);
		System.out.println("	Autor: " + this.autor + " (" + this.anoPublicacao + ")");
		System.out.println("	Categoria: " + this.categoria);
		System.out.println("	Localização: E" + this.numEstante + " P" + this.numPrateleira);

		if (emprestado) {
			System.out.println("	LIVRO EMPRESTADO");
		} else {
			System.out.println("	LIVRO DISPONÍVEL");
		}

		System.out.println("--------------------------------------------------------------");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getNumEstante() {
		return numEstante;
	}

	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	public int getNumPrateleira() {
		return numPrateleira;
	}

	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public void emprestar() {
		this.emprestado = true;
	}

	public void devolver() {
		this.emprestado = false;
	}
}
