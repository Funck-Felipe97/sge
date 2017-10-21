

package Model.BusinessObject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author funck
 */

@Entity
@DiscriminatorValue("Entrada de caixa")
public class EntradaCaixa extends MovimentoCaixa{

    @Override
    public void atualizarCaixa() {
        super.getCaixa().add(super.getValor());
    }
    
}
