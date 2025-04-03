package module.services;

import module.entities.Contrato;
import module.entities.Parcelas;

import java.time.LocalDate;

public class ServicoContrato {
    private ServicoPagamentoOnline servicoPagamentoOnline;

    public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    public void processarPagamento(Contrato contrato, Integer meses) {
        double quota = contrato.getValorTotalContrato() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate dataParcela = contrato.getDataContrato().plusMonths(i);
            double jurosParcela = servicoPagamentoOnline.juros(quota, i);
            double parcelaComJuros = quota + jurosParcela;
            double taxaParcela = servicoPagamentoOnline.taxaDePagamento(parcelaComJuros);
            double totalParcela = parcelaComJuros + taxaParcela;

            contrato.getParcelasLista().add(new Parcelas(dataParcela, totalParcela));
        }
    }
}
