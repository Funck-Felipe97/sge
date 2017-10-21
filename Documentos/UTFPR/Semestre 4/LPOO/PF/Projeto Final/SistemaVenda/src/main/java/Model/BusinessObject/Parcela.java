
package Model.BusinessObject;

import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Felipe
 */

@Entity
public class Parcela {
    
    @Id
    @GeneratedValue
    private Long codigo;
    
    @Column(scale = 2 , precision = 10)
    private Double valor;
    
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @ManyToOne
    @JoinColumn(name = "venda_codigo")
    private VendaAprazo venda;
    
    @OneToOne(cascade = {CascadeType.MERGE , CascadeType.PERSIST})
    private Pagamento pagamento;
    
    @Column(length = 20)
    private String status;
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public VendaAprazo getVenda() {
        return venda;
    }

    public void setVenda(VendaAprazo venda) {
        this.venda = venda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parcela other = (Parcela) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Valor : " + this.valor + ", Data de Vencimento : " + 
                this.dataVencimento + " , Data da venda : " + this.getVenda().getData();
    }
    
    
}
