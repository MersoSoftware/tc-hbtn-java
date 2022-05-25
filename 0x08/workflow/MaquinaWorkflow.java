import atividades.Atividade;

public class MaquinaWorkflow {

    public void executar (Workflow workflow){
        for (Atividade atividades : workflow.atividades)
            atividades.executar();
    }

}
