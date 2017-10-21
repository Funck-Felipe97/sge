
package Controller;

import Singleton.FuncionarioSingleton;
import Model.valueObject.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */

public class LoginController {
    
    private PessoaController funcController;

    public LoginController(){
        this.funcController = new PessoaController("Funcionario");
    }
    
    public boolean acessar(String login , String senha){
      
       List<Funcionario> lista = (List)this.funcController.listar();
       lista.forEach(f->{
           if(f.getLogin().getSenha().equals(senha)
              && f.getLogin().getUsuario().equals(login)){  
               
              FuncionarioSingleton.setFuncionario(f);
               
           }    
       });
        return FuncionarioSingleton.getFuncionario() != null;
    }
    
}
