/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author mario
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variáveis 
        String nome1 = "Mario";
        String nome2 = "Mario";
        String nome3  = new String("Mario");
        String res;
        res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println(res);
    }
    
}
