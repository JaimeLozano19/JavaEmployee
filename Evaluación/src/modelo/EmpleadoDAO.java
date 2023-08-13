/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpleadoDAO {
 private Session sesion;
    private Transaction trns;
    private Empleado empleado;
    public EmpleadoDAO(){
    
    }
    private void iniciarSesion(){
    sesion= HibernateUtil.getSessionFactory().openSession();
    trns=sesion.beginTransaction();
    }
    
    
    public boolean grabar(Empleado empleado){
    boolean ok= false;
    try{
    iniciarSesion();
    sesion.save(empleado);
    trns.commit();
    ok=true;
    }catch(HibernateException e){
     manejarException(e);
    }
    return ok;
    }
    private void manejarException(HibernateException e){
    trns.rollback();
    throw new HibernateException("Error en la capa de datos"+e);
    
    }
}
