public class DemoRelogio {
    public static void main(String[] args) {

        Relogio r1 = new Relogio();
        Relogio r2 = new Relogio();
        Relogio r3 = new Relogio();

        r1.inicializar(14, 30, 45);

        r2.inicializar(9, 15);

        r3.inicializar(22);

        r1.exibirHorario();  // Horário: 14:30:45
        r2.exibirHorario();  // Horário: 09:15:01
        r3.exibirHorario();  // Horário: 22:01:01
    }
}
