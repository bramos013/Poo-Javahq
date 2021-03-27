import java.util.ArrayList;

public class Cadastro {
    private String nome;
    private RevistaQuadrinhos[] hq;

    private ArrayList<Dono> donos;


    //Classe para testar o carregamento do Array
    public void carregarDonos() {
        donos.add(new Dono("João Silva", "000.000.00-00"));
        donos.add(new Dono("João Silva", "000.000.00-00"));
        donos.add(new Dono("João Silva", "000.000.00-00"));
        donos.add(new Dono("João Silva", "000.000.00-00"));
    }

    public Cadastro(){
        donos = new ArrayList<>();
        carregarDonos();
    }

    public boolean cadastraDono(Dono novoDono){
        donos.add(novoDono);
        return true;
    }

    public void listarDonos(){
        System.out.println("Donos: ");
        for(Dono dono : donos){
            dono.mostrarDono();
        }
    }

    public ArrayList<Dono> getDonos(){
        return donos;
    }

    public void setDonos(ArrayList<Dono> donos){
        this.donos = donos;
    }
    /*public static void pesquisaDonos(){
        System.out.println("Donos: ");
        for (Dono dono : donos){
            dono.mostrarDono();            
        }
    }*/



    /*Retorna uma String com todas as informações dos itens cadastrados, incluso dados do correspondente,
    Caso não tiver itens, retornar "Nenhum item cadastro"*/
    public String pesquisaTudo(){
        return null;
    }

    /*Retorna uma String com todas as informações dos itens cadastrados, incluso dados do correspondente, a partir 
    do ano indicado. Caso não tiver itens, retornar "Nenhum item localizado com este ano"*/
    public String pesquisa(int ano){
        return null;
    }

    /*Retorna uma String com todas as informações dos itens cadastrados, incluso dados do correspondente, a partir 
    do nome indicado. Caso não tiver itens, retornar "Nenhum dono localizado com este nome"*/
    public String pesquisa(String dono){
        return null;
    }
}
