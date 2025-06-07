package br.com.projeto.factory;

public class LoggingService implements TaskObserver {
    @Override
    public void update(String taskName, String status) {
        System.out.println("📜 Registrando log: Tarefa '" + taskName + "' agora está '" + status + "'.");
    }
}
