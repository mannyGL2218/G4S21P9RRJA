/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 *
 * @author manny
 */
public class Almacen {
    
    public void grabar(String nombre){
        try{
            FileWriter archivo = new FileWriter("datos.txt",true);
            BufferedWriter almacen = new BufferedWriter(archivo);
            almacen.write(nombre + "\n");
            almacen.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<String> leer(){
        ArrayList<String> datos = new ArrayList<>();
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader informacion = new BufferedReader(archivo);
            String lineas;
            while((lineas = informacion.readLine())!= null){
                datos.add(lineas);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return datos;
    }
}

