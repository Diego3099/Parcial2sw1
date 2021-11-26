/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.dao;

import java.util.List;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.NonexistentEntityException;
import konrad.lorenz.edu.co.proyectomvc.dao.impl.exceptions.PreexistingEntityException;
import konrad.lorenz.edu.co.proyectomvc.modelo.Usuarios;

/**
 *
 * @author AD1SIS008
 */
public interface UsuariosDAO {

    public void create(Usuarios usuariosNuevo)throws PreexistingEntityException, Exception;
    
    public void edit(Usuarios usuariosAModificar)throws NonexistentEntityException, Exception;
    
    public void destroy(Integer usuariosAEliminar)throws NonexistentEntityException;
      
    public List<Usuarios> findUsuariosEntities();
    
    public Usuarios findUsuarios(Integer usuariosABuscar);
    
}
