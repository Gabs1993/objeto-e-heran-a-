package Gabriel;

public class Cachorro extends Animal {
	
	private String idade;
	private String peso;
	
	
	public Cachorro (String Nome, String Ra�a, String Tamanho, String peso, String idade)
	{
		super(Nome,Ra�a,Tamanho);
		this.idade = idade;
		this.peso = peso;
		
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public void ImprimirDados()
	{
		System.out.println("\nO nome do cachorro �:" +getNome()+ " ra�a " +getRa�a()+ " com o tamanho" +getTamanho()+ " com o peso " +peso+ " e a idade:"+idade);
		
	}
	
	
}


	
	


