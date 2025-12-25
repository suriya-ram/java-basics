import java.util.*;
import java.util.stream.Collectors;

class Employee {
  int id;
  String name;
  String dept;
  int salary;

  Employee(int id, String name, String dept, int salary) {
    this.id = id;
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public int getSalary() {
    return salary;
  }
}
public class first{
public static void main(String args[]) {
  List<Employee> employees = List.of(
      new Employee(1, "Amit", "IT", 60000),
      new Employee(2, "Riya", "HR", 50000),
      new Employee(3, "John", "IT", 80000),
      new Employee(4, "Sara", "HR", 70000),
      new Employee(5, "David", "Finance", 90000));

   List<String> emp =    employees.stream().filter(e->e.salary>5000)
                         .map(Employee::getName).collect(Collectors.toList());
System.out.println(emp);
List<List<Integer>> nums = List.of(
    List.of(1, 2),
    List.of(3, 4)
);
   List<Integer>res= nums.stream().flatMap(list->list.stream()).collect(Collectors.toList());
   System.out.println(res);

}
}
