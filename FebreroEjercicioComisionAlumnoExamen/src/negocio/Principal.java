
package negocio;

public class Principal {

    public static void main(String[] args) {
        Examen e1,e2,e3,e4,e5;
        e1=new Examen(123,"Matematica",7);
        e2=new Examen(124,11);
        e3=new Examen(125,"Lengua",2);
        e4=new Examen(126,"Fisica",8);
        e5=new Examen(127,10);
        
        System.out.println("Datos originales Examen");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        System.out.println(e5.toString());
      
        Alumno a1,a2,a3,a4,a5;
        a1=new Alumno("Lucas", "Pagliettini");
        System.out.println("\nDatos originales de a1:\n"+a1.toString());
        System.out.println("\nAgregando a a1 examen 1 "+a1.addExamen(e1));
        System.out.println("Agregando a a1 examen 2 "+a1.addExamen(e2));
        System.out.println("Agregando a a1 examen 3 "+a1.addExamen(e3));
        System.out.println("Agregando a a1 examen 4 "+a1.addExamen(e4));
        System.out.println("Agregando a a1 examen 5 "+a1.addExamen(e5));
        System.out.println("Luego de carga de examenes: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 2 "+a1.modExamen(124,10));
        System.out.println("Luego de examen 2 modificado: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a1.modExamen(125,3));
        System.out.println("Luego de examen 3 modificado: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
        
        System.out.println("\nEliminando examen 5: "+a1.removeExamen(127));
        System.out.println("Datos Finales de alumno a1: "+a1.toString());
        System.out.println("Otros datos examenes a1: "+a1.otrosDatosExamenes());
      
        
        a2=new Alumno();
        System.out.println("\n\nDatos originales de a2: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        System.out.println("\nAgregando a a2 examen 1 "+a2.addExamen(e1));
        System.out.println("Agregando a a2 examen 2 "+a2.addExamen(e2));
        System.out.println("Agregando a a2 examen 3 "+a2.addExamen(e3));
        System.out.println("Agregando a a2 examen 4 "+a2.addExamen(e4));
        System.out.println("Agregando a a2 examen 5 "+a2.addExamen(e5));
        System.out.println("Luego de carga de examenes: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a2.modExamen(125,6));
        System.out.println("Luego de examen 3 modificado: "+a2.toString());
        System.out.println("Otros datos examenes a2: "+a2.otrosDatosExamenes());
        
        
        a3=new Alumno();
        System.out.println("\n\nDatos originales de a3: "+a3.toString());
        System.out.println("Otros datos examenes a3: "+a3.otrosDatosExamenes());
        
        System.out.println("\nAgregando a a3 examen 1 "+a3.addExamen(e1));
        System.out.println("Agregando a a3 examen 2 "+a3.addExamen(e2));
        System.out.println("Agregando a a3 examen 3 "+a3.addExamen(e3));
        System.out.println("Agregando a a3 examen 4 "+a3.addExamen(e4));
        System.out.println("Luego de carga de examenes: "+a3.toString());
        System.out.println("Otros datos examenes a3: "+a3.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 3 "+a3.modExamen(125,5));
        System.out.println("Luego de examen 2 modificado: "+a3.toString());
        System.out.println("Otros datos examenes a2: "+a3.otrosDatosExamenes());
        
        System.out.println("\nModificando nota examen 4 "+a3.modExamen(126,4));
        System.out.println("Luego de examen 4 modificado: "+a3.toString());
        System.out.println("Otros datos examenes a2: "+a3.otrosDatosExamenes());
        
        System.out.println("\nEliminando examen 2: "+a3.removeExamen(124));
        System.out.println("Datos Finales de alumno a3: "+a3.toString());
        System.out.println("Otros datos examenes a1: "+a3.otrosDatosExamenes());
        
    }
  
}
