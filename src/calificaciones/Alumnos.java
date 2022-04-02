/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificaciones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Midgard
 */
class Alumnos extends JFrame {
    
    JPanel jpanel = (JPanel) this.getContentPane();   // panel donde colocaremos nuestros elemntos
    public JButton botoncalifica; // definimos el objeto boton calificacion
    public JButton botonperiodo1; // definimos el objeto boton periodo1
    public JButton botonperiodo2; // definimos el objeto boton periodo2
    public JButton botonperiodo3; // definimos el objeto boton periodo3
    public JButton botonmejorperiodo1; // definimos el objeto boton mostrar1
    public JButton botonmejorperiodo2; // definimos el objeto boton mostrar2
    public JButton botonmejorperiodo3; // definimos el objeto boton mostrar3
    
    
    public JLabel mensaje1 = new JLabel();
    public JLabel mensaje2 = new JLabel();
    public JLabel mensaje3 = new JLabel();
     public JLabel mensaje4 = new JLabel();
    
    public JTextField textoalumnos; // creamos el texto para mostrar el resultado del vector 
    public JTextField textocalifica1;// creamos el texto para mostrar el resultado del vector 
    public JTextField textocalifica2;// creamos el texto para mostrar el resultado del vector 
    public JTextField textocalifica3;// creamos el texto para mostrar el resultado del vector 
    
    public JTextField textoordena1;// creamos el texto para mostrar el resultado del vector 
    public JTextField textoordena11;// creamos el texto para mostrar el resultado del vector 
    public JTextField textoordena12;// creamos el texto para mostrar el resultado del vector 
    public JTextField textoordena2;// creamos el texto para mostrar el resultado del vector 
    public JTextField textoordena3;// creamos el texto para mostrar el resultado del vector 
    public JTextField textoordena4;// creamos el texto para mostrar el resultado del vector 
    
    public JTextField textomejor1;// creamos el texto para mostrar el resultado del vector 
    public JTextField textomejor2;// creamos el texto para mostrar el resultado del vector 
    public JTextField textomejor3;// creamos el texto para mostrar el resultado del vector 
    public JTextField textomejor4;// creamos el texto para mostrar el resultado del vector 
    
    public static String[] vectoralumnos = new String[8];// creamos el vector 
     public static String[] vectoralumnos1 = new String[8];// creamos el vector 
      public static String[] vectoralumnos2 = new String[8];// creamos el vector 
    public static int[] vectorperiodo1= new int[8];// creamos el vector d
    public static int[] vectorperiodo2= new int[8];// creamos el vector d
    public static int[] vectorperiodo3= new int[8];// creamos el vector d
    
     public int califica;
     public int califica2;
     public int califica3;
     //public int periodos =3;
    
     public Alumnos(){
       jpanel.setLayout(null); /*mostramos nuestro panel de trabajo donde vamos
                                    a colocar todos nuestros elementos para poder manipularlos */
       jpanel.setBackground(Color.WHITE);// color a nuestro panel   
       misAcciones(); // llamamos al metodo misAcciones
       
       botoncalifica.setBounds(80, 50, 200, 50);  // posicionamos le boton bilbao en el jpanel
       jpanel.add(botoncalifica);// pegamos el botkn al jpanel
        botonperiodo1.setBounds(80, 330, 160, 50);  // posicionamos le boton bilbao en el jpanel
       jpanel.add(botonperiodo1);// pegamos el botkn al jpanel
       botonperiodo2.setBounds(80, 420, 160, 50);  // posicionamos le boton bilbao en el jpanel
       jpanel.add(botonperiodo2);// pegamos el botkn al jpanel
       botonperiodo3.setBounds(80, 510, 160, 50);  // posicionamos le boton bilbao en el jpanel
       jpanel.add(botonperiodo3);// pegamos el botkn al jpanel
       botonmejorperiodo1.setBounds(50, 600, 220, 50);// posicionamos le boton bilbao en el jpanel
       jpanel.add(botonmejorperiodo1);// pegamos el botkn al jpanel
       botonmejorperiodo2.setBounds(300, 600, 220, 50);// posicionamos le boton bilbao en el jpanel
       jpanel.add(botonmejorperiodo2);// pegamos el botkn al jpanel
       botonmejorperiodo3.setBounds(550, 600, 220, 50);// posicionamos le boton bilbao en el jpanel
       jpanel.add(botonmejorperiodo3);// pegamos el botkn al jpanel
        
       letreros();
      
     }
     
