
package Model.BusinessObject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author funck
 */

@Entity
@DiscriminatorValue("Pagamento")
public class PagamentoCaixa extends MovimentoCaixa{

    public PagamentoCaixa(){
        
    }
    
    @Override
    public void atualizarCaixa() {
        super.getCaixa().add(super.getValor());
    }
    
}
