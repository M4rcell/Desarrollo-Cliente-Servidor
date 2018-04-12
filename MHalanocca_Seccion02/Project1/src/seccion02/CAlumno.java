package seccion02;

import com.sun.xml.internal.ws.client.RequestContext;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.print.attribute.standard.Destination;

import javax.swing.JOptionPane;

public class CAlumno {
    String aNombre="Marcel";
    String aApellidos;
    String aFechaNacimiento;
    int aEdad;
    int aCodigo;
    String aSexo;

    public CAlumno(String aNombre, String aApellidos, String aFechaNacimiento, int aEdad, int aCodigo, String aSexo) {
        this.aNombre = aNombre;
        this.aApellidos = aApellidos;
        this.aFechaNacimiento = aFechaNacimiento;
        this.aEdad = aEdad;
        this.aCodigo = aCodigo;
        this.aSexo = aSexo;
    }

    public void setANombre(String aNombre) {
        this.aNombre = aNombre;
    }

    public String getANombre() {
        return aNombre;
    }

    public void setAApellidos(String aApellidos) {
        this.aApellidos = aApellidos;
    }

    public String getAApellidos() {
        return aApellidos;
    }

    public void setAFechaNacimiento(String aFechaNacimiento) {
        this.aFechaNacimiento = aFechaNacimiento;
    }

    public String getAFechaNacimiento() {
        return aFechaNacimiento;
    }

    public void setAEdad(int aEdad) {
        this.aEdad = aEdad;
    }

    public int getAEdad() {
        return aEdad;
    }

    public void setACodigo(int aCodigo) {
        this.aCodigo = aCodigo;
    }

    public int getACodigo() {
        return aCodigo;
    }

    public void setASexo(String aSexo) {
        this.aSexo = aSexo;
    }

    public String getASexo() {
        return aSexo;
    }
    public String showMessages(){

        // adding info message
        FacesMessage infoMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, 
            "Informacion "," NOMBRE :"+ aNombre + "     APELLIDOS : " +aApellidos +"    FECHA DE NACIMIENTO : " +aFechaNacimiento + "      EDAD : "+ aEdad + "    CODIGO : " +aCodigo + "     SEXO : "+aSexo);
        FacesContext.getCurrentInstance().addMessage("", infoMessage);
        return null;

    }
    
    public CAlumno() {
        super();
    }
}
