package entities;

public final class FuncionariosTerceirizados extends Funcionarios {
    private Double custoAdicional;

    public FuncionariosTerceirizados() {
    }

    public FuncionariosTerceirizados(String nome, Integer hora, Double valorPorHora, Double custoAdicional) {
        super(nome, hora, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    public Double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(Double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public Double pagamento() {
        return (valorPorHora * hora) + (1.1 * custoAdicional);
    }
}
