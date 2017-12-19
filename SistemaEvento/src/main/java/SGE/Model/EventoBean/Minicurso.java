package SGE.Model.EventoBean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Minicurso  extends Atividade{
       
	private Integer numeroVagas;
	private Double cargaHoraria;
	private String ementa;
	
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
	
	public String getEmenta() {
		return ementa;
	}
	
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
}
