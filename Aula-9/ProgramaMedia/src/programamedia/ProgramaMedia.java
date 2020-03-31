
package programamedia;

import java.util.Scanner;


public class ProgramaMedia {

    
    public static void main(String[] args) {
        //Comando para escrever no teclado
        Scanner teclado = new Scanner(System.in);
        
        //Entrada das variáveis 
        System.out.println("Digite a primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota");
        float n2 = teclado.nextFloat();
        
        //Operações 
        float m = (n1+n2)/2;
        System.out.println("Sua média foi: "+m);
        if(m>9){
            //Print do resultado;
            System.out.println("Parabéns");
        }
        
    }
    
}
