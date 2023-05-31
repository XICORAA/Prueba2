package Funcion;

public class Persona {
    // atributos
    private String nombre = "";
    private int edad = 0;
    //constructor
    public Persona () {
    	System.out.println("El programa se esta ejecutando");
    	this.nombre = "Ximena";
        this.edad = 20;
    }
    
    //funciones
    public void comer() {
    	System.out.println("Comiendo....");
    }
    
    public void correr () {
    	System.out.println("Comiendo....");
    }
    public void dormir () { 
    	System.out.println("Dumiendo....");
    }
    public void bailar () {
    	System.out.println("bailar");
    }
}
