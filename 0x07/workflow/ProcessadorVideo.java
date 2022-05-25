package workflow;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

     public void registrarCanal(CanalNotificacao canal){
        this.canais.add(canal);
    }

    public void processar(Video video){
//        canais.forEach(x-> x.notificar(new Mensagem(video.getArquivo()+
//                " - "+video.getFormatoVideo(), TipoMensagem.LOG)));
        for (CanalNotificacao item : this.canais){
            item.notificar(new Mensagem(video.getArquivo() + " - "+video.getFormatoVideo(), TipoMensagem.LOG));
        }
    }
}
