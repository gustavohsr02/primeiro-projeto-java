// Importa a classe Scanner, que permite ler dados digitados pelo usuário
import java.util.Scanner;

// Declara a classe principal do programa
public class primeiroProjeto {

    // Método principal: é onde o programa começa a ser executado
    public static void main(String[] args) {

        // Cria um objeto Scanner para ler dados do teclado (System.in)
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem pedindo para o usuário digitar a idade
        System.out.print("Digite a idade: ");
        
       // Lê o número inteiro digitado pelo usuário e guarda na variável idade
        int idade = scanner.nextInt();

        // Verifica se a idade é menor que 18
        if (idade < 18) {
            // Se a condição for verdadeira, exibe "Menor de idade"
            System.out.println("Menor de idade");
        } else if (idade < 10) {
            // Caso contrário (idade igual ou maior que 18), exibe "Maior de idade"
            System.out.println("Maior de idade");
        } else { 
        	System.out.print("Maior de idade");
        }

        // Fecha o Scanner para liberar recursos do sistema
        scanner.close();
    }
}
