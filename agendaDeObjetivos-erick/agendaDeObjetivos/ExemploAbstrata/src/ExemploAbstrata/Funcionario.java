package ExemploAbstrata;

public abstract class Funcionario {
	// Atributos
	private int codigo;
	private String nome;
	
	// Construtor
	public Funcionario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// Métodos
	
	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + "]";
	}

	// Método abstrato
	public abstract double calcSalario();
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
