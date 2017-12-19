package SGE.Model.EventoBean;

import SGE.Model.UsuarioBean.Participante;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Apresentacao implements Serializable{
        
        @Id
        @GeneratedValue
	private Integer id;
        
        @Temporal(TemporalType.TIMESTAMP)
	private Date horaInicio;
        
        @Temporal(TemporalType.TIMESTAMP)
	private Date horaFim;
        
        @ManyToOne
	private Participante participante;
        
        @Enumerated(EnumType.STRING)
	private TipoApresentacao tipoApresentacao;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public Date getHoraFim() {
		return horaFim;
	}
	
	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}
	
	public Participante getParticipante() {
		return participante;
	}
	
	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	
	public TipoApresentacao getTipoApresentacao() {
		return tipoApresentacao;
	}
	
	public void setTipoApresentacao(TipoApresentacao tipoApresentacao) {
		this.tipoApresentacao = tipoApresentacao;
	}

}
