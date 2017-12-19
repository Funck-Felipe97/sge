package SGE.Model.EventoBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sala {
        
        @Id
        @GeneratedValue
        private Integer id;
        
        @Column(length = 40)
	private String descricao;
        
        @Column(length = 40)
	private String capacidade;
	private Boolean disponivel;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	public Boolean getDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
