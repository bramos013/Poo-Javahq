import java.util.ArrayList;

public class Cadastro {
    private String nome;
    private RevistaQuadrinhos[] hq;

    private ArrayList<Dono> donos;
    private ArrayList<RevistaQuadrinhos> hqs;
    
    public Cadastro(){
        donos = new ArrayList<>();
            carregarDonos();
        hqs = new ArrayList<>();
            carregarHqs();

    }

    public void carregarDonos(){
        donos.add(new Dono("Benicio","benicio@gmail.com"));
        donos.add(new Dono("Carol","carol@gmail.com"));
        donos.add(new Dono("Douglas","doug@gmail.com"));
        donos.add(new Dono("Marina","marimm@gmail.com"));
        donos.add(new Dono("Pedro","pedro@hotmail.com"));
        donos.add(new Dono("Sebastião","sebastiano@gmail.com"));
    }
    public void carregarHqs(){
        hqs.add(new RevistaQuadrinhos("A Queda do Morcego","DC","Batman",2011,"Pedro"));
        hqs.add(new RevistaQuadrinhos("Vivo ou Morto","Marvel","DeadPool",2020,"Sebastião"));
        hqs.add(new RevistaQuadrinhos("Lendas do Homem de Aço","DC","Superman",1998,"Carol"));
        hqs.add(new RevistaQuadrinhos("A Manopla","Marvel","Homem de Ferro",2017,"Bruno"));
        hqs.add(new RevistaQuadrinhos("Mundo Sombrio","Marvel","Thor",2018,"Marina"));    
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
