import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class RevistaQuadrinhos {

	private String nome;	
	private String marca;
	private String colecao;
	private int ano;
	private String donoHq;

	//Construtor de HQ padrão
	public RevistaQuadrinhos(String nome, String marca, String colecao, int ano, String dono) {
		this.nome = nome;
		this.marca = marca;
		this.colecao = colecao;
		this.ano = ano;
		this.donoHq = dono;
	}
	//Construtor de HQ dos Marvel
	public RevistaQuadrinhos(String nome, String colecao, int ano, String dono) {		
		this.marca = "Marvel";
		this.nome = nome;
		this.colecao = colecao;
		this.ano = ano;
		this.donoHq = dono;
	}
	//Construtor de HQ dos Vingadores
	public RevistaQuadrinhos(String nome, int ano, String dono) {
		this.marca = "Marvel";
		this.colecao = "Avengers";
		this.nome = nome;
		this.ano = ano;
		this.donoHq = dono;
	}

	public int getAno(){
		return ano;
	}
	public String getDonoHq() {
		return donoHq;
	}	
    public void mostrarHq() {
        System.out.println(" Nome: " + nome + 
							" Marca: " + marca + 
							" Colecao: " + colecao +
							" Ano: " + ano + 
							" Dono: " + donoHq);
    }

}