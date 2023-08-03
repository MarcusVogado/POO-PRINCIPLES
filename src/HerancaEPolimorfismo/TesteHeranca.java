package HerancaEPolimorfismo;
import java.util.Date;

public class TesteHeranca {
    public static void main(String[] args) {
        // Carro não possio atributos definidos mas herda de automovel assim como a moto
        Carro carro = new Carro();
        carro.Chassi = "asw558s8";
        carro.Placa = "pbh-4589";
        carro.AnoFabricacao = new Date();
        System.out.println(carro.Chassi + " " + carro.Placa +
                carro.AnoFabricacao);
    }
}
