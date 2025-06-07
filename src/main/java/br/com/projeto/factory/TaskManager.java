package br.com.projeto.factory;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<TaskObserver> observers = new ArrayList<>();

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void updateTask(String taskName, String status) {
        System.out.println("📝 Tarefa '" + taskName + "' foi atualizada para: " + status);
        notifyObservers(taskName, status);
    }

    private void notifyObservers(String taskName, String status) {
        for (TaskObserver observer : observers) {
            observer.update(taskName, status);
        }
    }
}