      private void misAcciones(){
           botoncalifica= new JButton("CAPTURAR CALIFICACIONES"); // nombre del boton
           botoncalifica.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                alumnos();
                mostrar();
               

            }

        });
           
            botonperiodo1= new JButton("ORDENAR PERIODO 1"); // nombre del boton
           botonperiodo1.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                
               ordena1();

            }

        });
           
            botonperiodo2= new JButton("ORDENAR PERIODO 2"); // nombre del boton
           botonperiodo2.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                
              ordena2();

            }

        });
           
            botonperiodo3= new JButton("ORDENAR PERIODO 3"); // nombre del boton
           botonperiodo3.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                
              ordena3();

            }

        });
           
              botonmejorperiodo1= new JButton("MEJOR ALUMNO PERIODO 1"); // nombre del boton
           botonmejorperiodo1.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                
              busqueda1();

            }
        });
           
           botonmejorperiodo2= new JButton("MEJOR ALUMNO PERIODO 2"); // nombre del boton
           botonmejorperiodo2.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                
              busqueda2();

            }

        });
           
           botonmejorperiodo3= new JButton("MEJOR ALUMNO PERIODO 3"); // nombre del boton
           botonmejorperiodo3.addActionListener(
        new ActionListener()// se creaun un clase interna para darle funcion la boton
        {
            public void actionPerformed (ActionEvent evento) // todo lo que ese dentro de esta partado lo ejecutura al presionar el boton 
            {
                
              busqueda3();

            }

        });
           
           
      }
      
       public int alumnos(){
           
           
           for(int i=0; i<8;i++) // iniicamo el cliclo para pedir el numero de votaciones de los tres canidatos
            {
               
            String alumno= JOptionPane.showInputDialog("Nombre del alumno:  "+i);  //mostramos el cuadro de dialogo donde pedimos las votaciones

            vectoralumnos[i]=alumno; //guardamos el valor obtenido en le vector 
          
           periodo1(i);
          JOptionPane.showMessageDialog(null, "CALIFICACIONES DEL SEGUNDO PERIODO","ATENCION", JOptionPane.INFORMATION_MESSAGE);	//mensaje donde indicamos que esta erroneo 
           periodo2(i);
          JOptionPane.showMessageDialog(null, "CALIFICACIONES DEL TERCER PERIODO","ATENCION", JOptionPane.WARNING_MESSAGE);	//mensaje donde indicamos que esta erroneo 
           periodo3(i);
             }
           
           
         return 0;
            }
       
       public int periodo1(int i)
       {
           
   
                String calificaciones= JOptionPane.showInputDialog("Calificaciones del primer periodo:  ");  //mostramos el cuadro de dialogo donde pedimos las votaciones
          
                while (!esNumero(calificaciones)) {// preguntamos si el valor optenido es un numero con el metodo esNumero 
                calificaciones= JOptionPane.showInputDialog("Calificaciones dle primer periodo:  "); // si hay un valor incorrecto volvemos apedir el valor numerico
                }
         
                califica = Integer.parseInt(calificaciones); // covertimos los valores string obtenidos a enteros para el vector
                vectorperiodo1[i]=califica; //guardamos el valor obtenido en le vector   
            
           return i;
           
       }
       
       public int periodo2(int i)
       {
           
   
                String calificaciones2= JOptionPane.showInputDialog("Calificaciones del segundo periodo:  ");  //mostramos el cuadro de dialogo donde pedimos las votaciones
          
                while (!esNumero(calificaciones2)) {// preguntamos si el valor optenido es un numero con el metodo esNumero 
                calificaciones2= JOptionPane.showInputDialog("Calificaciones del segundo periodo:  "); // si hay un valor incorrecto volvemos apedir el valor numerico
                }
         
                califica2 = Integer.parseInt(calificaciones2); // covertimos los valores string obtenidos a enteros para el vector
                vectorperiodo2[i]=califica2; //guardamos el valor obtenido en le vector   
            
           return i;
           
       }
       
        public int periodo3(int i)
       {
           
   
                String calificaciones3= JOptionPane.showInputDialog("Calificaciones del tercer periodo:  ");  //mostramos el cuadro de dialogo donde pedimos las votaciones
          
                while (!esNumero(calificaciones3)) {// preguntamos si el valor optenido es un numero con el metodo esNumero 
                calificaciones3= JOptionPane.showInputDialog("Calificaciones del tercer periodo:  "); // si hay un valor incorrecto volvemos apedir el valor numerico
                }
         
                califica3 = Integer.parseInt(calificaciones3); // covertimos los valores string obtenidos a enteros para el vector
                vectorperiodo3[i]=califica3; //guardamos el valor obtenido en le vector   
            
           return i;
           
       }
       
       public void mostrar(){
            
            int aumento1=0;//contador de aumento para pintar las casilla de votaciones del arreglo
            int aumento2=0;//contador de aumento para pintar las casilla de votaciones del arreglo
            int aumento3=0;//contador de aumento para pintar las casilla de votaciones del arreglo
            int aumento4=0;//contador de aumento para pintar las casilla de votaciones del arreglo
            
            
             for(int i=0; i<vectoralumnos.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Alumnos:  ["+i+"] ="+ vectoralumnos[i]);// imprimimos los valores en consola 
          

        textoalumnos = new JTextField(); // creamos el objeto de cuadro de texto 
        textoalumnos.setBounds(350+aumento1, 60, 50, 30); // lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
       textoalumnos.setText(vectoralumnos[i]);// convertimos el valor en enteros para colocarlo en la caja de texto 
        jpanel.add(textoalumnos); // pegamos las caja de texto en el jpanel
        
        aumento1 = aumento1+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
         
           }
             //*******************************************************//
            
             for(int j=0; j<vectorperiodo1.length;j++)// recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Calificaciones Periodo 1: ["+j+"] ="+ vectorperiodo1[j]); // imprimimos los valores en consola 
         
        textocalifica1 = new JTextField();// creamos el objeto de cuadro de texto 
        textocalifica1.setBounds(350+aumento2, 130, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textocalifica1.setText(Integer.toString(vectorperiodo1[j]));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textocalifica1);// pegamos las caja de texto en el jpanel
        
        aumento2 = aumento2+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
           }                        
             ///*************************************************************///
             
                for(int k=0; k<vectorperiodo2.length;k++)// recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Calificaciones Periodo 2: ["+k+"] ="+ vectorperiodo2[k]); // imprimimos los valores en consola 
         
        textocalifica2 = new JTextField();// creamos el objeto de cuadro de texto 
        textocalifica2.setBounds(350+aumento3, 190, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textocalifica2.setText(Integer.toString(vectorperiodo2[k]));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textocalifica2);// pegamos las caja de texto en el jpanel
        
        aumento3 = aumento3+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
           }                        
           
            //****************************************************************/// 
            
                 for(int h=0; h<vectorperiodo3.length;h++)// recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Calificaciones Periodo 3: ["+h+"] ="+ vectorperiodo3[h]); // imprimimos los valores en consola 
         
        textocalifica3 = new JTextField();// creamos el objeto de cuadro de texto 
        textocalifica3.setBounds(350+aumento4, 250, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textocalifica3.setText(Integer.toString(vectorperiodo3[h]));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textocalifica3);// pegamos las caja de texto en el jpanel
        
        aumento4 = aumento4+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
           }                     
             
             botoncalifica.setEnabled(false); // Desactivamos boton           
        }
       
       
        public void letreros() {
 
        //Le asignamos un texto
        mensaje1.setText("PRIMER SEMESTRE");
        mensaje1.setBounds(120, 70, 150, 150);
        jpanel.add(mensaje1);
         mensaje2.setText("SEGUNDO SEMESTRE");
        mensaje2.setBounds(120, 130, 150, 150);
        jpanel.add(mensaje2);
         mensaje3.setText("TERCER SEMESTRE");
        mensaje3.setBounds(120, 190, 150, 150);
        jpanel.add(mensaje3);
        mensaje4.setText("_______________________________________________________________________________________________");
         mensaje4.setBounds(50, 220, 1000, 150);
        jpanel.add(mensaje4);
       
      
        }
       
        public void ordena1()
       {
           
        int aumento1=0;//contador de aumento para pintar las casilla de votaciones del arreglo
        int aumento2=0;//contador de aumento para pintar las casilla de votaciones del arreglo
        int aux;
        String aux2;
        int i; 
        int j;
        vectoralumnos1 = Arrays.copyOf(vectoralumnos, vectoralumnos.length);
        vectoralumnos2 = Arrays.copyOf(vectoralumnos, vectoralumnos.length);
        for(i=1; i<8; i++)
        {
            
            for(j=0; j<vectorperiodo1.length-1;j++)
            {
                if(vectorperiodo1[j]>vectorperiodo1[j+1])
                {
                    aux=vectorperiodo1[j];
                    vectorperiodo1[j]=vectorperiodo1[j+1];
                    vectorperiodo1[j+1]=aux;
                    aux2=vectoralumnos[j];
                    vectoralumnos[j]=vectoralumnos[j+1];
                    vectoralumnos[j+1]=aux2;
                }
            }
             
               }
        
        for(i=0; i<vectoralumnos.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Alumnos:  ["+i+"] ="+ vectoralumnos[i]+"Periodo 1:  ["+i+"] ="+ vectorperiodo1[i]);// imprimimos los valores en consola 
          

        textoordena1 = new JTextField(); // creamos el objeto de cuadro de texto 
        textoordena1.setBounds(350+aumento1, 310, 50, 30); // lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
       textoordena1.setText(vectoralumnos[i]);// convertimos el valor en enteros para colocarlo en la caja de texto 
        jpanel.add(textoordena1); // pegamos las caja de texto en el jpanel
        
        aumento1 = aumento1+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
             }
               for(i=0; i<vectorperiodo1.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         textoordena2 = new JTextField();// creamos el objeto de cuadro de texto 
        textoordena2.setBounds(350+aumento2, 360, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textoordena2.setText(Integer.toString(vectorperiodo1[i]));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textoordena2);// pegamos las caja de texto en el jpanel
        
        aumento2 = aumento2+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
        botonperiodo1.setEnabled(false); // Desactivamos boton        
              
           }
        
        }
       
       
        public void ordena2()
       {
           
        int aumento1=0;//contador de aumento para pintar las casilla de votaciones del arreglo
        int aumento2=0;//contador de aumento para pintar las casilla de votaciones del arreglo
        int aux;
        String aux3;
        int i; 
        int j;
        
        for(i=1; i<8; i++)
        {
            
            for(j=0; j<vectorperiodo2.length-1;j++)
            {
                if(vectorperiodo2[j]>vectorperiodo2[j+1])
                {
                    aux=vectorperiodo2[j];
                    vectorperiodo2[j]=vectorperiodo2[j+1];
                    vectorperiodo2[j+1]=aux;
                    aux3=vectoralumnos1[j];
                    vectoralumnos1[j]=vectoralumnos1[j+1];
                    vectoralumnos1[j+1]=aux3;
                }
            }
            
        
               }
         for(i=0; i<vectoralumnos.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Alumnos:  ["+i+"] ="+ vectoralumnos[i]+"Periodo 2:  ["+i+"] ="+ vectorperiodo2[i]);// imprimimos los valores en consola 
          

        textoordena11 = new JTextField(); // creamos el objeto de cuadro de texto 
        textoordena11.setBounds(350+aumento1, 410, 50, 30); // lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
       textoordena11.setText(vectoralumnos1[i]);// convertimos el valor en enteros para colocarlo en la caja de texto 
        jpanel.add(textoordena11); // pegamos las caja de texto en el jpanel
        
        aumento1 = aumento1+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
             }
               for(i=0; i<vectorperiodo2.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         textoordena3 = new JTextField();// creamos el objeto de cuadro de texto 
        textoordena3.setBounds(350+aumento2, 460, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textoordena3.setText(Integer.toString(vectorperiodo2[i]));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textoordena3);// pegamos las caja de texto en el jpanel
        
        aumento2 = aumento2+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
        botonperiodo2.setEnabled(false); // Desactivamos boton  
              
           }

        }
        
        
        public void ordena3()
       {
           
        int aumento1=0;//contador de aumento para pintar las casilla de votaciones del arreglo
        int aumento2=0;//contador de aumento para pintar las casilla de votaciones del arreglo
        int aux;
        String aux4;
        int i; 
        int j;
        for(i=1; i<8; i++)
        {
            
            for(j=0; j<vectorperiodo3.length-1;j++)
            {
                if(vectorperiodo3[j]>vectorperiodo3[j+1])
                {
                    aux=vectorperiodo3[j];
                    vectorperiodo3[j]=vectorperiodo3[j+1];
                    vectorperiodo3[j+1]=aux;
                    aux4=vectoralumnos2[j];
                    vectoralumnos2[j]=vectoralumnos2[j+1];
                    vectoralumnos2[j+1]=aux4;
                }
            }
            
               }
         for(i=0; i<vectoralumnos.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         System.out.println("Alumnos:  ["+i+"] ="+ vectoralumnos2[i]+"Periodo 3:  ["+i+"] ="+ vectorperiodo3[i]);// imprimimos los valores en consola 
          

        textoordena12 = new JTextField(); // creamos el objeto de cuadro de texto 
        textoordena12.setBounds(350+aumento1, 510, 50, 30); // lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
       textoordena12.setText(vectoralumnos2[i]);// convertimos el valor en enteros para colocarlo en la caja de texto 
        jpanel.add(textoordena12); // pegamos las caja de texto en el jpanel
        
        aumento1 = aumento1+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
             }
               for(i=0; i<vectorperiodo3.length;i++) // recorrevos el vesctor para mostrar los valores
           {
         textoordena4 = new JTextField();// creamos el objeto de cuadro de texto 
        textoordena4.setBounds(350+aumento2, 560, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textoordena4.setText(Integer.toString(vectorperiodo3[i]));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textoordena4);// pegamos las caja de texto en el jpanel
        
        aumento2 = aumento2+60; // AUMENTAMOS EL VALOR DE LA VARIABLE PARA QUE SE DIBUJEN LAS CAJAS DE TEXTO
         botonperiodo3.setEnabled(false); // Desactivamos boton
              
           }
        
        }
               
        public void busqueda1()
        {
            int mayor = vectorperiodo1[0];
            String mayoralumno = vectoralumnos[0];
            
            for (int i = 0; i < vectorperiodo1.length; i++) {
        if (vectorperiodo1[i] > mayor){
            mayor=vectorperiodo1[i];
            mayoralumno =vectoralumnos[i];
                }
           
            }
             System.out.println("Calificacion: "+mayor+"   Alumno_"+mayoralumno  );// imprimimos los valores en consola 
             
          
        
         textomejor2 = new JTextField();// creamos el objeto de cuadro de texto 
        textomejor2.setBounds(50, 660, 200, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textomejor2.setText(mayoralumno);// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textomejor2);// pegamos las caja de texto en el jpanel
        
        textomejor1 = new JTextField();// creamos el objeto de cuadro de texto 
        textomejor1.setBounds(130, 690, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textomejor1.setText(Integer.toString(mayor));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textomejor1);// pegamos las caja de texto en el jpanel
        }
        
        
        
         public void busqueda2()
        {
            int mayor = vectorperiodo2[0];
            String mayoralumno1 = vectoralumnos1[0];
            
            for (int i = 0; i < vectorperiodo2.length; i++) {
        if (vectorperiodo1[i] > mayor){
            mayor=vectorperiodo2[i];
            mayoralumno1 =vectoralumnos1[i];
                }
           
            }
             System.out.println("Calificacion: "+mayor+"   Alumno_"+mayoralumno1  );// imprimimos los valores en consola 
             
          
        
         textomejor2 = new JTextField();// creamos el objeto de cuadro de texto 
        textomejor2.setBounds(300, 660, 200, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textomejor2.setText(mayoralumno1);// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textomejor2);// pegamos las caja de texto en el jpanel
        
        textomejor1 = new JTextField();// creamos el objeto de cuadro de texto 
        textomejor1.setBounds(370, 690, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textomejor1.setText(Integer.toString(mayor));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textomejor1);// pegamos las caja de texto en el jpanel
        }
         
         public void busqueda3()
        {
            int mayor = vectorperiodo3[0];
            String mayoralumno2 = vectoralumnos2[0];
            
            for (int i = 0; i < vectorperiodo3.length; i++) {
        if (vectorperiodo3[i] > mayor){
            mayor=vectorperiodo3[i];
            mayoralumno2 =vectoralumnos2[i];
                }
           
            }
             System.out.println("Calificacion: "+mayor+"   Alumno_"+mayoralumno2  );// imprimimos los valores en consola 
             
          
        
         textomejor2 = new JTextField();// creamos el objeto de cuadro de texto 
        textomejor2.setBounds(550, 660, 200, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textomejor2.setText(mayoralumno2);// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textomejor2);// pegamos las caja de texto en el jpanel
        
        textomejor1 = new JTextField();// creamos el objeto de cuadro de texto 
        textomejor1.setBounds(600, 690, 50, 30);// lo posicionamos en le jpanel, en este punto usamos aumento para recorrer el cuadro de texto
        textomejor1.setText(Integer.toString(mayor));// convertimos el valor en enteros para colocarlo en la caja de texto
        jpanel.add(textomejor1);// pegamos las caja de texto en el jpanel
        }
        
       private static boolean esNumero(String Regis) {
		
                try {
			Integer.parseInt(Regis); // validamos que se aun un numero entero
			return true; // devolver si es verdadero
		} catch (NumberFormatException e) { /* NumberFormatException sirve para  
validar si ha intentado convertir una cadena a uno de los tipos numéricos, pero que la cadena no tiene el formato adecuado por lo que rtorna false*/
		JOptionPane.showMessageDialog(null, "LA CALIFICACION DEBE DE SER UN ENTERO","ATENCION", JOptionPane.WARNING_MESSAGE);	//mensaje donde indicamos que esta erroneo 
                    return false;
		} 
	}
}
