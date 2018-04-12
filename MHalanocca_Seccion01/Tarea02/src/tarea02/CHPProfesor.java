package tarea02;

import javax.swing.JLabel;

public class CHPProfesor extends CPersona{
    String pCodigo;
    String cDictar;
    String nCursosDictar;


    public void DatosProfesor(String pCodigo, String cDictar, String nCursosDictar) {
        
        this.pCodigo = pCodigo;
        this.cDictar = cDictar;
        this.nCursosDictar = nCursosDictar;
    }

    public void setCDictar(String cDictar) {
        this.cDictar = cDictar;
    }

    public String getCDictar() {
        return cDictar;
    }

    public CHPProfesor(String pCodigo, String nCursosDictar) {
        super();
        this.pCodigo = pCodigo;
        this.nCursosDictar = nCursosDictar;
    }

    public void setPCodigo(String pCodigo) {
        this.pCodigo = pCodigo;
    }

    public String getPCodigo() {
        return pCodigo;
    }

    public void setNCursosDictar(String nCursosDictar) {
        this.nCursosDictar = nCursosDictar;
    }

    public String getNCursosDictar() {
        return nCursosDictar;
    }
    public void preparaExamen(){
        System.out.println("Usted tiene que preparar el Examen para sus alumnos");
    }
    public void Dictar() {
        System.out.println("Ustede tiene que dictar Clases ");
    }
    public CHPProfesor() {
        super();
    }
    void mostarDatos(JLabel LbCodigoProfesor, JLabel LbCursoaDictar, JLabel LbNCursosProfesor) 
    {
        LbCodigoProfesor.setText(pCodigo);
        LbCursoaDictar.setText(cDictar);
        LbNCursosProfesor.setText(nCursosDictar);
    }
}
