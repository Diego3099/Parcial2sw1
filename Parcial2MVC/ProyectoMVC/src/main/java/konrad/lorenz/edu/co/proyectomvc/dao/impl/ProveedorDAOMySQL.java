/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konrad.lorenz.edu.co.proyectomvc.dao.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import konrad.lorenz.edu.co.proyectomvc.dao.ProveedorDAO;
import konrad.lorenz.edu.co.proyectomvc.modelo.Proveedor;

/**
 *
 * @author AD1SIS008
 */
public class ProveedorDAOMySQL implements ProveedorDAO {

    @Override
    public void create(Proveedor proveedorNuevo) {
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevas_tecnologias_20212", "root", "");
            
            String insert = "INSERT INTO proveedor (nit_proveedor, ciudad_proveedor, direccion_proveedor, nombre_proveedor, telefono_proveedor)"
                    + " VALUES(?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(insert);
            
            ps.setInt(1, proveedorNuevo.getNitProveedor());
            ps.setString(2, proveedorNuevo.getCiudadProveedor());
            ps.setString(3, proveedorNuevo.getDireccionProveedor());
            ps.setString(4, proveedorNuevo.getNombreProveedor());
            ps.setString(5, proveedorNuevo.getTelefonoProveedor());
            
            ps.execute();
            
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void edit(Proveedor proveedorAModificar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy(int nitProveedorAEliminar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proveedor> findProveedorEntities() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public Proveedor findProveedor(Integer nitProveedorABuscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
