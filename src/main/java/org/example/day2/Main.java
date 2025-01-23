package org.example.day2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // We need to store Employee data
        //An employee will have a name, an id, and a Car which is optional, salary
        // A Car will have car_id, brand name, color

        //Create a Data Structure that expose below operations
           // 1. insert an employee to the store
          // 2. Delete an employee by id
          //3. Print an employee by id
          // 4. print all employee

        Car legender= new Car("toyota" ,"white");
        Car breeza= new Car("def","white");
        Employee e1 = new Employee("ABC" , 10000, legender);
        Employee e2 = new Employee("DEF" , 20000, breeza);
        Employee e3 = new Employee("GHI" , 30000, breeza);
        Employee e4 = new Employee("MNO" , 40000, breeza);
        Employee e5 = new Employee("PQR" , 50000);

        EmployeeStore employeeStore = new EmployeeStore();
        employeeStore.insert(e1);
        employeeStore.insert(e2);
        employeeStore.insert(e3);
        employeeStore.insert(e4);
        employeeStore.insert(e5);
        employeeStore.delete(e4.getEmpId());
        employeeStore.print_by_id(e3.getEmpId());
        employeeStore.print_by_id(e5.getEmpId());
        System.out.println("Printing all Employees");
        employeeStore.print();

        System.out.println(Employee.getEmpCount());

    }
}