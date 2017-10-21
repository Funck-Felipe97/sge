
package Model.dataAccessObject;

import Model.BusinessObject.Pagamento;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author funck
 */

public class PagamentoDao extends HibernateDao<Pagamento>{
    
    public List<Pagamento> listar(Date dataInicial , Date dataFinal){
       super.manager = HibernateConnection.getEntityManager();
       String sql = "from Pagamento p where p.data between :data1 and :data2";
       Query query = manager.createQuery(sql);
       query.setParameter("data1", dataInicial);
       query.setParameter("data2", dataFinal);
       List<Pagamento> pagamentos = query.getResultList();
       return pagamentos; 
    }
    
}
