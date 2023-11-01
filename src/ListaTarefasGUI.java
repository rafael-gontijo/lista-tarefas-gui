import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListaTarefasGUI extends JFrame  {
    private JPanel panel1 = new JPanel();
    private JButton buttonTarefa1 = new JButton("Adicionar tarefa");
    private JButton buttonTarefa2 = new JButton("Remover tarefa");
    private JButton buttonTarefa3 = new JButton("Listar tarefas");
    public ListaTarefasGUI() {
        this.setTitle("** ListaTarefas - Interface Gráfica **");
        this.setSize(400, 200);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        panel1.setBackground(new Color(255, 255, 255));
        ArrayList<String> listaTarefas = new ArrayList<String>();
        buttonTarefa1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                adicionarTarefa(listaTarefas);

            }
        });
        buttonTarefa2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removerTarefa(listaTarefas);
            }
        });
        buttonTarefa3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                imprimeTarefas(listaTarefas);
            }
        });
        panel1.add(buttonTarefa1);
        panel1.add(buttonTarefa2);
        panel1.add(buttonTarefa3);

        this.getContentPane().add(panel1);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }
    public void adicionarTarefa(ArrayList<String> listaTarefas) {
        String input = JOptionPane.showInputDialog(null, "Digite a sua tarefa para adiconar:");
        String tarefa = input;
        if(tarefa != null){
            listaTarefas.add(tarefa);
        }
    }
    public void removerTarefa(ArrayList<String> listaTarefas) {
        try {
            String input = JOptionPane.showInputDialog(null, "Digite a sua tarefa para remover:");
            if(input!=null){
                int tarefa = Integer.parseInt(input);
                listaTarefas.remove(tarefa -1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void imprimeTarefas(ArrayList<String> listaTarefas){
        String msg = "";

        for (int i = 1; i <= listaTarefas.size(); i++) {
            var name = listaTarefas.get(i-1);
            msg += String.format("%d - %s\n", i, name);
        }
        JOptionPane.showMessageDialog(null, "Lista de Tarefas\n" + msg);
    }
    public static void main(String[] args) {
        new ListaTarefasGUI();
    }
}
