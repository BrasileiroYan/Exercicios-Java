import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> employeeList = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.print("Enter salary cut: $");
            double salaryCut = sc.nextDouble();
            sc.nextLine();

            List<Employee> salaryCutList = employeeList.stream()
                    .filter(p -> p.getSalary() > salaryCut)
                    .sorted((s1, s2) -> s1.getEmail().toUpperCase().compareTo(s2.getEmail().toUpperCase()))
                    .toList();

            System.out.printf("Email of people whose salary is more than $%.2f:\n", salaryCut);
            salaryCutList.forEach(System.out::println);

            System.out.print("Enter the first letter of the names to filter: ");
            char firstLetterName = sc.nextLine().toUpperCase().charAt(0);

            double salarySum = employeeList.stream()
                    .filter(p -> p.getName().toUpperCase().charAt(0) == firstLetterName)
                    .mapToDouble(Employee::getSalary).sum();

            System.out.printf("Sum of salary of employees whose name starts with '%c': $%.2f\n", firstLetterName, salarySum);

            // C:\Users\Dell\OneDrive\Área de Trabalho\Exercicios-Java\Ex_OperacoesLambda\dados.csv.txt

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
