import entities.Aviao;
import entities.Balao;
import entities.Bicicleta;
import entities.Carro;

public class Teste {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing", 180, 0, 1000, 2);
        Carro carro = new Carro("Sedan", 5, 20, "Passeio", 1600);
        Bicicleta bicicleta = new Bicicleta("Bike", 1, 10, "Urbana", 36);
        Balao balao = new Balao("Balao", 8, 0, 200, 500);

        // Teste de métodos da interface Motorizado
        aviao.ligarMotor();
        aviao.abastecer(500);

        carro.ligarMotor();
        carro.abastecer(40);

        // Teste de métodos da interface Conduzivel
        aviao.curvar(30.0);
        carro.curvar(15.0);
        bicicleta.curvar(10.0);

        // Testes adicionais
        bicicleta.pedalar();
        carro.estacionar();
        aviao.subir(500);
        balao.aquecerAr(7.0);
        balao.largarPeso(5.5);


        System.out.println("Avião está parado? " + aviao.estaParado());
        System.out.println("Carro está parado? " + carro.estaParado());
        System.out.println("Bicicleta está parado? " + bicicleta.estaParado());
        System.out.println("Balão está parado? " + balao.estaParado());
    }
}