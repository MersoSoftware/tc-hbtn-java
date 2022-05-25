

public class Slack implements CanalNotificacao {

    public Slack() {
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[Email] {" +mensagem.getTipoMensagem() +"}"+" - "+ mensagem.getTexto());
    }
}
