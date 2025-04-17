import java.time.LocalDate;

public class DemoFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Alice", LocalDate.of(2022, 1, 15), 2500.0);
        Funcionario f2 = new Funcionario("Bruno", LocalDate.of(2023, 6, 1), 3000.0);

        f1.tirarFerias();
        f2.tirarFerias(10);

        System.out.println(f1);
        System.out.println(f2);
    }
}