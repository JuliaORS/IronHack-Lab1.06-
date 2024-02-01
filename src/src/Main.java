
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException{

        //Creates 10 Employee objects and prints all of their properties to a file named employees.txt.
        arrayInFile();

        //check maximum salary of Intern
        checkSalaryIntern();

    }

    static void arrayInFile() throws IOException {
        FileWriter writer = new FileWriter("employees.txt", true);

        byte NUM_EMPLOYEES = 10;

        String [] names = {"Julia", "Paula", "Pepe", "Clau", "Marta", "Marc", "Jose", "David", "Maria", "Tomas"};
        byte [] ages = {45, 23, 34, 65, 33, 45, 29, 49, 54, 56};
        int [] salary = {45000, 34000, 35000, 23000, 17000, 13000, 18000, 14000, 12000, 18000};

        writer.write("Name" + "\t\t" + "Email" + "\t\t\t" + "Age" + "\t" + "Salary\n");

        for (int i=0; i < NUM_EMPLOYEES; i++){
            Employee newEmployee = new Employee (names[i], names[i] + "@gmail.com", ages[i], salary[i]);
            writer.write(newEmployee.getName() + "\t" + newEmployee.getEmail() + "\t\t" +
                    newEmployee.getAge() + "\t" + newEmployee.getSalary() + "\n");
        }
        writer.close();
    }

    static void checkSalaryIntern(){

        //constructor with a salary that exceeds the maximum value
        byte agePepe = 32;
        byte agePipo = 40;
        Intern Pepe = new Intern ("Pepe","pepe@gmail.com", agePepe, 130000);

        //Set a salary that exceeds the maximum value
        Intern Pipo = new Intern ("Pipo","pipo@gmail.com", agePipo, 1300);

        System.out.println("Salary of Pipo before: " +  Pipo.getSalary());
        Pipo.setSalary(130000);
        System.out.println("Salary of Pipo after: " +  Pipo.getSalary()); //It has not changed
    }
}