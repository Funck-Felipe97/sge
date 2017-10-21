
package Controller;

import Model.dataAccessObject.HibernateDao;
import Model.valueObject.Categoria;
import java.util.List;

/**
 *
 * @author funck
 */

public class CategoriaController {
    
    private final HibernateDao<Categoria> dao;
    private Categoria categoria;
    private List<Categoria> categorias;

    public CategoriaController(){
        this.dao = new HibernateDao<>();
    }
    
    public void salvar(){
        dao.salvar(this.categoria);
    }
    
    public void exluir(){
        dao.excluir(this.categoria);
    }
    
    public void atualizar(){
        dao.atualizar(this.categoria);
    }
    
    public List<Categoria> listar(){
        this.categorias = dao.getBeans("Categoria");
        return this.categorias;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
}
