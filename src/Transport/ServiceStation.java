package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public ServiceStation() {
        queue = new LinkedList<>();
    }

    private Queue <Transport <?>> queue;

    public ServiceStation(Queue<Transport<?>> queue) {
        this.queue = queue;
    }

    public void addVehicleToQueue(Transport <?> car) {
        queue.add((Transport)car);
    }
    public void passMaintanance (Transport <?> car) {
        while (queue.isEmpty()) {
            System.out.println("пройти ТО");
            queue.poll();
        }

    }
}

