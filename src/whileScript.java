import java.util.Scanner;
//EXECUTAR ESTRUTURA DE REPETIÇÃO (LOOP) DO CÓDIGO IF
public class whileScript {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int nao = 1;
		 
		
		while(nao != 0) {
	
			System.out.print("Digite a idade: ");
	        
		       // Lê o número inteiro digitado pelo usuário e guarda na variável idade
		        int idade = sc.nextInt();

		        // Verifica se a idade é menor que 18
		        if (idade < 18) {
		            // Se a condição for verdadeira, exibe "Menor de idade"
		            System.out.println("Menor de idade");
		        } else if (idade < 10) {
		            // Caso contrário (idade igual ou maior que 18), exibe "Maior de idade"
		            System.out.println("Maior de idade");
		        } else { 
		        	System.out.println("Maior de idade");
		        }

		        // Fecha o Scanner para liberar recursos do sistema
		        System.out.println("Para finalizar digite 0");
				nao = sc.nextInt();
		    }
		
			    sc.close();
		}// TODO Auto-generated method stub

/*MELHORAR A ESTRUTURA DO CÓDIGO; 
 * MELHOR O ENTENDIMENTO;
 * MELHORAR A LÓGICA.
 */

}


