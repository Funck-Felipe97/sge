
package Model.valueObject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Felipe
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Funcionario extends Pessoa{
   
    @OneToOne (cascade = CascadeType.PERSIST)
    private Login login;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
    
}
