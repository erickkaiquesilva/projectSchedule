package ExemploAbstrata;

public class ExemploAbstrata {

	public static void main(String[] args) {
		
		Vendedor v1=new Vendedor(1234,"Jose da Silva",15000,0.10);
		System.out.println(v1);
		
		Horista h1=new Horista(5678,"Maria Oliveira", 40,10);
		System.out.println(h1);
		
		System.out.println("\nNúmero de vendedores= " + 
		                    Vendedor.getContVendedor());
		
		Vendedor v2= new Vendedor(4567, "João Teixeira",30000,0.20);
		System.out.println(v2);

		System.out.println("\nNúmero de vendedores= " + 
                Vendedor.getContVendedor());
	
	
	}

}
