/*
Conceito:
try: bloco que pode lançar exceção.

catch: trata a exceção.

throw: lança uma exceção manualmente.

throws: indica que um método pode lançar uma exceção.
*/


public class Questao4 {

    public static void metodoComThrows(String texto) throws IllegalArgumentException {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("Texto inválido!");
        }
        System.out.println("Texto válido: " + texto);
    }

    public static void main(String[] args) {
        try {
            metodoComThrows("");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("Programa continua executando.");
    }
}
