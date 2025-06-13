public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) throws DataException {
        if (ano < 1) {
            throw new DataException(dia, mes, ano, "Ano inválido.");
        }

        if (mes < 1 || mes > 12) {
            throw new DataException(dia, mes, ano, "Mês inválido.");
        }

        int maxDias;
        switch (mes) {
            case 2:
                maxDias = 28;
                break;
            case 4: case 6: case 9: case 11:
                maxDias = 30;
                break;
            default:
                maxDias = 31;
        }

        if (dia < 1 || dia > maxDias) {
            throw new DataException(dia, mes, ano, "Dia inválido para o mês informado.");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

