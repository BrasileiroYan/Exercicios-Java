package module.services;

public interface ServicoPagamentoOnline {
    Double taxaDePagamento(Double quantia);
    Double juros(Double quantia, Integer meses);
}
