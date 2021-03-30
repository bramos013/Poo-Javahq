
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner donos = new Scanner(System.in);
        Scanner hqs = new Scanner(System.in);
        Cadastro dono = new Cadastro();
        Cadastro hq = new Cadastro();      
                    
        //Menu
        boolean continua = true;
            while(continua){

            System.out.println(" ,-----.                           ,--.          ,-----.                    ,--.");                
            System.out.println(" '  .-.  ' ,--.--.  ,--,--.  ,---. |  |  ,---.  '  .--./  ,---.  ,--,--,--. `--'  ,---.  ,---.");                  
            System.out.println(" |  | |  | |  .--' ' ,-.  | | .--' |  | | .-. : |  |     | .-. | |        | ,--. | .--' (  .-'");                  
            System.out.println(" '  '-'  ' |  |    | '-'  | | `--. |  | |   --. '  '--'| ' '-' ' |  |  |  | |  | | `--. .-'  `)");                 
            System.out.println("  `-----'  `--'     `--`--'  `---' `--'  `----'  `-----'  `---'  `--`--`--' `--'  `---' `----'");                  

            System.out.println("\n\tOlá Padawan, Seja bem vindo\n");
            System.out.println("\tO que você deseja fazer?");
            System.out.println("\t1 - Mostrar HQ's cadastradas");
            System.out.println("\t2 - Pesquisar HQ's por ano de lançamento");
            System.out.println("\t3 - Pesquisar HQ's por nome do dono");
            System.out.println("\t4 - Sair");
            System.out.println("\t5 - Cadastrar Dono");
            System.out.println("\t6 - Cadastrar HQ");

        int opt = menu.nextInt();
        switch (opt) {
            case 1:
                System.out.println("");
                break;

            case 2:
                System.out.print("\n\n");
                break;

            case 3:
                System.out.print("\n\n");
                break;
            case 4:    
                System.out.println("Que a força esteja com você jovem Padawan, Até logo!\n ");
                continua = false;
                break;

            
            case 5:    //Funcionalidade OK
                System.out.println("Informe o nome do Dono: ");
                String nomeDono = donos.nextLine();
                System.out.println("Informe o email do Dono: ");
                String email = donos.nextLine();
                Dono novoDono = new Dono(nomeDono, email);
                dono .cadastraDono(novoDono);

                dono.listarDonos();                
                break;

            case 6:    
            System.out.println("Qual a sua marca: ");
                    String marca = hqs.nextLine();                             
            System.out.println("Informe o nome do HQ: ");
                    String nomeHq = hqs.nextLine();    
            System.out.println("Coleção: ");
                    String colecao = hqs.nextLine();
                    System.out.println("Dono: ");
                    String donoHq = hqs.nextLine();
                    System.out.println("Ano de Lançamento: ");
                    int ano = hqs.nextInt();



           RevistaQuadrinhos novoHq8 = new RevistaQuadrinhos(marca,nomeHq,colecao,ano,donoHq);
            //RevistaQuadrinhos novoHq = new RevistaQuadrinhos("nomeHq","colecao","ano");
            RevistaQuadrinhos novoHq = new RevistaQuadrinhos("Vingadores - Ultimato", 2019, "Bruno");
            RevistaQuadrinhos novoHq1 = new RevistaQuadrinhos("Vingadores - Ultron", 2019, "Bruno");
            RevistaQuadrinhos novoHq2 = new RevistaQuadrinhos("Vingadores - Ultimato", 2012, "Bruno");
            RevistaQuadrinhos novoHq3 = new RevistaQuadrinhos("Vingadores - Ultimato", 2013, "Bruno");
            RevistaQuadrinhos novoHq4 = new RevistaQuadrinhos("Vingadores - Ultimato", 2014, "Bruno");
            hq .cadastraHq(novoHq);            
            hq .cadastraHq(novoHq1);
            hq .cadastraHq(novoHq2);
            hq .cadastraHq(novoHq3);
            hq .cadastraHq(novoHq4);            
            hq .cadastraHq(novoHq8);            
            break;
            case 7:
        int lanc = 2019;
            hq.pesquisa(lanc);
            break;
            case 8:
            String nomDono = "Benicio";
                hq.pesquisa(nomDono);
                break;
            default:  //Funcionalidade OK
                System.out.print("\nOpção Inválida!\nPaciência você deve ter, meu jovem Padawan\n\n");                
                break;
            }
        }   
    }
}