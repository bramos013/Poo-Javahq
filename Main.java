import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Scanner donos = new Scanner(System.in);
        Cadastro dono = new Cadastro();
        
                //Área de Teste
                //dono1.mostrarDono();
                //dono2.mostrarDono();
                //donos.listarDonos();
        
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
            case 5:    
                System.out.println("Informe o nome do Dono: ");
                String nome = donos.nextLine();
                System.out.println("Informe o email do Dono: ");
                String email = donos.nextLine();
                             
                Dono novoDono = new Dono(nome, email);
                dono .cadastraDono(novoDono);

                dono.listarDonos();                
                break;
            default:
                System.out.print("\nOpção Inválida!\nPaciência você deve ter, meu jovem Padawan\n\n");
                break;
            }
        }   
    }
}