public class Teams implements CanalNotificacao{
    public Teams() {
    }

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[Email] {" +mensagem.getTipoMensagem() +"}"+" - "+ mensagem.getTexto());
    }
}
