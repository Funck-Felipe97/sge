
package Model.BusinessObject;

import Model.valueObject.*;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Felipe
 */

@Entity
public class RelatorioCaixa {
    
    @Id
    @GeneratedValue
    private Long codigo;
    
    @Column(precision = 10 , scale = 2)
    private Double valorAbertura;
    
    @Column(precision = 10 , scale = 2)
    private Double valorFechamento;
    
    @ManyToOne
    private Funcionario FuncAbertura;
    
    @ManyToOne
    private Funcionario funcFechamento;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Caixa caixa;

    public RelatorioCaixa(){
        this.setData(new Date());
    }
    
    
    
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Double getValorAbertura() {
        return valorAbertura;
    }

    public void setValorAbertura(Double valorAbertura) {
        this.valorAbertura = valorAbertura;
    }

    public Double getValorFechamento() {
        return valorFechamento;
    }

    public void setValorFechamento(Double valorFechamento) {
        this.valorFechamento = valorFechamento;
    }

    public Funcionario getFuncAbertura() {
        return FuncAbertura;
    }

    public void setFuncAbertura(Funcionario FuncAbertura) {
        this.FuncAbertura = FuncAbertura;
    }

    public Funcionario getFuncFechamento() {
        return funcFechamento;
    }

    public void setFuncFechamento(Funcionario funcFechamento) {
        this.funcFechamento = funcFechamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.codigo);
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
        final RelatorioCaixa other = (RelatorioCaixa) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
   
}
