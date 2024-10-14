package JavaTpoint.JavaObjectToJSON;

public class department {

    String department_name;
    int    salary;
    String name;
    String surname;



    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String toString() {
        return "Employee [department_name = " + department_name + ", salary = " + salary + ", name = " + name + ", surname = "
                +surname + " ]";

    }

}



