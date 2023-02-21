package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {

    public void addVehicleToQueue(Transport <?> car, Transport <?>truck) {
        Queue<Transport> queue = new LinkedList<>();
        queue.offer(car);
        queue.offer(truck);
        System.out.println(queue.peek());
    }
    public void passMaintanance (Transport <?> car, Transport <?> truck) {
        Queue<Transport> queue = new LinkedList<>();
        queue.offer(car);
        queue.offer(truck);
        System.out.println(queue.peek());
        while (queue.size() > 0) {
        System.out.print(queue.remove() + " ");
    }
}
}
