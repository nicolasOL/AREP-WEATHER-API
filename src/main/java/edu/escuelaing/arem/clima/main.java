/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.clima;

import edu.escuelaing.arem.clima.cache.climaCache;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import spark.QueryParamsMap;
import static spark.Spark.*;

/**
 *
 * @author Nicolás
 */
public class main {
    public static void main(String[] args) {
        port(getPort());
        staticFileLocation("public");
        consultWeather();

        /*
        get("/clima", (req, res)->"Aqui mostraremos la implementacion del servicio del clima");
        
        get("/clima/:ciudad", (req,res)->{
            return "Aqui mostraremos la implementacion del servicio del clima, "+ req.params(":ciudad");
        });
         */
    }

    /**
     * @return retorna el el puerto desde el entorno del sistema operativo
     */
    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; // returns default port if heroku-port isn't set
    }

    /**
     * Calcula la media de un str de con la lista de numeros
     */
    public static void consultWeather() {
        final String key = "170e2a5df68abbdd9ad25546e7239918";

        get("/clima", (req, res) -> {
            //return "Aqui mostraremos la implementacion del servicio del clima, "+ req.params(":ciudad");
            QueryParamsMap map = req.queryMap();
            try {
                String ciudad = map.get("lugar").value();
                climaCache cache=climaCache.getInstace();
                String resp= null;
                if (cache.contains(ciudad)){
                    resp = cache.getElement(ciudad);
                }else{
                    URL url =new URL("http://api.openweathermap.org/data/2.5/weather?q=" + ciudad + "&appid=" + key);
                    URLConnection urlConnection = url.openConnection();
                    BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                    resp = read.readLine();  
                    cache.addElement(ciudad, resp);
                    read.close();
                }
                            
                return resp;
            } catch (Exception e) {
                return "Error: " + e.getMessage();
            }
        });
        
        
    }
}
