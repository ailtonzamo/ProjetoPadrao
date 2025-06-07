package br.com.projeto.factory;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Criando observadores
        TaskObserver emailNotifier = new EmailNotifier();
        TaskObserver loggingService = new LoggingService();

        // Adicionando os observadores ao sistema
        taskManager.addObserver(emailNotifier);
        taskManager.addObserver(loggingService);

        // Atualizando tarefas e notificando automaticamente
        taskManager.updateTask("Implementar Observer", "Em andamento");
        taskManager.updateTask("Refatorar código", "Concluído");
    }
}
