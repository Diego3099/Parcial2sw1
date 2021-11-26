/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author AD1SIS008
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM usuarios u"),
    @NamedQuery(name = "Usuarios.findByCedulaUsuario", query = "SELECT u FROM Usuarios u WHERE u.cedulaUsuario = :cedulaUsuario"),
    @NamedQuery(name = "Usuarios.findByEmailUsuario", query = "SELECT u FROM Usuarios u WHERE u.emailUsuario = :emailUsuario"),
    @NamedQuery(name = "Usuarios.findByNombreUsuario", query = "SELECT u FROM Usuarios u WHERE u.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password"),
    @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cedula_usuario")
    private Integer cedulaUsuario;
    @Basic(optional = false)
    @Column(name = "email_usuario")
    private String emailUsuario;
    @Basic(optional = false)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;

    public Usuarios() {
    }

    public Usuarios(Integer cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public Usuarios(Integer cedulaUsuario, String emailUsuario, String nombreUsuario, String password, String usuario) {
        this.cedulaUsuario = cedulaUsuario;
        this.emailUsuario = emailUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.usuario = usuario;
    }

    public Integer getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(Integer cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaUsuario != null ? cedulaUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.cedulaUsuario == null && other.cedulaUsuario != null) || (this.cedulaUsuario != null && !this.cedulaUsuario.equals(other.cedulaUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "konrad.lorenz.edu.co.proyectomvc.modelo.Usuarios[ cedulaUsuario=" + cedulaUsuario + " ]";
    }
    
}
