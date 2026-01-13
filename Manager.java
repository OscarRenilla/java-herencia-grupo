public class Manager extends Empleado {
    protected int personasACargo; 

    public Manager(int personasACargo){
        super(personasACargo);
    }

    public int getPersonasACargo(){
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo){
        this.personasACargo = personasACargo; 
    }

    public double calcularSalario(){
        return calcularSalario;
    }
}