import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    private Employee() {

    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    private Employee(EmployeeBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.salary = builder.salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    static class EmployeeBuilder {

        private Integer id;
        private String name;
        private Double salary;

        public EmployeeBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", 1000.0));
        employees.add(new Employee(2, "Alex", 2000.0));
        employees.add(new Employee(2, "Mark", 3000.0));
        employees.add(new Employee(3, "Maria", 4000.0));

        Employee EmployeeByBuilder = new EmployeeBuilder()
                .withId(4)
                .withName("Joanna")
                .withSalary(5000.0)
                .build();

        employees.add(EmployeeByBuilder);

        // 1.
        List<String> names = employees.stream().filter(employee ->
                employee.getSalary() > 2000.0D).map(Employee::getName).collect(Collectors.toList());

        List<Employee> emp2 = employees.stream().filter(employee ->
                employee.getSalary() > 2000.0D).collect(Collectors.toList());

        names.forEach(System.out::println);

        //2
        List<Employee> newEmployeesIncreasing10perCent = employees.stream().map(employee -> {
            employee.setSalary(employee.getSalary() * 1.1);
            return employee;
        }).collect(Collectors.toList());

        List<Employee> newEmployeesDecreasing10perCent = employees.stream().map(employee -> {
            employee.setSalary(employee.getSalary() * 0.9);
            return employee;
        }).collect(Collectors.toList());


        Employee employeeHighestSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);

        Employee employeeHighestSalary2 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().orElse(null);



        List<Employee> emp3 = employees.stream().filter(emp ->
                emp.getSalary() > 2000.0D).collect(Collectors.toList());

        Double max = employees.stream().map(Employee::getSalary).reduce(Double.MIN_VALUE, Double::sum);
        Double min = employees.stream().map(Employee::getSalary).reduce(Double.MAX_VALUE, Double::min);
        System.out.println(max);
        System.out.println(employeeHighestSalary.getName());
    }

    public static void lol(){
        List<Employee> employees = new ArrayList<>();

        List<String> names = employees.stream().filter(emp -> emp.getSalary() > 1000.D).map(Employee::getName).collect(Collectors.toList());


        List<Employee> emp2 = employees.stream().filter(emp ->
                emp.getSalary() > 2000.0D).collect(Collectors.toList());

        List<Employee> emp3 = employees.stream().map(
                emp -> {
                    emp.setSalary(emp.getSalary() * 1.1);
                    return emp;
                }
        ).collect(Collectors.toList());

        Double amount = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
    }
}