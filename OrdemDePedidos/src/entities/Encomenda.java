package entities;

import entities.enums.EncomendaStatus;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Encomenda {
    private Instant dataEncomenda;
    private EncomendaStatus status;
    private Cliente cliente;
    private List<EncomendaItens> itens = new ArrayList<>();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm;ss");

    public Encomenda(){
    }

    public Encomenda(EncomendaStatus status, Cliente cliente) {
        this.status = status;
        this.cliente = cliente;
        dataEncomenda = Instant.now();
    }

    public String getDataEncomenda() {
        return dataEncomenda.atZone(ZoneId.systemDefault()).format(formatter);
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(EncomendaStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<EncomendaItens> getItens() {
        return itens;
    }

    public void adicionarItem(EncomendaItens item) {
        itens.add(item);
    }

    public void removerItem(EncomendaItens item) {
        itens.remove(item);
    }

    public double precoTotal() {
        double somaPreco = 0;

        for (EncomendaItens i : itens) {
            somaPreco += i.getPrecoTotalProduto();
        }

        return somaPreco;
    }
}
