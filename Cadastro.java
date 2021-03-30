import java.util.ArrayList;

public class Cadastro {
    //private String nome;
    //private RevistaQuadrinhos[] hq;

    private ArrayList<Dono> donos;
    private ArrayList<RevistaQuadrinhos> hqs;
    
    public Cadastro(){
        donos = new ArrayList<>();
        hqs = new ArrayList<>();

    }

    public boolean cadastraDono(Dono novoDono){
        donos.add(novoDono);
        return true;
    }
    public boolean cadastraHq(RevistaQuadrinhos novoHq){
        hqs.add(novoHq);
        return true;
    }

    public void listarDonos(){
        System.out.println("Donos: ");
        for(Dono dono : donos){
            dono.mostrarDono();
        }
    }
    public void listarHqs(){
        System.out.println("Revistas Quadrinhos: ");
        for(RevistaQuadrinhos hq : hqs){
            hq.mostrarHq();
        }
    }

    public ArrayList<Dono> getDonos(){
        return donos;        
    }
    public ArrayList<RevistaQuadrinhos> getHqs(){
        return hqs;
    }

    public void setDonos(ArrayList<Dono> donos){
        this.donos = donos;
    }
    public void setHqs(ArrayList<RevistaQuadrinhos> hqs){
        this.hqs = hqs;
    }

    /*Retorna uma String com todas as informações dos itens cadastrados, incluso dados do correspondente,
    Caso não tiver itens, retornar "Nenhum item cadastro"*/
    public String pesquisaTudo(){
        return null;
    }

    /*Retorna uma String com todas as informações dos itens cadastrados, incluso dados do correspondente, a partir 
    do ano indicado. Caso não tiver itens, retornar "Nenhum item localizado com este ano"*/
    public void pesquisa(int ano){
        System.out.println("Revistas lançadas no ano de: " + ano);
            for(RevistaQuadrinhos hq : hqs){
                if(hq.getAno() == ano)                
                    hq.mostrarHq();                                            
            }    
    }

    /*Retorna uma String com todas as informações dos itens cadastrados, incluso dados do correspondente, a partir 
    do nome indicado. Caso não tiver itens, retornar "Nenhum dono localizado com este nome"*/
    public void pesquisa(String dono){
            for(RevistaQuadrinhos hq : hqs){
                if(hq.getDonoHq().equals(dono))
                    hq.mostrarHq();
            }
    }
}
