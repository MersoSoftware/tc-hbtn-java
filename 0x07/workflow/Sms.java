package workflow;

public class Sms implements CanalNotificacao{
    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[Email] {" +mensagem.getTipoMensagem() +"}"+" - "+ mensagem.getTexto());
    }
}
