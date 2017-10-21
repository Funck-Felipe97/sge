
package Model.CallBacks;

import Controller.ProdutoController;
import Model.BusinessObject.Venda;
import java.util.Date;
import javax.persistence.PrePersist;
import javax.swing.JOptionPane;

/**
 *
 * @author funck
 */
public class VendaCB {
    
    private ProdutoController produtoController;
    
    public VendaCB(){
        this.produtoController = new ProdutoController();
    }
    
    @PrePersist
    public void prePersist(Venda venda){
        venda.setData(new Date());
        
    }
     
}
