package Gabriel;

public class Animal {
	
	private String Nome;
	private String Raça;
	private String Tamanho; 
	
	
	public Animal (String Nome, String Raça, String Tamanho)
	{
		this.Nome = Nome;
		this.Raça = Raça;
		this.Tamanho = Tamanho;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getRaça() {
		return Raça;
	}


	public void setRaça(String raça) {
		Raça = raça;
	}


	public String getTamanho() {
		return Tamanho;
	}


	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}	
	
	public void StatusCachorro() {
		
		if(getNome().length()!=2);
		{
			System.out.println("\nEle está muito feliz:");
		}
		else
		{
			
		}
	}
	
	
}
	
	
			
	
	
		
	
		
	
	
	
