/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.clima;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nicolás
 */
public class mainTest {
    final String key = "170e2a5df68abbdd9ad25546e7239918";

    /**
     * Test of getPort method, of class main.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        int expResult = 4567;
        int result = main.getPort();
        assertEquals(expResult, result);
    }

    /**
     * Test of consultWeather method at the backend for Bogota
     */
    @Test
    public void testConsultWeatherBogota() {
        try {
            System.out.println("consultWeather");
            String expResult="{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\"base\":\"stations\",\"main\":{\"temp\":283.6,\"feels_like\":277.98,\"temp_min\":283.15,\"temp_max\":284.26,\"pressure\":1010,\"humidity\":82},\"visibility\":10000,\"wind\":{\"speed\":7.2,\"deg\":210,\"gust\":12.86},\"clouds\":{\"all\":90},\"dt\":1613590036,\"sys\":{\"type\":1,\"id\":1414,\"country\":\"GB\",\"sunrise\":1613545832,\"sunset\":1613582326},\"timezone\":0,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
            main.consultWeather();
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=bogota&appid=" + key);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String resp = read.readLine();
            read.close();
            assertTrue(resp.contains("Bogot"));
        } catch (Exception ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * Test of consultWeather method at the backend for London
     */
    @Test
    public void testConsultWeatherLondon() {
        try {
            System.out.println("consultWeather");
            main.consultWeather();
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=london&appid=" + key);
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String resp = read.readLine();
            read.close();
            assertTrue(resp.contains("London"));
        } catch (Exception ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * Test of consultWeather method at the Heroku deployment for Bogota
     */
    @Test
    public void testConsultWeatherBogotaHeroku() {
        try {
            System.out.println("consultWeather");
            String expResult="{\"coord\":{\"lon\":-0.1257,\"lat\":51.5085},\"weather\":[{\"id\":804,\"main\":\"Clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\"base\":\"stations\",\"main\":{\"temp\":283.6,\"feels_like\":277.98,\"temp_min\":283.15,\"temp_max\":284.26,\"pressure\":1010,\"humidity\":82},\"visibility\":10000,\"wind\":{\"speed\":7.2,\"deg\":210,\"gust\":12.86},\"clouds\":{\"all\":90},\"dt\":1613590036,\"sys\":{\"type\":1,\"id\":1414,\"country\":\"GB\",\"sunrise\":1613545832,\"sunset\":1613582326},\"timezone\":0,\"id\":2643743,\"name\":\"London\",\"cod\":200}";
            main.consultWeather();
            URL url = new URL("https://arep-clima-api.herokuapp.com/clima?lugar=bogota");
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String resp = read.readLine();
            read.close();
            assertTrue(resp.contains("Bogot"));
        } catch (Exception ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * Test of consultWeather method at the Heroku deployment for London
     */
    @Test
    public void testConsultWeatherLondonHeroku() {
        try {
            System.out.println("consultWeather");
            main.consultWeather();
            URL url = new URL("https://arep-clima-api.herokuapp.com/clima?lugar=London");
            URLConnection urlConnection = url.openConnection();
            BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String resp = read.readLine();
            read.close();
            assertTrue(resp.contains("London"));
        } catch (Exception ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
