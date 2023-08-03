package Encapsulamento;

public class Carro {
    
    public void Ligar(){
        confereCombustivel();
        conferindoCambio();
        System.out.println("Ligando");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
    private void conferindoCambio(){
        System.out.println("Conferindo Cambio");
    }
}
