package tp2;

public class Persona {
    //Atributos
    String nombre;
    String apellido;
    int edad;
    int dni;
//Constructor
    public Persona(String nombre, String apellido, int edad, int dni)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni; 
    }
    //Metodos gets y sets
     public String getNombre()
     {
        return this.nombre;
    }
    public void setNombre(String Nombre){
        this.nombre=nombre;
    }
    public String getApellido()
     {
        return this.apellido;
    }
    public void setApellido(String Apellido){
        this.apellido=apellido;
    }
    public int getEdad()
     {
        return this.edad;
    }
    public void setEdad(String Edad){
        this.edad=edad;
    }
    public int getDNI()
     {
        return this.dni;
    }
    public void setDni(String Nombre)
    {
        this.dni=dni;
    }
    public boolean MayorDeEdad(){
        if(edad>=18)
        return true;
        else{
            
        }
            return false;

    }
}
