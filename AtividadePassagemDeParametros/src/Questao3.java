class Pessoa {
    String nome;
}

public class Questao3 {
    public static void alterarNome(Pessoa p) {
        p.nome = "Maria";  // altera o atributo do objeto
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "João";

        alterarNome(pessoa);
        System.out.println(pessoa.nome); // Saída: Maria
    }
}
