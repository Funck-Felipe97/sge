
package Model.valueObject;

import Singleton.FuncionarioSingleton;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Felipe
 */

@Entity
public class PontoEletronico {
    
    @Id
    @GeneratedValue
    private Long codigo;
    
    @ManyToOne
    @JoinColumn(name = "fun_codigo")
    private Funcionario funcionario;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    @Temporal(TemporalType.TIME)
    private Date horaEntrada;
    
    @Temporal(TemporalType.TIME)
    private Date horaSaida;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
       return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
       this.funcionario = funcionario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Date horaSaida) {
        this.horaSaida = horaSaida;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.codigo);
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
        final PontoEletronico other = (PontoEletronico) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
    
    public void abrir(){
        this.funcionario = FuncionarioSingleton.getFuncionario();
        this.data = new Date();
        this.horaEntrada = new Date();
    }
    
    public void fechar(){
        this.horaSaida = new Date();
    }
    
}
