/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.clima.model;

/**
 *
 * @author Nicolás
 */
public class DatosCiudad {
    
private String nombre;
    private String temperatura;
    private String sensacion;
    private String tempminima;
    private String tempmaxima;
    private String presion;
    private String humedad;
    

	public DatosCiudad(String nombre, String temperatura, String sensacion, String tempminima, String tempmaxima,
			String humedad, String presion) {
		this.nombre = nombre;
		this.temperatura = temperatura;
		this.sensacion = sensacion;
		this.tempminima = tempminima;
		this.tempmaxima = tempmaxima;
		this.humedad = humedad;
		this.presion = presion;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getSensacion() {
		return sensacion;
	}
	public void setSensacion(String sensacion) {
		this.sensacion = sensacion;
	}
	public String getTempminima() {
		return tempminima;
	}
	public void setTempminima(String tempminima) {
		this.tempminima = tempminima;
	}
	public String getTempmaxima() {
		return tempmaxima;
	}
	public void setTempmaxima(String tempmaxima) {
		this.tempmaxima = tempmaxima;
	}
	public String getPresion() {
		return presion;
	}
	public void setPresion(String presion) {
		this.presion = presion;
	}
	public String getHumedad() {
		return humedad;
	}
	public void setHumedad(String humedad) {
		this.humedad = humedad;
	}
	

    

}
