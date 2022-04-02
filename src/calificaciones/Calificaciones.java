/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import javax.swing.JFrame;

/**
 *
 * @author Midgard
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumnos mipanel= new Alumnos(); // creamos el objeto mipanel que llamara a la clase Velocidad que contendra todas las operaciones 
        mipanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE); // funcion para cerra la ventana del Jframe
        mipanel.setSize(950,800); // tamaño de la venta 
        mipanel.setTitle("CALIFICACIONES DE ALUMNOS"); // titulo de la ventana
        mipanel.setVisible(true); // para que se muestre la ventana 
        mipanel.setLocationRelativeTo(null); // centrar ventana
    }
    
}
