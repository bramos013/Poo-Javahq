import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Cadastro dono = new Cadastro();
        Dono dono1 = new Dono("Bruno", "teste@gmail.com");
        Dono dono2 = new Dono("Bruno2", "testeiseuemail@gmail.com");

        
                //Área de Teste
                dono1.mostrarDono();
                dono2.mostrarDono();
                dono.listarDonos();
        
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
            default:
                System.out.print("\nOpção Inválida!\nPaciência você deve ter, meu jovem Padawan\n\n");
                break;
            }
        }   
    }
}