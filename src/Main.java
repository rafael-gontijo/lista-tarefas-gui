import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> listaTarefas = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int opcao;
        try{
            do{
                System.out.println();
                System.out.println("Aplicativo de Lista de Tarefas");
                System.out.println("1. Adicionar tarefa");
                System.out.println("2. Remover tarefa");
                System.out.println("3. Listar tarefas");
                System.out.println("4. Sair");
                System.out.print("Escolha uma Opção: ");
                opcao = sc.nextInt();
                System.out.println();

                sc.nextLine();
                switch (opcao){
                    case 1:
                        listaTarefas.add(adicionarTarefa());
                        break;
                    case 2:
                        listaTarefas.remove(removerTarefa());
                        break;
                    case 3:
                        imprimeTarefas(listaTarefas);
                        break;
                    default:
                        System.out.println("Opção não disponivel");
                }}while(opcao!=4);
            System.out.println("Obrigado");

        }catch (Exception e){
            System.out.println(e);
            System.out.println("Opção Invalida");
        }
    } 
    public static String adicionarTarefa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua tarefa para adiconar:");
        String tarefa = sc.nextLine();
        return tarefa;
    }
    public static int removerTarefa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da sua tarefa para remover:");
        int tarefa  = sc.nextInt();
        return tarefa -1;
    }
    public static void imprimeTarefas(ArrayList<String> listaTarefas){
        System.out.println("*********************");
        System.out.println("LISTA DE TAREFAS");
        for (String name : listaTarefas) {
            System.out.println(name);
        }System.out.println("*********************");
    }
}