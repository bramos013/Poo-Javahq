public class RevistaQuadrinhos {

	private String nome;	
	private String marca;
	private String colecao;
	private int ano;
	private Dono[] dono;

	//Construtor de HQ padrão
	public RevistaQuadrinhos(String nome, String marca, String colecao, int ano, Dono[] dono) {
		this.nome = nome;
		this.marca = marca;
		this.colecao = colecao;
		this.ano = ano;
		this.dono = dono;
	}
	//Construtor de HQ dos Marvel
	public RevistaQuadrinhos(String nome, String colecao, int ano, Dono[] dono) {
		this.nome = nome;
		this.marca = "Marvel";
		this.colecao = colecao;
		this.ano = ano;
		this.dono = dono;
	}
	//Construtor de HQ dos Vingadores
	public RevistaQuadrinhos(String nome, int ano, Dono[] dono) {
		this.nome = nome;
		this.marca = "Marvel";
		this.colecao = "Avengers";
		this.ano = ano;
		this.dono = dono;
	}
}