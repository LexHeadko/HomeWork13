package HW13;

public class Main {
    private static final Employee[] employees = new Employee[10];

    private static void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void printSum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма всех зарплат: " + sum);
    }

    private static void printEmployeeWithMinSalary() {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
    }    private static void printEmployeeWithMaxSalary() {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
    }
    private static void printAverageSalary() {
        double sum = 0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                counter++;
            }
        }
        System.out.println("Средняя зарплата: " + sum/counter);
    }

    private static void printNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Тупак Ян Борисович", 1, 12_235.99);
        employees[1] = new Employee("Головач Елена Григорьевна", 2, 25_254.92);
        employees[2] = new Employee("Баргузин Баргузин Баргузинович", 3, 102_578.12);
        employees[3] = new Employee("Череззаборногузадерищенко Даздраперма Владленовна", 4, 500_000.02);
        employees[4] = new Employee("Головко Александр Константинович", 5, 81000.00);
        System.out.println("__________________________");
        printEmployees();
        System.out.println("__________________________");
        printSum();
        System.out.println("__________________________");
        printEmployeeWithMaxSalary();
        System.out.println("__________________________");
        printEmployeeWithMinSalary();
        System.out.println("__________________________");
        printAverageSalary();
        System.out.println("__________________________");
        printNames();
        System.out.println("__________________________");
    }
}
