/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author mario
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variáveis
        int n1, n2, r;
        
        //Operador ternário 
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?(n1+n2):(n2-n1);
        System.out.println(r);
    }
    
}
