package desafio2;

public class Tarefa {


    //Atributos
    public String nome;
    public int opcao;

    //construtores
    public Tarefa(String nome) {
        this.nome = nome;

    }

    // Métodos de acesso
    public String getnome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ServicoTarefa" +
                "tarefas='" + nome + '\''
                ;
    }
}