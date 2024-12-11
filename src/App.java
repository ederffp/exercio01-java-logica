import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
   
        Scanner scan = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("* INSIRA UMA NOTA ENTRE 0 E 10  *");
        System.out.println("*********************************");
    
        System.out.println("-> Insira uma nota: ");
        int nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
 
            System.out.println("valor invalido: " + nota);
            System.out.println("-> Insira novamente um novo valor: ");
            nota = scan.nextInt(); 
        }
    
        System.out.printf("-> Ok voce imprimiu o valor %d", nota );
        scan.close()    ;
    }
}
