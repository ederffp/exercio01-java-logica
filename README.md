<h2> Algoritmo 01 - Pratica de algoritmos em Java </h2>

<h2> Sobre: </h2>

- Algoritmo solicita ao usuário um valor de tipo inteiro na qual seu minimo é 0 e seu maximo limite é 10

<h3> Codigo: </h3>

```java
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
        scan.close();
    }
}
```

<h3> Analise: </h3>

- Importamos a classe <b>Scanner</b>, que tem por finalidade coletar a entrada (informação) do usuário.
- Declaração da classe da aplicação.
- Declaração da classe main da aplicação.
- Solicitação da entrada com o metodo <b>println</b>
- Declaração da variavel de tipo inteiro para coletar a entrada do usuário, veja que estamos atribuindo diretamente o valor da entrada para ser coletada pela classe <b>Scanner</b>.
- Criamos um loop <b>While</b> que contém a condição <b>(nota < 0 || nota > 10)</b> ele irá imprimir mensagem de valor invalido, porque estamos nesse loop testanto a validade da informação, ou seja, valores abaixo de 0 ou acima de 10.
- Caso os valores for divergentes o programa irá solicitar novamente os valores atraves de: <b> System.out.Println("-> Insira novamente um novo valor: )"</b>
- Perceba que novamente estamos socilicitando novamente a entrada(coleta) de novo valor: <b>nota = scan.nextInt();</b>
- Fora do loop while, caso falso com a condição, temos novamente uma nova chamada da classe System que irá imprimir o valor correto informado pelo usuário.
- Por fim finalizamos o uso da classe scanner com: <b>scan.close();</b>