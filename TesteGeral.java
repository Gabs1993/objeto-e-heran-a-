package Gabriel;

public class TesteGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro Thor = new Cachorro ("Thor","\nviralatinha","\nGrande","50","70");
		
		Thor.ImprimirDados();
		System.out.println("\n");
		
		Cavalo P�depano = new Cavalo ("P�dePano","\nMUSTANG","\nGRANDE", "\n2" ,"\npreto");
		
		P�depano.ImprimirDados();
		System.out.println("\n");
		
		Pregui�a Gabriel = new Pregui�a ("Gabriel","\nDOIDO","\nGrande","\nRARA","\nsementes");
		
		Gabriel.ImprimirDados();
		System.out.println("\n");
	}

}
