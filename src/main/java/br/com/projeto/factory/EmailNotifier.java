package br.com.projeto.factory;

public class EmailNotifier implements TaskObserver {
    @Override
    public void update(String taskName, String status) {
        System.out.println("📩 Enviando e-mail: A tarefa '" + taskName + "' mudou para '" + status + "'.");
    }
}
