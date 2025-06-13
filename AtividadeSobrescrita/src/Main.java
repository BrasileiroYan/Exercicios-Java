import entities.Hospital;
import entities.Medico;
import entities.Paciente;
import entities.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa p1 = new Paciente("Yan", "R. Ipê, 205", 18, "123.456.789-10", "Masculino", "Resfriado", "Descanso e banho quente");
        listaDePessoas.add(p1);

        Hospital hospital = new Hospital("Ijf", "R. Barão do Rio Branco, 1816");

        Pessoa p2 = new Medico("Giovanna", "R. Nelson Machado, 466", 21, "246.810.121-40", "Feminino", "00000-00", 9500.50, "Cirurgião de cabeça e pescoço", hospital);
        listaDePessoas.add(p2);

        for (Pessoa p : listaDePessoas) {

            System.out.println(p.imprimirValores());
            p.andar();

            if (p instanceof Paciente) {
                ((Paciente) p).sentirDor();
                ((Paciente) p).receberAlta();
            } else if (p instanceof Medico) {
                ((Medico) p).plantao();
            }
        }
    }
}