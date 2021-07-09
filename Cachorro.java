package Gabriel;

public class Cachorro extends Animal {
	
	private String idade;
	private String peso;
	
	
	public Cachorro (String Nome, String Raça, String Tamanho, String peso, String idade)
	{
		super(Nome,Raça,Tamanho);
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
		System.out.println("\nO nome do cachorro é:" +getNome()+ " raça " +getRaça()+ " com o tamanho" +getTamanho()+ " com o peso " +peso+ " e a idade:"+idade);
		
	}
	
	
}


	
	


