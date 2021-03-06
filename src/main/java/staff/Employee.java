package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void changeName(String newName) {
        if(newName != "" && newName != null) {
            this.name = newName;
        }
    }

    public void raiseSalary(double increment){
        if(increment > 0) {
            this.salary += increment;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
