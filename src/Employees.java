import JavaTpoint.JavaObjectToJSON.department;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Employees {
    public static void main(String[] args) {

        department dept = new department();
        department dept2 = new department();

        dept.setDepartment_name("Finance");
        dept.setName("Hacer");
        dept.setSurname("Ercan");
        dept.setSalary(15000);


        dept2.setDepartment_name("IT");
        dept2.setName("Tuğba");
        dept2.setSurname("Yeşil Çimenli");
        dept2.setSalary(15000);


        System.out.println(dept);
        System.out.println(dept2);

    }
}