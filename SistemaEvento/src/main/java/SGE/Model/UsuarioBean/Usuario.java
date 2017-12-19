package SGE.Model.UsuarioBean;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"cpf" , "login" , "email"})})
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
        
        @Id
        @GeneratedValue
	private Integer id;
        
        @Column(length = 40 , nullable = false)
	private String nome;
        
        @Column(length = 15)
	private String cpf;
       
        @Column(length = 30)
	private String login;
        
        @Column(length = 30)
	private String senha;
        
        @Column(length = 30)
	private String email;
        
        @Column(length = 30)
	private String comfitmarEmail;
        
        @Column(length = 20)
	private String telefone;
        
        @ElementCollection(fetch = FetchType.LAZY , targetClass = Permissao.class)
        @Enumerated(EnumType.STRING)
        @Column(name = "permissao" , length = 30)
        @JoinTable(name = "Usuario_Permissao")
	private List<Permissao> permissoes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getComfitmarEmail() {
		return comfitmarEmail;
	}
	
	public void setComfitmarEmail(String comfitmarEmail) {
		this.comfitmarEmail = comfitmarEmail;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public void addPermissao(Permissao permissao){
		
	}
	
	public void removePermissao(Permissao permissao){
		
	}
}
