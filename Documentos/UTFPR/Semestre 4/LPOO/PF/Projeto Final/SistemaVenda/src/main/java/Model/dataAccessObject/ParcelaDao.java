
package Model.dataAccessObject;

import Model.BusinessObject.Parcela;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import javax.persistence.Query;

/**
 *
 * @author funck
 */
public class ParcelaDao extends HibernateDao<Parcela>{

    public ParcelaDao(){
        super();
    }
    
    public List<Parcela> ListarParcelas(String pkName , String pkValue){
        manager = HibernateConnection.getEntityManager();
        String sql = "from Parcela p where p.status = 'Não pago' and p.venda.cliente."+ pkName + " =:value ";
        Query query = manager.createQuery(sql);
        query.setParameter("value", pkValue);
        List<Parcela> t  = query.getResultList();
        return t;
    }
    
}
