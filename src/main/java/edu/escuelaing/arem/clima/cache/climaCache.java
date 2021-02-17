/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.clima.cache;

import java.util.HashMap;

/**
 *
 * @author Nicolás
 * Clase Singleton que guarda el cache usando un Hashmap
 */
public class climaCache {
    private HashMap<String,String> cache;
    public static climaCache _Instance=new climaCache();
    
    private climaCache(){
        cache= new HashMap<String,String>();
    }
    public void addElement(String llave, String valor){
        cache.put(llave,valor);
    }
    public String getElement(String llave){
        return cache.get(llave);
    }
    public static climaCache getInstace (){
        return _Instance;
    }
    public boolean contains(String e){
        boolean res=false;
        for (String s:cache.keySet()){
            if(s.equals(e)){
                res=true;
                break;
            }
        }
        return res;
    }
}
