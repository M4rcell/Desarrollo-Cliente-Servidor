package tarea01;

import com.toedter.calendar.JDateChooser;

import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;

public class CProfesor {
    String nombre;
    int nCursos;

    public CProfesor(String nombre, int nCursos) {
        this.nombre = nombre;
        this.nCursos = nCursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNCursos(int nCursos) {
        this.nCursos = nCursos;
    }

    public int getNCursos() {
        return nCursos;
    }

    public CProfesor() {
        super();
    }

    void calcular_Fecha(JDateChooser JdFIngreso, JLabel LbDTrabajo)
    {
        String anio;
                String mes;
                String dia;
                
                SimpleDateFormat formatoFecha = new SimpleDateFormat("YYY-MM-dd");
                String fecha = formatoFecha.format(JdFIngreso.getDate());
                       
                DateTimeFormatter  date = DateTimeFormatter.ofPattern("YYY-MM-dd");
                LocalDate FechaRegistro=LocalDate.parse(fecha);
                
                         
                      LocalDate fechaactual=LocalDate.now();
                
                     Period periodo= Period.between(FechaRegistro, fechaactual);

                         anio=String.valueOf(periodo.getYears());
                         mes=String.valueOf(periodo.getMonths());
                         dia=String.valueOf(periodo.getDays());
                        // jlDTrabajo.setText("Fecha ingresado  : "+fecha);
                       //  jlDTrabajo.setText("Actual : "+fechaactual);
                   // jlDTrabajo.setText("Actual : "+fechaactual+" fecha de registro : "+ FechaRegistro);
                     LbDTrabajo.setText(anio +" Años ; " +mes +" Meses ; "+dia + " Dias ");
    }

    void mostrar(JLabel LbNombre, JLabel LbNCursos) 
    {
        String cursos;
        cursos=Integer.toString(nCursos);
        LbNombre.setText(nombre);
        LbNCursos.setText(cursos);
    }
}
