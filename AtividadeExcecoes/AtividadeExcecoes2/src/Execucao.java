public class Execucao {
    public static void main(String[] args) {
        Data[] datasTeste = {
                criarData(10, 5, 2023),
                criarData(31, 4, 2023),
                criarData(29, 2, 2023),
                criarData(15, 13, 2023),
                criarData(0, 1, 2023),
                criarData(15, 7, 0),
                criarData(28, 2, 2023)
        };

        for (Data d : datasTeste) {
            if (d != null) {
                System.out.println("Data criada com sucesso: " + d);
            }
        }
    }

    private static Data criarData(int dia, int mes, int ano) {
        try {
            return new Data(dia, mes, ano);
        } catch (DataException e) {
            System.out.println("Erro ao criar data: " + e);
            return null;
        }
    }
}
