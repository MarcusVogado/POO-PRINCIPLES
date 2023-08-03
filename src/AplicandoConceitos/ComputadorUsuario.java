package AplicandoConceitos;

public class ComputadorUsuario {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        String mensagem = "Olá Java vou aprender sobre você";
        msn.enviarMensagem(mensagem);
    }
}
