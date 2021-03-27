import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Cadastro dono = new Cadastro();
        Dono dono1 = new Dono("Bruno", "teste@gmail.com");
        Dono dono2 = new Dono("Bruno2", "testeiseuemail@gmail.com");

        
        dono1.mostrarDono();
        dono2.mostrarDono();

        dono.listarDonos();
        
    }
}