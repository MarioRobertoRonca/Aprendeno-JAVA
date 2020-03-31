
package programaidade;

import java.util.Scanner;


public class ProgramaIdade {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade? ");
        int nasc = teclado.nextInt();
        int i = 2020-nasc;
        System.out.println("Sua idade é "+ i);
        if(i>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
    
}
