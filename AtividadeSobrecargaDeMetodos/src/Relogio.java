public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public void inicializar(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void inicializar(int hora, int minuto) {
        inicializar(hora, minuto, 1);
    }

    public void inicializar(int hora) {
        inicializar(hora, 1, 1);
    }

    public void exibirHorario() {
        System.out.printf("Horário: %02d:%02d:%02d\n", hora, minuto, segundo);
    }
}

