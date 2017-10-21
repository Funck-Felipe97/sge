
package Model.BusinessObject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author funck
 */

@Entity
@DiscriminatorValue("retirada de Caixa")
public class RetiradaCaixa extends MovimentoCaixa{

    @Override
    public void atualizarCaixa() {
        super.getCaixa().sub(super.getValor());
    }
    
}
