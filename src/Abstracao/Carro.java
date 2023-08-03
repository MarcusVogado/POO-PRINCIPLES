package Abstracao;

public class Carro extends Veiculo {



    @Override
    public void Ligar() {        
       System.out.println("Carro de placa: " + this.Placa+" Ligando...");
    }   
}
