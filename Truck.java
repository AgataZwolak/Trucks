import java.lang.Math;

public class Truck{

    private int truckWeight;
    public int truckID;

    public Truck(int step) {
        this.truckID = step;
        this.truckWeight = randomWithRange(1,10);
    }

    public int randomWithRange(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public int getWeight(){
        return truckWeight;
    }
    public void actualWeight(){
        truckWeight--;
    }

    public int getID(){
        return truckID;
    }

}
