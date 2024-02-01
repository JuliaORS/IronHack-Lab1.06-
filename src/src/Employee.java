public class Employee {

    // PROTECTED VARIABLES
    private String name;
    private String email;
    private byte age;
    private int salary;

    //CONSTRUCTOR
    public Employee (String name, String email, byte age, int salary){
        if (checkSalary(salary)){
            setName(name);
            setEmail(email);
            setAge(age);
            setSalary(salary);
        }
    }
//String email, int age, int salary

    //GETTERS
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public byte getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        if (checkSalary(salary))
            this.salary = salary;
    }

    public boolean checkSalary(int salary){
        return true;
    }

}

