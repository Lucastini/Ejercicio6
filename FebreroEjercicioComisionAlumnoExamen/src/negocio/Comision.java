
package negocio;

public class Comision {
    private String descripcion;
    private Alumno alumnos[];
    
    public Comision(){
        descripcion="Sin descripcion";
        alumnos=new Alumno[50];
    }
    public Comision(String desc){
        descripcion=desc;
        alumnos=new Alumno[50];
    }
    public void setDescripcion(String desc){
        descripcion=desc;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String toString(){
        return "Descripcion de la comision: "+descripcion;
    }
    public boolean addAlumno(Alumno a){
        boolean aux=false;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]==null){
                alumnos[i]=a;
                aux=true;
                break;
            }
        return aux;
    }
    public boolean removeAlumno(int legajo){
        boolean aux=false;
        for(int i=0;i<alumnos.length;i++)
            if(alumnos[i]!=null&&alumnos[i].getLegajo()==legajo){
                alumnos[i]=null;
                aux=true;
                break;
            }
        return aux;
    }
    
}
