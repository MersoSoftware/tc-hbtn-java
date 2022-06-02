import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaToDo {

    private List<Tarefa> tarefas;

    public ListaToDo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {

        for (Tarefa validaTarefa : tarefas) {
            if(validaTarefa.equals(tarefa.getIdentificador())) {
                throw new Exception("Tarefa com identificador <identificador> ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        for (Tarefa marcaTarefa: tarefas ) {
            if(marcaTarefa.equals(identificador)){
                return false;
            }else{
                marcaTarefa.setEstahFeita(true);
            }
        }
        return true;
    }
    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getIdentificador() == identificador) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : this.tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : this.tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.isEstahFeita()) {
                System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            } else {
                System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
            }
        }
    }
}
