package desafio2;

import javax.swing.*;
import java.util.HashSet;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();

        int opcao;
        JOptionPane.showMessageDialog(null,"Bem-vindo ao Gerenciador de Tarefas ");
        //menu
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, ImprimirUtil.MENU_PRINCIPAL));
            switch (opcao) {
                case ServicoTarefa.ADICIONAR_TAREFA:
                    String novaTarefa = JOptionPane.showInputDialog("Digite a tarefa a ser adicionada");
                    nomes.add(novaTarefa);
                    JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
                    break;
                case ServicoTarefa.VISUALIZAR_TAREFA:
                    if (nomes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas.");
                    } else {
                        StringBuilder list = new StringBuilder("Lista de tarefas\n");
                        for (String nome : nomes) {
                            list.append(nome).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, list.toString());

                    }
                    break;
                case ServicoTarefa.REMOVER_TAREFA:
                    if (nomes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há tarefas cadastradas para remover");
                    } else {
                        String tarefaRemover = JOptionPane.showInputDialog("Insira a tarefa a ser removida");
                        nomes.remove(tarefaRemover);
                        JOptionPane.showMessageDialog(null, "Tarefa Removida");
                    }
                    break;
                case ServicoTarefa.SAIR:
                    JOptionPane.showMessageDialog(null, "Saindo do Programa....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");
            }


        }while (opcao != 4) ;


    }
}

