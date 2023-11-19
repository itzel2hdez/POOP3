/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_p3;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author alumno
 */
public class POO_P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("###### Arreglos#####");
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4 = {1,2,3,4};
        System.out.println("###### For #####");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);   
        }
        System.out.println("#### For each #####");
           for (int i : nums4) {
               System.out.println(i);        
        }
        System.out.println("### Concatenar #####");
        String s = new String("Hola mundo");
        String s1 = "Hola mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre = "Itzel";
        String apellido = "Hernández";
        String nombreCompleto = nombre + " "+ apellido;
        System.out.println(nombreCompleto);
        System.out.println("##### Operador punto #####");
        System.out.println("num elementos del arreglo: " +nums4.length);
        System.out.println("num elementos de nombre "+nombre.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
        System.out.println("#### Wrappers y Autoboxing #####");
        int a = 3;
        Integer k = new Integer (50);
        Integer l =22;
        int r = l;
        int b= 7;
        float c = b; //Casteo: conviertes variables de tipo aritméticos
        int d= (int)c;
        Integer rr= r;
        String s3= rr.toString(); //Parseo
        String s4= r + ""; //Parseo
        System.out.println(s3);
        System.out.println(s4.length());
        //Parseo to parse
        //Casteo to cast
        
        System.out.println("#### Colecciones #####"); // Guarda referencias
        System.out.println("#### arrayList #####");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0,20);
        System.out.println("***");
        for (Integer integer : miArrayList){
            System.out.println(integer);
        }
        System.out.println("#### Hashtable #####");   
        Hashtable<Integer, String> agenda = new Hashtable<Integer, String>();
        agenda.put(k, "Pedro");
        agenda.put(55665588,"Antonio");
        agenda.put(554816433, "Isabella");
        agenda.put(557766443, "Brayan");
        System.out.println(agenda.size());
        for(String valor: agenda.values()){
            System.out.println(valor); 
        }
        for (Integer clave : agenda.keySet()) {
            System.out.println(clave);           
        }
        
        
        System.out.println("#### Enumeración #####");
        Integer clave;
        String valor;
        Enumeration <Integer> llaves = agenda.keys();
        while(llaves.hasMoreElements()){
            clave= llaves.nextElement();
            valor = agenda.get(clave);
            System.out.println("clave: "+clave+ " valor: " + valor);
        }
        
        
        System.out.println("#### Math #####");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80, 7));
        
        System.out.println("#### Date #####");
        Date hoy = new Date();
        System.out.println(hoy); //se parsea, el date se transforma en una cadena
        
    }
        
}
    

