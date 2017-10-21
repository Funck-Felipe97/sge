
package Model.BusinessObject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author funck
 */
@Entity
@DiscriminatorValue("troco")
public class TrocoCaixa extends MovimentoCaixa{
    
    public TrocoCaixa(){
        super.setDescricao("Troco");
    }
    
    @Override
    public void atualizarCaixa() {
        super.getCaixa().sub(super.getValor());
    }
    
}
