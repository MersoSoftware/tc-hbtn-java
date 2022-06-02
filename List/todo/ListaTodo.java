import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) {

        for (Tarefa validaTarefa : tarefas) {
            if(validaTarefa.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
            }
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador){
        for (Tarefa marcaTarefa: tarefas ) {
            if(marcaTarefa.getIdentificador() == identificador){
                return false;
            }else{
                marcaTarefa.setEstahFeita(true);
                return true;
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
