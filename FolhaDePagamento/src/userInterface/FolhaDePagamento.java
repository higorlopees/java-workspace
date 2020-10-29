package userInterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		funcionarios.add(new Chefe("Professor Isidro", 2, 40000, 5, 500));
		funcionarios.add(new Horista("Higor Lopes", 3, 35, 180));
		funcionarios.add(new Horista("Joao das Neves", 4, 25, 185));
		funcionarios.add(new Empreiteiro("Zéca do cavaco", 5, 92500));
		funcionarios.add(new Comissionado("Maria das Dores", 6, 4000, 15));
		funcionarios.add(new Comissionado("Dona Flor", 7, 4000, 17));
		funcionarios.add(new Comissionado("Ana Julia", 8, 4000, 13));
		
		for(Funcionario f : funcionarios) {
			System.out.println("----------------------\n" + f.getNome() + " (" + f.getNumeroRegistro() + ") \n" + "Salário: R$ " + String.format("%.2f", f.calcularSalario()));
		}
	}
}
