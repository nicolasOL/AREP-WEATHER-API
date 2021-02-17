/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.clima;

import static spark.Spark.*;   

/**
 *
 * @author Nicolás
 */
public class main {
    public static void main(String[] args) {
 
        get("/clima", (req, res)->"Aqui mostraremos la implementacion del servicio del clima");
        
        get("/clima/:ciudad", (req,res)->{
            return "Aqui mostraremos la implementacion del servicio del clima, "+ req.params(":ciudad");
        });
    }
}
