public class Empleado extends Persona {
    protected double salarioBase;
    protected int antiguedadAnios;
    
    public Empleado(String dni, String nombre, int edad, 
                    double salarioBase, int antiguedadAnios) {
        super(dni, nombre, edad);
        this.salarioBase = salarioBase;
        this.antiguedadAnios = antiguedadAnios;
    }
    
    /**
     * Calcula el salario del empleado.
     */
    public double calcularSalario() {
        return salarioBase;
    }
    
    /**
     * Obtiene el salario base
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    
    /**
     * Establece el salario base
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    /**
     * Obtiene los años de antigüedad
     */
    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }
    
    /**
     * Establece los años de antigüedad
     */
    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }
    
    /**
     * Sobrescribe el método toString() para mostrar información del empleado
     */
    @Override
    public String toString() {
        return "Empleado: " + getNombre() + 
               ", DNI: " + getDni() +
               ", Edad: " + getEdad() +
               ", Antigüedad: " + antiguedadAnios + " años" +
               ", Salario base: " + salarioBase + "€";
    }
    
    /**
     * Sobrescribe el método presentarse() de Persona
     */
    @Override
    public String presentarse() {
        return super.presentarse() + 
               ". Soy empleado con " + antiguedadAnios + 
               " años de antigüedad.";
    }
}