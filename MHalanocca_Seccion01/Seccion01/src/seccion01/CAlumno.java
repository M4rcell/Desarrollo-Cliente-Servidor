package seccion01;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CAlumno {
    String nombre ;
    int edad ;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    //void MostrarHolaMundo(JTextArea jTextArea1) {
      //  for (int i = 0; i < 5; i++) 
        //{
         //   jTextArea1.add("Hola Mundo");
        //}
    //}
    void mostrarBienvenida(JLabel LbBienvenido) {
        LbBienvenido.setText("Bienvenidido "+ nombre +" a mi primer Hola Mundo");
    }
    void mostrar(JLabel LbNombre, JLabel LbEdad) {
        String eda;
        eda=Integer.toString(edad);
        LbNombre.setText(nombre);
        LbEdad.setText(eda);
    }
    public CAlumno() {
        super();
    }


   
}
