/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andre
 */
public class baseDatos {
    Connection conexion;
    String error;
    configuracionBaseDatos configuracionBaseDatos = new configuracionBaseDatos();

    public baseDatos() {
    }
    
     public baseDatos(String controlador, String baseDatos, String user, String password){
        configuracionBaseDatos.setControlador(controlador);
        configuracionBaseDatos.setBaseDatos(baseDatos);
        configuracionBaseDatos.setUser(user);
        configuracionBaseDatos.setPassword(password);
    }
    
    public boolean abrirConexion(){
        try {
            /*Esta línea crea una asociación entre nuestra aplicación
             * y la clase Driver que está empaquetada en el  jar de conexión.*/ 
            Class.forName(configuracionBaseDatos.getControlador());
            /*La conexón se obtiene con una cadena que usa 
             *los parámetros que recibe el constructor*/
            setConexion(DriverManager.getConnection(configuracionBaseDatos.getBaseDatos(),
                    configuracionBaseDatos.getUser(),configuracionBaseDatos.getPassword()));
        }
        catch(ClassNotFoundException e){//Sucede si no se encuentra el driver
                error=e.getMessage();	
        }
        catch(SQLException e){//Sucede si la conexión falla
                error=e.getMessage();
        }
        return true;
    }
    
    public void abrir(){
        try {
            /*Esta línea crea una asociación entre nuestra aplicación
             * y la clase Driver que está empaquetada en el  jar de conexión.*/ 
            Class.forName(configuracionBaseDatos.getControlador());
            /*La conexón se obtiene con una cadena que usa 
             *los parámetros que recibe el constructor*/
            setConexion(DriverManager.getConnection(configuracionBaseDatos.getBaseDatos(),configuracionBaseDatos.getUser(),configuracionBaseDatos.getPassword()));
        }
        catch(ClassNotFoundException e){//Sucede si no se encuentra el driver
                error=e.getMessage();	
        }
        catch(SQLException e){//Sucede si la conexión falla
                error=e.getMessage();
        }

    }
    
    public ResultSet consultarDatos(String sql) {
        
        ResultSet resultado =null;
        
        try {
        
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, 
                    ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
        
        } catch (SQLException ex) {
            
            this.error = ex.getMessage();
            return null;
            
        }
        
        return resultado;
    }
    
    public boolean ejecutarComando(String sql) {
        
        try {
            Statement sentencia = getConexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, 
                    ResultSet.CONCUR_READ_ONLY);
            if (sentencia.executeUpdate(sql) > 0){
                sentencia.close();
                return true; 
            }else{
                sentencia.close();
                return false;
            }
        } catch (SQLException ex) {
            this.error = ex.getMessage();
            return false;
        }
        
    }
    
    public void cerrarConexion(){
    	try {
            getConexion().close();
	}catch (Exception ex) {
            this.error = ex.getMessage();
	}
    }
    
    public String getMensajeError(){
    	return getError();
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
