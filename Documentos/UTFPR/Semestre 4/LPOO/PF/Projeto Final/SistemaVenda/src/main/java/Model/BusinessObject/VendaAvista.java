
package Model.BusinessObject;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Felipe
 */

@Entity
@PrimaryKeyJoinColumn(name = "venda_codigo")
@Table(name = "venda_vista")
public class VendaAvista extends Venda{
    
    @Column(scale = 2 , precision = 10)
    private Double desconto;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Pagamento pagamento;

    public VendaAvista(){
        super.setTipoVenda("Vista");
    }
   
    
    
    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
 
    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void finalizarVenda() {
       super.setValorFinal( super.getValor() - (super.getValor() * this.desconto));
    }
    
}
