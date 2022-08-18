/*Crie uma situação em que ocorra uma exceção dentro de um código. Utilize try/catch para realizar a captura e tratamento dessa exceção.*/
package exemploexcecao;

import java.util.Scanner;

public class ExemploExcecao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);        
        try {            
            int numero = teclado.nextInt();
            System.out.println("Número válido!");
        } catch (Exception erro){
            System.out.println("Número inválido!");
        }
    }
    
}
