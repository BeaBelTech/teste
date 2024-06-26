

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	
	
	// Construtor
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	
	// Getter / Setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// Metodos


	@Override
	public String toString() {
		return "Cliente{" +
				"nome='" + nome + '\'' +
				", cpf='" + cpf + '\'' +
				", telefone='" + telefone + '\'' +
				'}';
	}
}
