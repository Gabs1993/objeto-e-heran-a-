package Gabriel;

public class Pregui�a extends Animal {
	
	private String Especie;
	private String Alimenta��o;
	

	public Pregui�a (String Nome, String Ra�a, String Tamanho, String Especie, String Alimenta��o)
	{
		super(Nome,Ra�a,Tamanho);
		this.Especie = Especie;
		this.Alimenta��o = Alimenta��o;
	}


	public String getEspecie() {
		return Especie;
	}


	public void setEspecie(String especie) {
		Especie = especie;
	}


	public String getAlimenta��o() {
		return Alimenta��o;
	}


	public void setAlimenta��o(String alimenta��o) {
		Alimenta��o = alimenta��o;
	}
	
	public void ImprimirDados()
	{
		System.out.println("\nO nome �: " +getNome()+ " com o tamanho: " +getTamanho()+ "  e a especie: " +Especie+ " e ela(a) se alimenta de "+Alimenta��o);
	}
	
	
	
	

}
