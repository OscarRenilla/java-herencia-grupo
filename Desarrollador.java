public class Desarrollador extends Empleado {

    private String lenguajePrincipal;

    public Desarrollador(String dni, String nombre, int edad, double salario, int antiguedadAnios, String lenguajePrincipal){
        super (dni, edad, salario, antiguedadAnios, lenguajePrincipal);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public String setLenguajePrincipal(String lenguajePrincipal){
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override 
    public double calcularSalario() {
        double bonus = 0;

        switch (lenguajePrincipal.toLowercase()) {
            case "java":
                bonus = 500;
                break; 
            case"python":
                bonus = 400;
                break;
            case "javaScript":
                bonus = 300;
                break;
            default:
                bonus = 200;
        }
        return salarioBase + bonus + (antiguedadAnios * 50);
    }
}
