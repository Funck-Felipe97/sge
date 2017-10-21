
package Model.BusinessObject;

import Model.valueObject.Cliente;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Felipe
 */

@Entity
@PrimaryKeyJoinColumn(name = "venda_codigo")
@Table(name = "venda_prazo")
public class VendaAprazo extends Venda{
    
    private Integer numeroParcelas;
    
    @Column(scale = 2 , precision = 10)
    private Double juros;
    
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Parcela> parcelas;
    
    @ManyToOne
    private Cliente cliente;

    public VendaAprazo(){
        super.setTipoVenda("Prazo");
    }
     
    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public void finalizarVenda(){
        double valorFinal = super.getValor();
        valorFinal += super.getValor() * (this.juros / 100);
        super.setValorFinal(valorFinal);
        gerarParcelas();
    }

    private void gerarParcelas() {
        this.parcelas = new ArrayList<Parcela>();
        double valorParcela = super.getValorFinal() / this.numeroParcelas;
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        
        for(int i = 0 ; i < this.numeroParcelas ; ++i){
            c.add(Calendar.MONTH, + 1);
            Parcela p = new Parcela();
            p.setValor(valorParcela);
            p.setVenda(this);
            
            p.setDataVencimento(c.getTime());
            p.setStatus("Não pago");
            parcelas.add(p);
        }
    }
    
}
