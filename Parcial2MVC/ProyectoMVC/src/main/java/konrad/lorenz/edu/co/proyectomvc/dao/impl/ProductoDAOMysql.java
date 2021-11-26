/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package konrad.lorenz.edu.co.proyectomvc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import konrad.lorenz.edu.co.proyectomvc.dao.ProductoDAO;
import konrad.lorenz.edu.co.proyectomvc.modelo.Producto;

/**
 *
 * @author AD1SIS008
 */
public class ProductoDAOMysql implements ProductoDAO {

    @Override
    public void create(Producto ProductoNuevo) {
 try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevas_tecnologias_20212", "root", "12345");
            
            String insert = "INSERT INTO producto (codigo_producto, ivacompra, nit_proveedor, nombre_producto, precio_compra,precio_venta)"
                    + " VALUES(?,?,?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(insert);
            
            ps.setInt(1, ProductoNuevo.getCodigo_producto());
            ps.setDouble(2, ProductoNuevo.getIvacompra());
            ps.setInt(3, ProductoNuevo.getNit_proveedor());
            ps.setString(4, ProductoNuevo.getNombre_producto());
            ps.setDouble(5, ProductoNuevo.getPrecio_compra());
            ps.setDouble(6, ProductoNuevo.getPrecio_venta());
            
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
    public void edit(Producto ProductoAModificar) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevas_tecnologias_20212", "root", "12345");
            
            String update = "update producto set ivacompra= ?, nit_proveedor= ?, nombre_producto= ?, precio_compra= ? ,precio_venta= ? where codigo_producto=? ";
            
            PreparedStatement ps = con.prepareStatement(update);
            

            ps.setDouble(1, ProductoAModificar.getIvacompra());
            ps.setInt(2, ProductoAModificar.getNit_proveedor());
            ps.setString(3, ProductoAModificar.getNombre_producto());
            ps.setDouble(4, ProductoAModificar.getPrecio_compra());
            ps.setDouble(5, ProductoAModificar.getPrecio_venta());
            ps.setInt(6, ProductoAModificar.getCodigo_producto());
            
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
    public void destroy(int codProductoAEliminar) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevas_tecnologias_20212", "root", "12345");
            
            String delete = "DELETE  FROM producto  WHERE codigo_producto="+codProductoAEliminar;
                  
     
            PreparedStatement ps = con.prepareStatement(delete );
            
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
    public List<Producto> findProductoEntities() {
        String read = "SELECT * FROM producto  ORDER BY 1 ";
        List<Producto> listaProducto= new ArrayList<Producto>();
    
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevas_tecnologias_20212", "root", "12345");
            
            PreparedStatement ps = con.prepareStatement(read );
            ps.execute();
            
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
       return listaProducto;
    }


    @Override
    public Producto findProducto(Integer codProductoABuscar) {
        
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nuevas_tecnologias_20212", "root", "12345");
            String read = "SELECT codigo_producto,ivacompra,nit_proveedor,nombre_producto,precio_compra,precio_venta FROM producto  where codigo_producto="+codProductoABuscar;
            
            PreparedStatement ps = con.prepareStatement(read );
            
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                System.out.println("Codigo: "+rs.getInt(1));
                System.out.println("Iva Compra: "+rs.getDouble(2));
                System.out.println("Nit Proveedor: "+rs.getInt(3));
                System.out.println("Nombre Producto: "+rs.getString(4));
                System.out.println("Precio Compra: "+rs.getDouble(5));
                System.out.println("Precio Venta: "+rs.getDouble(6));
            }
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProveedorDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ProveedorDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
   

}
