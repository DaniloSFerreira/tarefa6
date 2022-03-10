import java.util.ArrayList;
import java.util.List;

public class AlunosDB {
	
	private List<Aluno> alunoLista = new ArrayList<Aluno>();
	
	public List<Aluno> getAlunoLista() {
		return alunoLista;
	}
	public void addNovoAluno(Aluno aluno) {
		alunoLista.add(aluno);
	}
}
