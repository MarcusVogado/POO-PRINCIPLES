package Abstracao;

public class TesteAbstracao {
 public static void main (String[] args){
    Carro carro = new Carro();
    Moto moto= new Moto();

    carro.Placa="PBZ-5898";
    carro.Ligar();

    moto.Placa="ZUO-8888";
    moto.Ligar();
 }   
}
