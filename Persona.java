import java.util.Scanner;

public class Persona {
    public String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int edad;
    private nif infoNif=new nif();

    public Persona(String nombre, String apellido1, String apellido2, String nif, int edad) {
        this.setNombre(nombre);
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.edad = edad;
    }

    //constructor copia
    public Persona(Persona p1) {
        this.apellido1 = p1.apellido1;
        this.apellido1 = p1.apellido1;
        this.apellido2 = p1.apellido2;
        this.nombre = p1.nombre;
        this.nif = p1.nif;
        this.edad = p1.edad;
    }


    public Persona(){
    }
    //alt+insert getters y setters
    public String getNombre() {
        return nombre;
    }

    //poner nombre en mayusc
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase(); //creamos pero hay que usarlo
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void solicitarDatos(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe el nombre");
        this.setNombre(lector.nextLine());
        System.out.println("Escribe el apellido 1");
        this.setApellido1(lector.nextLine());
        System.out.println("Escribe el apellido 2");
        this.setApellido2(lector.nextLine());
        //hay que poner los strings antes de los ints o daria error
        //this.setEdad(Integer.parseInt(lector.nextLine)));
        System.out.println("Escribe el nif");
        this.setNif(lector.nextLine());
        System.out.println("Escribe la edad");
        this.setEdad(lector.nextInt());
        lector.close(); //cerrar scanner, cerrar recurso
    }

    public void mostrarAtributos(){
        System.out.println("El nombre es "+this.getNombre());
        System.out.println("El apellido es "+this.getApellido1());
        System.out.println("El apellido es "+this.getApellido2());
        System.out.println("El nif es"+this.getNif());
        System.out.println("La edad es "+this.getEdad());
    }

}
