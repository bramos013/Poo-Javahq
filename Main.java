
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner subMenu = new Scanner(System.in);
        Scanner donoRevista = new Scanner(System.in);
        Scanner donos = new Scanner(System.in);
        Scanner hqs = new Scanner(System.in);
        Cadastro dono = new Cadastro();
        Cadastro hq = new Cadastro();      
        
        System.out.println(" ,-----.                           ,--.          ,-----.                    ,--.");                
        System.out.println(" '  .-.  ' ,--.--.  ,--,--.  ,---. |  |  ,---.  '  .--./  ,---.  ,--,--,--. `--'  ,---.  ,---.");                  
        System.out.println(" |  | |  | |  .--' ' ,-.  | | .--' |  | | .-. : |  |     | .-. | |        | ,--. | .--' (  .-'");                  
        System.out.println(" '  '-'  ' |  |    | '-'  | | `--. |  | |   --. '  '--'| ' '-' ' |  |  |  | |  | | `--. .-'  `)");                 
        System.out.println("  `-----'  `--'     `--`--'  `---' `--'  `----'  `-----'  `---'  `--`--`--' `--'  `---' `----'");                  
        System.out.println("\n\tOlá Padawan, Seja bem vindo\n");
        //Menu
        boolean continua = true;
            while(continua){

            System.out.println("\tO que você deseja fazer?");
            System.out.println("\t1 - Cadastrar");
            System.out.println("\t2 - Pesquisar");
            System.out.println("\t3 - Sair");

            int opt = menu.nextInt();
            switch (opt) {
                case 1:  //Opção de escolha Cadastro OK
                    System.out.println("\t1 - Cadastrar Dono");
                    System.out.println("\t2 - Cadastrar HQ");
                    System.out.println("\t3 - Sair");                      
                    System.out.println("\t4 - Retornar");   

                    int opt2 = subMenu.nextInt();                      
                    switch (opt2){  
                        case 1: //Cadastro Dono OK
                            System.out.println("Informe o nome do Dono: ");
                                String nomeDono = donos.nextLine();
                            System.out.println("Informe o email do Dono: ");
                                String email = donos.nextLine();
                            Dono novoDono = new Dono(nomeDono, email);
                                dono .cadastraDono(novoDono);                                       
                        break;
                        
                        case 2: //Cadastro HQ                           
                            System.out.println("\t1 - Cadastrar HQ Diversos");
                            System.out.println("\t2 - Cadastrar HQ Dos Vingadores");
                            System.out.println("\t3 - Sair");                      
                            System.out.println("\t4 - Retornar");                              

                            int opt3 = subMenu.nextInt();                      
                            switch (opt3){                    
                                case 1:  //Cadastro HQ Diversos     
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
                                     
                                    RevistaQuadrinhos novoHq5 = new RevistaQuadrinhos(marca,nomeHq,colecao,ano,donoHq);
                                        hq .cadastraHq(novoHq5);            
                                break;

                                case 2:  //Cadastro HQ Marvel
                                    RevistaQuadrinhos novoHq = new RevistaQuadrinhos("Vingadores - Ultimato", 2019, "Bruno");
                                        hq .cadastraHq(novoHq);            
                                    RevistaQuadrinhos novoHq1 = new RevistaQuadrinhos("Vingadores - Ultron", 2019, "Bruno");
                                        hq .cadastraHq(novoHq1);                            
                                    RevistaQuadrinhos novoHq2 = new RevistaQuadrinhos("Vingadores - Ultimato", 2012, "Bruno");
                                        hq .cadastraHq(novoHq2);
                                    RevistaQuadrinhos novoHq3 = new RevistaQuadrinhos("Vingadores - Ultimato", 2013, "Bruno");
                                        hq .cadastraHq(novoHq3);                            
                                    RevistaQuadrinhos novoHq4 = new RevistaQuadrinhos("Vingadores - Ultimato", 2014, "Bruno");
                                        hq .cadastraHq(novoHq4);      
                                break;

                                case 3:  //Sair
                                    System.out.println("Que a força esteja com você jovem Padawan, Até logo!\n ");
                                    continua = false;
                                break;

                                
                            }
                        break;                

                        case 3:
                            System.out.println("Que a força esteja com você jovem Padawan, Até logo!\n ");
                                continua = false;
                        break;     
                    }
                break;

                case 2:
                    System.out.println("\t1 - Pesquisar Por Ano Lançamento");
                    System.out.println("\t2 - Pesquisar Por Dono");
                    System.out.println("\t3 - Sair");                      
                    System.out.println("\t4 - Retornar");
                    int opt4 = subMenu.nextInt();
                    switch (opt4){
                        case 1:
                            System.out.println("Informe o ano de lançamento do HQ:");                            
                            int lanc = subMenu.nextInt();
                                hq.pesquisa(lanc);
                        break;
                        case 2:                        
                        System.out.println("Informe o Dono do HQ:");                            
                        String nomDono = donoRevista.nextLine();
                            hq.pesquisa(nomDono);
                    break;
                        case 3: //Opção Encerrar
                            System.out.println("Que a força esteja com você jovem Padawan, Até logo!\n ");
                                continua = false;
                        break;
                    }
                break;                                        

                case 3: //Opção Encerrar
                    System.out.println("Que a força esteja com você jovem Padawan, Até logo!\n ");
                        continua = false;
                break;
                
            }
        }  
    }
}