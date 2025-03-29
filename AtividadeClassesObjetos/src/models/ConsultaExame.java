package models;

import java.time.LocalDate;

public class ConsultaExame {
    private LocalDate dataExame;
    private String tipoExame;
    private ProfissionalSaude profissional;

    public ConsultaExame() {
    }

    public ConsultaExame(LocalDate dataExame, String tipoExame, ProfissionalSaude profissional) {
        this.dataExame = dataExame;
        this.tipoExame = tipoExame;
        this.profissional = profissional;
    }

    public LocalDate getDataExame() {
        return dataExame;
    }

    public void setDataExame(LocalDate dataExame) {
        this.dataExame = dataExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public ProfissionalSaude getProfissional() {
        return profissional;
    }

    public void setProfissional(ProfissionalSaude profissional) {
        this.profissional = profissional;
    }
}
