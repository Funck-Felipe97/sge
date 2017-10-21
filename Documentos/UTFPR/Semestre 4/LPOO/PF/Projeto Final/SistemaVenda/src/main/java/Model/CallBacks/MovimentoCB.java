
package Model.CallBacks;

import Model.BusinessObject.MovimentoCaixa;
import java.util.Date;
import javax.persistence.PrePersist;

/**
 *
 * @author funck
 */

public class MovimentoCB {
    
    @PrePersist
    public void prePersist(MovimentoCaixa movimento){
        movimento.setData(new Date());
    }
    
}
