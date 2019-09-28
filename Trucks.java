import java.util.LinkedList;
import java.util.List;

public class Trucks {

    LinkedList<Truck> queue1 = new LinkedList<>();
    LinkedList<Truck> queue2 = new LinkedList<>();

    public LinkedList getQueue1() {
        return queue1;
    }

    public LinkedList getQueue2() {
        return queue2;
    }


    public Trucks() {

        int step = 0;
        int weightQueue1=0;
        int weightQueue2=0;

        while(step < 100){

            step++;
            Truck truck = new Truck(step);
            for (int i=0; i<queue1.size(); i++){
                Truck temp = queue1.get(i);
                weightQueue1 += temp.getWeight();
            }
            for (int i=0; i<queue2.size(); i++){
                Truck temp = queue2.get(i);
                weightQueue2 += temp.getWeight();
            }

            if (queue1.size()<5 && queue2.size()<5){
                if (weightQueue1 <= weightQueue2) queue1.add(truck);
                else queue2.add(truck);
                }
            else if (queue1.size()<5) queue1.add(truck);
            else if (queue2.size()<5) queue2.add(truck);
            }



            if (queue1.size() != 0){
                Truck firstTruck1 = queue1.getFirst();
                firstTruck1.actualWeight();
                if(firstTruck1.getWeight() == 0) queue1.removeFirst();
            }

            if (queue2.size() != 0){
                Truck firstTruck2 = queue2.getFirst();
                firstTruck2.actualWeight();
                if(firstTruck2.getWeight() == 0) queue2.removeFirst();
            }

        }

    }

