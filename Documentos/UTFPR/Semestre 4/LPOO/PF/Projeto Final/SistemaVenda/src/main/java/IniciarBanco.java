


import Model.BusinessObject.Caixa;
import Model.dataAccessObject.HibernateConnection;
import Model.dataAccessObject.HibernateDao;
import Model.valueObject.Funcionario;
import Model.valueObject.Gerente;
import Model.valueObject.Login;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author funck
 */

public class IniciarBanco {
    
    public static void main(String[] args){
        iniciar();
    }
    
    public static void iniciar(){
       
       EntityManager manager = HibernateConnection.getEntityManager();
       EntityTransaction tx = manager.getTransaction();
       tx.begin();
       
       Caixa c = new Caixa();
       c.setStatus(true);
       manager.persist(c);
       manager.flush();
       
       
       Funcionario f = new Gerente();
       f.setNome("root");
       f.setCpf("000.000.000-00");
       f.setRg("000.000.000-00");
       Login l = new Login();
       l.setUsuario("root");
       l.setSenha("1234");
       f.setLogin(l);
       manager.persist(f);
       
       tx.commit();
           
    }
    
}
