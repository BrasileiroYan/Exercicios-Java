package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String endereco;
    private String sexo;
    private LocalDate dataNascimento;
    private List<ConsultaExame> exames = new ArrayList<>();

    public Pessoa(){
    }

    public Pessoa(String nome, String endereco, String sexo, LocalDate dataNascimento){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<ConsultaExame> getExames() {
        return exames;
    }

    public void adicionarConsultaExames(ConsultaExame exame) {
        exames.add(exame);
    }

    public void removerConsultaExames(ConsultaExame exame) {
        exames.remove(exame);
    }
}
