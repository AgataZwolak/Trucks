import java.util.LinkedList;

public class Status{

    public Status() {

        Trucks trucks = new Trucks();

        LinkedList<Truck> queue1 = trucks.getQueue1();
        LinkedList<Truck> queue2 = trucks.getQueue2();

        int time1 = 0;
        int time2 = 0;

        for (int i=0; i<queue1.size(); i++){
            Truck truck = queue1.get(i);
            System.out.println("Queue 1, position " + i + ": " +  truck.getID() + ", waiting time: " + time1);
            time1 += truck.getWeight();
        }
        for (int i=0; i<queue2.size(); i++){
            Truck truck = queue2.get(i);
            System.out.println("Queue 2, position " + i + ": " +  truck.getID() + ", waiting time: " + time2);
            time2 += truck.getWeight();
        }
    }

}