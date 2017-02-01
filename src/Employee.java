/**
 * A class that maintains information on an employee.
 * This might form part of a larger application such
 * as a payroll system, for instance.
 *
 * @author Jarred Black 101000247
 * @version 1/24/17
 */

public class Employee{
    private int id;
    private String name;
    private int age;
    private String title;
    private double salary;
    private String phone_number;

    public Employee(int id, String name, int age, String title, double salary, String phone_number){
        this.id = id;
        this.name = name;
        this.age = age;
        this.title = title;
        this.salary = salary;
        this.phone_number = phone_number;
    }

    public Employee(Employee employee){
        this(employee.id, employee.name, employee.age, employee.title, employee.salary ,employee.phone_number);
    }

    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee(){
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setPhoneNumber(String phone_number){
        this.phone_number = phone_number;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public  String getTitle(){
        return this.title;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getPhoneNumber(){
        return this.phone_number;
    }

    public double increaseSalary(int percentageOfIncrease){
        this.salary = this.salary + ((percentageOfIncrease / 100.0f) * this.salary);
        this.salary = Math.round(this.salary * 100.0) / 100.0;
        return this.salary;
    }

    public double increaseSalary(int percentageOfIncrease, String newtitle) {
        setSalary(increaseSalary(percentageOfIncrease));
        setTitle(newtitle);
        return this.salary;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (age != employee.age) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        if (!name.equals(employee.name)) return false;
        if (!title.equals(employee.title)) return false;
        return phone_number.equals(employee.phone_number);
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    public static int employeeCounter;

    public void IncreaseEmployeeCounter(int employeeCounter){
        employeeCounter++;
    }

    public int getEmployeeCounter(){
        return employeeCounter;
    }
}


