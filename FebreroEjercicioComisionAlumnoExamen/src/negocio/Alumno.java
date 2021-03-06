
package negocio;

public class Alumno {
    private int legajo;
    private static int nro=1;
    private String nombre;
    private String apellido;
    private Examen examenes[];
    private int cantExamRendidos;
    
    public Alumno(){
        legajo=nro;
        nro++;
        nombre="Sin nombre";
        apellido="Sin apellido";
        examenes=new Examen[30];
    }
    public Alumno(String nom,String ape){
        legajo=nro;
        nro++;
        nombre=nom;
        apellido=ape;
        examenes=new Examen[30];
    }
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setApellido(String ape){
        apellido=ape;
    }
    public int getLegajo(){
        return legajo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int cantidadExamenesRendidos(){
        return cantExamRendidos;
    }
    public String toString(){
        return "Legajo Nº: "+legajo+", Nombre: "+nombre+", Apellido: "+apellido+", Examenes rendidos: "+cantExamRendidos+"\n"+getExamenes();
    }
    
    public boolean addExamen(Examen e){
        boolean aux=false;
        if(e!=null)
            for(int i=0;i<examenes.length;i++)
                if(examenes[i]==null){
                    examenes[i]=e;
                    cantExamRendidos++;
                    aux=true;
                    break;
                }
        return aux;  
        }
    
    public Examen buscarExamen(int nroExamen){
        Examen aux=null;
        for(int i=0;i<examenes.length;i++)
            if(examenes[i]!=null&&examenes[i].getNroExamen()==nroExamen){
                aux=examenes[i];
                break;
            }
        return aux;
    }
    
    public boolean removeExamen(int nroExamen){
        boolean aux=false;
        for(int i=0;i<examenes.length;i++)
            if(examenes[i]!=null&&examenes[i].getNroExamen()==nroExamen){
                examenes[i]=null;
                cantExamRendidos--;
                aux=true;
                break;
            }
        return aux;    
    }
    
    public boolean modExamen(int nroExamen, int nuevaNota){
        boolean aux=false;
        if(nuevaNota>=1&&nuevaNota<=10)
            for(int i=0;i<examenes.length;i++)
                if(examenes[i]!=null&&examenes[i].getNroExamen()==nroExamen){
                    examenes[i].setNota(nuevaNota);
                    aux=true;
                    break;
                }
        return aux;
    }
    
    public double notaPromedio(){
        double aux=0d;
        for(int i=0;i<examenes.length;i++)
            if(examenes[i]!=null){
                aux+=examenes[i].getNota();
            }
        if(cantExamRendidos!=0)
            return aux/cantExamRendidos;
        else
            return 0d;
    }
    public int mayorNota(){
        int aux=0;
        for(int i=0;i<examenes.length;i++)
            if(examenes[i]!=null&&examenes[i].getNota()>aux)
                aux=examenes[i].getNota();
        return aux;
    }
    public int menorNota(){
        int aux=11;
        for(int i=0;i<examenes.length;i++)
            if(examenes[i]!=null&&examenes[i].getNota()<aux)
                aux=examenes[i].getNota();
        if(aux==11)
            aux=0;
        return aux;
    }
    public int difMayMen(){
        int dif=-1;
        if(cantExamRendidos>=2)
            dif=mayorNota()-menorNota();
        return dif;
    }
    public double porcAprobacion(){
        double porc=0d;
        int contAprob=0;
        if(cantExamRendidos!=0){
            for(int i=0;i<examenes.length;i++)
                if(examenes[i]!=null)
                    if(examenes[i].aprobado())
                        contAprob++;
            porc=contAprob*100/cantExamRendidos;
        }
        return (double)porc;
    }
    public String getExamenes(){
        String aux="Datos de examenes: ";
        String aux2=aux;
        for(int i=0;i<examenes.length;i++)
            if(examenes[i]!=null)
                aux+="\nExamen "+examenes[i].toString();
        if(aux2.equals(aux))
            aux+="El Alumno aun no tiene examenes cargados";
        return aux;            
    }
    public String otrosDatosExamenes(){
        return "Promedio examenes cargados: "+notaPromedio()+", Nota mayor: "+mayorNota()+", Nota menor: "+menorNota()+", Dispercion: "+difMayMen()+", Porcentaje aprob: "+porcAprobacion()+"%";
    }
    
    
    
    
    
    }
    
    
    
    

