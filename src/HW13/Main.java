package HW13;

public class Main {
    private static final Employee[] employees = new Employee[10];

    private static void printSeparator() {
        System.out.println("__________________________");
    }
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
    }
    private static void printEmployeeWithMaxSalary() {
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

    private static void printSalaryIndexation(double index) {
        index = index / 100;
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index);
            }
        }
    }
    private static void printEmployeeWithMinSalaryInDepartment(int department) {
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min && department == employee.getDepartment()) {
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник департамента " + department + " с минимальной зарплатой: " + employeeWithMinSalary);
    }
    private static void printEmployeeWithMaxSalaryInDepartment(int department) {
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max && department == employee.getDepartment()) {
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник департамента " + department + " с максимальной зарплатой: " + employeeWithMaxSalary);
    }
    private static void printSumInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма всех зарплат в " + department + " отделе: " + sum);
    }
    private static void printAverageSalaryInDepartment(int department) {
        double sum = 0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                sum += employee.getSalary();
                counter++;
            }
        }
        System.out.println("Средняя зарплата в " + department + " отделе: " + sum/counter);
    }
    private static void printSalaryIndexationInDepartment (double index, int department) {
        index = index / 100;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * index);
            }
        }
    }
    private static void printNamesInDepartment (int department) {
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println("ID: "+ employee.getId()
                        + " ФИО: " + employee.getFullName()
                + " Зарплата: " + employee.getSalary());
            }
        }
    }
    private static void printEmployeeWithSalaryLessNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println("Сотрудник с зарплатой меньше " + number
                        + ": ID: "+ employee.getId()
                        + " | ФИО: " + employee.getFullName()
                        + " | Зарплата: " + employee.getSalary());
            }
        }
    }    private static void printEmployeeWithSalaryMoreNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > number) {
                System.out.println("Сотрудник с зарплатой больше " + number
                        + ": ID: "+ employee.getId()
                        + " | ФИО: " + employee.getFullName()
                        + " | Зарплата: " + employee.getSalary());
            }
        }
    }
    public static void main(String[] args) {
        employees[0] = new Employee("Тупак Ян Борисович", 1, 12_235.99);
        employees[1] = new Employee("Головач Елена Григорьевна", 2, 25_254.92);
        employees[2] = new Employee("Баргузин Баргузин Баргузинович", 3, 102_578.12);
        employees[3] = new Employee("Череззаборногузадерищенко Даздраперма Владленовна", 4, 500_000.02);
        employees[4] = new Employee("Головко Александр Константинович", 5, 81000.00);
        employees[5] = new Employee("Ганджубас Борис Борисович", 1, 15_235.99);
        employees[6] = new Employee("Головач Григорий Григорьевна", 2, 29_254.92);
        employees[7] = new Employee("Туземец Хасан Баграмович", 3, 102_578.12);
        employees[8] = new Employee("Худой Микола Тарасович", 4, 500_000.02);
        printSeparator();
        printEmployees();
        printSeparator();
        printEmployeeWithSalaryMoreNumber(52000);
        printSeparator();
        printEmployeeWithSalaryLessNumber(52000);
        //printNamesInDepartment(1);
        //printSum();
        //printSeparator();
        //printEmployeeWithMaxSalary();
        //printSeparator();
        //printEmployeeWithMinSalary();
        //printSeparator();
        //printAverageSalary();
        //printSeparator();
        //printNames();
        //printSeparator();
        //printSalaryIndexation(100);
        //printEmployees();
        //printSeparator();
        //printEmployeeWithMaxSalaryInDepartment(1);
        //printSeparator();
        //printEmployeeWithMinSalaryInDepartment(1);
        //printSeparator();
        //printSumInDepartment(1);
        //printSeparator();
        //printAverageSalaryInDepartment(1);
        //printSeparator();
        //printSalaryIndexationInDepartment(100, 1);
        //printEmployees();
    }
}
