package View;




import Model.BusinessObject.Caixa;
import Model.dataAccessObject.HibernateDao;
import Model.valueObject.Categoria;
import Model.valueObject.Produto;
import View.FormLogin;
import javax.persistence.Persistence;

/**
 * 
 * @author Felipe
 */

public class SistemaVendas {
    
    public static void main(String[] args){
       
    FormLogin f = new FormLogin();
    f.setVisible(true);
    
    }
    
}
