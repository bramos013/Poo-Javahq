public class Dono {

	private String nome;
	private String email;
	private RevistaQuadrinhos[] hq;

	public Dono(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostrarDono() {
        System.out.println("Nome: " + nome + ", Email: " + email);
    }  
	
}
