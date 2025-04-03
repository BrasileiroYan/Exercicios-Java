package module.services;

public class ServicoPayPal implements ServicoPagamentoOnline{

    private static final Double juro = 0.01;
    private static final Double taxaPagamento = 0.02;

    @Override
    public Double taxaDePagamento(Double quantia) {
        return quantia * taxaPagamento;
    }

    @Override
    public Double juros(Double quantia, Integer meses) {
        return quantia * juro * meses;
    }
}
