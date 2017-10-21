
package Model.CallBacks;

import Model.BusinessObject.Pagamento;
import java.util.Date;
import javax.persistence.PrePersist;

/**
 *
 * @author funck
 */

public class PagamentoCB {
    
    @PrePersist
    public void prePersist(Pagamento pagamento){
        pagamento.setData(new Date());
    }
    
}
