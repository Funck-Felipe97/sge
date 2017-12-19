package SGE.Model.EventoBean;

import SGE.Model.EventoBean.Atividade;
import javax.persistence.Entity;

@Entity
public class Palestra extends Atividade{
	
	private Integer numeroVagas;
	private Double cargaHoraria;
	private String conteudoPalestra;
	
	public Integer getNumeroVagas() {
		return numeroVagas;
	}
	
	public void setNumeroVagas(Integer numeroVagas) {
		this.numeroVagas = numeroVagas;
	}
	
	public Double getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getConteudoPalestra() {
		return conteudoPalestra;
	}
	
	public void setConteudoPalestra(String conteudoPalestra) {
		this.conteudoPalestra = conteudoPalestra;
	}

}
