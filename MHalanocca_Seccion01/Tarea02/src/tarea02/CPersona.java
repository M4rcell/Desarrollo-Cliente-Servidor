package tarea02;

import javax.swing.JLabel;

public class CPersona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String sexo;

    public void CHPersona(String nombre, String apellidos, int edad, String sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    void mostrar_Persona(JLabel LbNombre, JLabel LbApellidos, JLabel LbEdad, JLabel LbSexo)
    {
        LbNombre.setText(nombre);
        LbApellidos.setText(apellidos);
        LbEdad.setText(Integer.toString(edad));
        LbSexo.setText(sexo);
        }
        public void PertenecerUniversidad(){
        System.out.println("pertenecer a una universidad");
        }
}
