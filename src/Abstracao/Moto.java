package Abstracao;

public class Moto extends Veiculo {
    
    @Override
    public void Ligar(){
        System.out.println("Moto de placa: "+this.Placa+ " Ligando...");
    }
}
