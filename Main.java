import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("12345678A","Ana",30,1500.0,5);

        Desarrollador desarrollador = new Desarrollador("87654321B","Luis",28,1800.0,3,"Java");

        Manager manager = new Manager("11223344C","Marta",40,2200.0,10,6);

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleado);
        empleados.add(desarrollador);
        empleados.add(manager);


        for (Empleado e : empleados) {
            System.out.println("Tipo de objeto: " + e.getClass().getSimpleName());
            System.out.println(e.presentarse());
            System.out.println("Salario calculado: " + e.calcularSalario());
            System.out.println("----------------------------------");
        }
    }
}
