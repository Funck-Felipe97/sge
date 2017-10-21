
package Model.Util;

import Model.valueObject.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */

public class ValidarPessoa {
    
    public static boolean validar(Pessoa pessoa){
        int cont = 0;
        
        if(pessoa.getNome().equals("") || pessoa.getNome().equals(null)){
            JOptionPane.showMessageDialog(null , "Nome invalido");
            return false;
        }
        
        if(pessoa.getCpf().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") == false){
            JOptionPane.showMessageDialog(null , "CPF invalido");
            return false;
        }
        
        if(pessoa.getRg().matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}") == false){
            JOptionPane.showMessageDialog(null , "RG invalido");
            return false;
        }
        
        return true ;
    }
    
}
