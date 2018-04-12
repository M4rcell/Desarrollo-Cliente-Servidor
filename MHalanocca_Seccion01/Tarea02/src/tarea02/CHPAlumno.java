package tarea02;

import javax.swing.JLabel;

public class CHPAlumno extends CPersona{
    String aCodigo;
    int  nCursos;
    String Semestre;
    String Escuela;

    public void DatosAlumno(String aCodigo, int nCursos, String Semestre, String Escuela) {
        
        this.aCodigo = aCodigo;
        this.nCursos = nCursos;
        this.Semestre = Semestre;
        this.Escuela = Escuela;
    }


    public void setACodigo(String aCodigo) {
        this.aCodigo = aCodigo;
    }

    public String getACodigo() {
        return aCodigo;
    }

    public void setNCursos(int nCursos) {
        this.nCursos = nCursos;
    }

    public int getNCursos() {
        return nCursos;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public String getSemestre() {
        return Semestre;
    }

    public CHPAlumno() {
        super();
    }
    public void matricularse() {
        System.out.println("Usted pluede Matricularse");
    }
    public void Examen() {
        System.out.println("Usted puede dar Examen");
    }
    public void pagarPension(){
        System.out.println("Pagar la Pension");
    }
    void MostrarDatos(JLabel lbCodigoAlumno, JLabel LbEscuelaAlumno, JLabel LbNCAlumno, JLabel LbSemetre) {
        lbCodigoAlumno.setText(aCodigo);
        LbEscuelaAlumno.setText(Escuela);
        LbNCAlumno.setText(Integer.toString(nCursos));
        LbSemetre.setText(Semestre);
        
    }
}
