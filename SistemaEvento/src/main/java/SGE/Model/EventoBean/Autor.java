package SGE.Model.EventoBean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable {
        
        @Id
        @GeneratedValue
        private Integer id;
        
        @Column(length = 40 , nullable = false)
	private String nome;
        
        @Column(length = 40 , nullable = false)
	private String email;
        
        @Column(length = 40 , nullable = false)
	private String instituicao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getInstituicao() {
		return instituicao;
	}
	
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

}
