package SGE.Model.EventoBean;

import SGE.Model.UsuarioBean.Participante;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Inscricao {
        
        @Id
        @GeneratedValue
	private Integer id;
        
        @ManyToOne
	private Atividade atividade;
        
        @ManyToOne
	private Participante participante;
        
        @Temporal(TemporalType.DATE)
	private Date data;
	private Boolean presenca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Atividade getAtividade() {
		return atividade;
	}
	
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	public Participante getParticipante() {
		return participante;
	}
	
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Boolean getPresenca() {
		return presenca;
	}
	
	public void setPresenca(Boolean presenca) {
		this.presenca = presenca;
	}

}
