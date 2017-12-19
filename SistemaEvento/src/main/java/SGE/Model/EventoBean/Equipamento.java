package SGE.Model.EventoBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipamento {
        
        @Id
        @GeneratedValue
        private Integer id;
        
        @Column(length = 40)
	private String descricao;
        
        @Column(length = 40)
	private String patrimonio;
	private Boolean disponivel;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getPatrimonio() {
		return patrimonio;
	}
	
	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}
	
	public Boolean getDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
