package AplicandoConceitos;

public class MSNMessenger {
    public void enviarMensagem(String mensagem) {
        validarConectadoInternet();
        System.out.println("Enviando mensagem: " + mensagem);
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
