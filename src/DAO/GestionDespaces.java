/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.Myconnection;
import Entites.GesstionDespace;

/**
 *
 * @author hajer.BENSALEM
 */

// MAHDI BARHOUMI COMMIT

//Rourouuu commit
public class GestionDespaces {
    public javax.swing.JMenu jMenu1;
    
    
    public void insertEspaceGourmands (GesstionDespace ge) 
    {
      
     String requete ="insert into GestionDEspaceGourmands (Nom,Proprietaire ,Adresse ,Tel,Email,Type) values (?,?,?,?,?,?)"; 
   try 
   {
         PreparedStatement ps =Myconnection.getInstance().prepareStatement(requete);

         // ps.setInt(1,ge.getIdEG());
       ps.setString(1,  ge.getNom());
       ps.setString(2, ge.getProprietaire());
       ps.setString(3,ge.getAdresse());
       ps.setString(4, ge.getTel());
       ps.setString(5,ge.getEmail());
       ps.setString(6,ge.getType());
       ps.executeUpdate(); 
       System.out.println("AJOUT effectuer avec succés");
    }
    catch(SQLException ex)
        
            {
                System.out.println("erreur lors  de l inserstion "+ ex.getMessage());
            }
    }
    
}
