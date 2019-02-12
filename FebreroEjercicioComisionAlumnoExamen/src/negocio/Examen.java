
package negocio;

public class Examen {
    private int nroExamen;
    private String tema;
    private int nota;
    
    public Examen(int nro,String t,int n){
        nroExamen=nro;
        tema=t;
        if(n>0&&n<=10)
            nota=n;
        else
            nota=0;
    }
    public Examen(int nro,int n){
        nroExamen=nro;
        tema="Sin especificacion de tema";
        if(n>0&&n<=10)
            nota=n;
        else
            nota=0;
    }
    public void setNroExamen(int nro){
        nroExamen=nro;
    }
    public void setTema(String t){
        tema=t;
    }
    public void setNota(int n){
        if(n>0&&n<=10)
            nota=n;
        else
            nota=0;
    }
    public int getNroExamen(){
        return nroExamen;
    }
    public String getTema(){
        return tema;
    }
    public int getNota(){
        return nota;
    }
    public String toString(){
        String aviso=".";
        if(nota==0)
            aviso="/ATENCION: nota mal cargada/.";
        return "Nº: "+nroExamen+", Tema: "+tema+", Nota: "+nota+"("+resultado()+") "+aviso;
    }
    public boolean aprobado(){
        boolean aux=false;
        if(nota>=6)
            aux=true;
        return aux;
    }
    public String resultado(){
        if(aprobado())
            return "Aprobado";
        else
            return "Reprobado";
    }
    
    
}
