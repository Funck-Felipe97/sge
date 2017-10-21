

package Singleton;

import Model.valueObject.Funcionario;

/**
 *
 * @author funck
 */

public class FuncionarioSingleton {
    
    private static Funcionario funcionario;

    private FuncionarioSingleton(){
        
    }

    public static Funcionario getFuncionario() {
        return funcionario;
    }

    public static void setFuncionario(Funcionario funcionario) {
        FuncionarioSingleton.funcionario = funcionario;
    }
    
}
