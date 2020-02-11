import java.util.Scanner;

public class nif {
    private String nif;
    private String direccion;
    private String nombrePadre;
    private String nombreMadre;

    public nif(String nif, String direccion, String nombrePadre, String nombremadre) {
        this.nif = nif;
        this.direccion = direccion;
        this.nombrePadre = nombrePadre;
        this.nombreMadre = nombreMadre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getNombremadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public void solicitarDatos(){
        Scanner lector=new Scanner(System.in);
        System.out.println("Escribe el nombre");
        this.setNif(lector.nextLine());
        System.out.println("Escribe el apellido 1");
        this.setDireccion(lector.nextLine());
        System.out.println("Escribe el apellido 2");
        this.setNombreMadre(lector.nextLine());
        //hay que poner los strings antes de los ints o daria error
        //this.setEdad(Integer.parseInt(lector.nextLine)));
        System.out.println("Escribe el nif");
        this.setNombrePadre(lector.nextLine());
        lector.close(); //cerrar scanner, cerrar recurso
    }

    public void mostrarAtributos(){
        System.out.println("El nombre es "+this.getNif());
        System.out.println("El apellido es "+this.getDireccion());
        System.out.println("El apellido es "+this.getNombrePadre());
        System.out.println("El nif es"+this.getNombremadre());
    }
}
