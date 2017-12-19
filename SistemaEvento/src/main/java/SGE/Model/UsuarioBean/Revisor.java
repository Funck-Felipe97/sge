package SGE.Model.UsuarioBean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Revisor extends Usuario {

    @Column(length = 40)
    private String titulacao;

    @Column(length = 40)
    private String area;

    @Column(length = 40)
    private String formacao;

    @Column(length = 40)
    private String instituicao;

    @Column(length = 40)
    private String cargo;

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
