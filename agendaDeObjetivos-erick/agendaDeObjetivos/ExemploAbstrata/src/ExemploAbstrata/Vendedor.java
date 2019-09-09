package ExemploAbstrata;

public class Vendedor extends Funcionario{
	
	// Atributos
	private double vendas; 	// valor das vendas realizadas no mês
	private double taxa;	// taxa de comissão ganho sobre as vendas
	private static int contVendedor=0; 
	
	
	// Construtor
	public Vendedor(int codigo, String nome, double vendas, double taxa)
	{
		super(codigo, nome);   // chamada do construtor da classe mãe
		this.vendas = vendas;
		this.taxa = taxa;
		contVendedor++;
	}

	// Métodos
	
	
	public static int getContVendedor() {
		return contVendedor;
	}

	// Implementação do método abstrato calcSalario
	@Override
	public double calcSalario() {
		return vendas * taxa;
	}

	// Método toString
	@Override
	public String toString() {
		return "Vendedor [" + super.toString() + ", vendas=" + vendas +
				", taxa=" + taxa + ", salário=" + calcSalario() +	"]";
	}

	public double getVendas() {
		return vendas;
	}


	public void setVendas(double vendas) {
		this.vendas = vendas;
	}


	public double getTaxa() {
		return taxa;
	}


	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	
	
	

}
