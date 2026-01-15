public class Empleado extends Persona {
    protected double salarioBase;
    protected int antiguedadAnios;
    
    public Empleado(String dni, String nombre, int edad, 
                    double salarioBase, int antiguedadAnios) {
        super(dni, nombre, edad);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
    }
    
    
    public double calcularSalario() {
        return salarioBase;
    }
    
    public double getSalarioBase() {
        return salarioBase;
    }
    
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }
    
    
    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }
    
    
    @Override
    public String toString() {
        return "Empleado: " + getNombre() + 
               ", DNI: " + getDni() +
               ", Edad: " + getEdad() +
               ", Antigüedad: " + antiguedadAnios + " años" +
               ", Salario base: " + salarioBase + "€";
    }
    
    
    @Override
    public String presentarse() {
        return super.presentarse() + 
               ". Soy empleado con " + antiguedadAnios + 
               " años de antigüedad.";
    }
}