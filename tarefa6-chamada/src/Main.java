import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	static AlunosDB alunosDB = new AlunosDB();
	
	public static void main (String[]args) throws ParseException {
		
		System.out.println("Chamada do dia");
		
		int opcao;
		
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir novo registro: ");
			System.out.println("2 - Exibir lista de chamada");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Qual opção deseja realizar? ");
			opcao = scanner.nextInt();
			
			process(opcao);
		}while(opcao != 0);
		
		
	}
	public static void process (int opcao) throws ParseException {
		switch (opcao) {
		case 1: {
			Scanner scanner = new Scanner (System.in);
			
			System.out.println("Qual o nome do aluno?");
			String nome = scanner.next();
			
			System.out.println("Informe a data desejada: ");
			String dataString = scanner.next();
			
			System.out.println("Insira a frequência:");
			String frequencia = scanner.next();
			
		
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
			
			Aluno novoAluno = new Aluno(nome, data, frequencia);
			
			alunosDB.addNovoAluno(novoAluno);
			
			break;
			
		}
		case 2: {
			List<Aluno> listaAlunos = alunosDB.getAlunoLista();
			
			for (Aluno aluno : listaAlunos) {
				System.out.println("O nome do aluno é: " + aluno.getNome());
				System.out.println(" ");
				System.out.println("Dia: " + aluno.getData());
				System.out.println(" ");
				System.out.println("Frequência: " + aluno.getFrequencia());
				System.out.println("-------------------------- ");
			} break;
			
			
			
		}
		
		}
	}
}
