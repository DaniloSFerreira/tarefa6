import java.util.Date;

public class Aluno {
	private String nome;
	private Date data;
	private String frequencia;
	
	public Aluno (String nome, Date data, String frequencia) {
		this.nome = nome;
		this.data = data;
		this.frequencia = frequencia;
	}

	public String getNome() {
		return nome;
	}

	public Date getData() {
		return data;
	}

	public String getFrequencia() {
		return frequencia;
	}
	

}
