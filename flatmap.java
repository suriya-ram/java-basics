import java.util.*;
import java.util.stream.Collectors;

class Employee {
  String name;
  List<String> skills;

  Employee(String name, List<String> skills) {
    this.name = name;
    this.skills = skills;
  }

  public List<String> getSkills() {
    return skills;
  }
}

public class flatmap {
  public static void main(String args[]) {
    List<Employee> employees = List.of(
        new Employee("Amit", List.of("Java", "Spring")),
        new Employee("Riya", List.of("React", "Node")),
        new Employee("John", List.of("Java", "Docker")));

    List<String> empList = employees.stream().flatMap((e) -> e.getSkills().parallelStream()).collect(Collectors.toList());
    System.out.println(empList);
  }
}