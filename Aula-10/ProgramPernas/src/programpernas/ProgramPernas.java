
package programpernas;

import java.util.Scanner;


public class ProgramPernas {

    
    public static void main(String[] args) {
        // Buscar valores no console
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas?");
       
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é uma(a) ");
        switch(perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípedes";
                break;
            case 3: 
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpedes";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
        
    
}
