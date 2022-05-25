public class Sms implements CanalNotificacao{
    public Sms() {
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[Email] {" +mensagem.getTipoMensagem() +"}"+" - "+ mensagem.getTexto());
    }
}
