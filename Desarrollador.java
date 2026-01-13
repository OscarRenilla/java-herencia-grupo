public class Desarrollador extends Empleado {

    private String lenguajePrincipal;

    public Desarrollador(String lenguajePrincipal){
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public String setLenguajePrincipal(){
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public double calcularSalario(){
        return calcularSalario;
    }
}
