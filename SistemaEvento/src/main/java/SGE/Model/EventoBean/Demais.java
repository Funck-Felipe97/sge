package SGE.Model.EventoBean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Demais extends Atividade{
        
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
