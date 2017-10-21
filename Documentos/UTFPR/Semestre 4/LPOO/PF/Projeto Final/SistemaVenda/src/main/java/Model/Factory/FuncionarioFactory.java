
package Model.Factory;

import Model.valueObject.Funcionario;
import Model.valueObject.Gerente;
import Model.valueObject.OperadorCaixa;

/**
 *
 * @author funck
 */

public enum FuncionarioFactory {
    
    Gerente {
        @Override
        public Funcionario getFuncionario() {
            return new Gerente();
        }
    },
    OperadorCaixa {
        @Override
        public Funcionario getFuncionario() {
            return new OperadorCaixa();
        }
    };
    
    public abstract Funcionario getFuncionario();
    
}
