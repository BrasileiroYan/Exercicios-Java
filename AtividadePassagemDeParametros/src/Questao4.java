public class Questao4 {
    public static void imprimirNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        imprimirNomes("Yan", "Pequeno", "Eduardo");
        imprimirNomes(); // também funciona com nenhum argumento
    }
}
