package entities;

public class df_vetor {

	private String nomes;
	private String email;

	public  df_vetor() {
		
	}
	
	public df_vetor(String nomes, String email) {
		this.nomes = nomes;
		this.email = email;
	
	}
	
	public String getNomes() {
		return nomes;
	}
	public void setNomes(String nomes) {
		this.nomes = nomes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return  nomes + ", " + email ;
	}
	
	
	
}
