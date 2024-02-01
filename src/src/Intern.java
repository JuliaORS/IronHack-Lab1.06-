public class Intern extends Employee{
    private final int MAX_SALARY = 20000;
    public Intern (String name, String email, byte age, int salary){
        super(name, email, age, salary);
    }

    public boolean checkSalary(int salary) {
        if (salary <= MAX_SALARY)
            return true;
        else{
            System.out.println("Salary of an intern can not exceed of " + MAX_SALARY);
            return false;
        }
    }
}