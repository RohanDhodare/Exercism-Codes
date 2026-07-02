class NeedForSpeed {
    protected int speed;
    protected int batteryDrain = 2;
    private int distance = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed constructor");
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
      return ( battery >= batteryDrain ) ? false : true;
    }

    public int distanceDriven() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
        return distance;
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
        if(battery > 0){
            distance += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        // throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        // throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        // throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
        return ( (car.speed * (100)/car.batteryDrain) >= distance ) ? true : false;
    }
}
