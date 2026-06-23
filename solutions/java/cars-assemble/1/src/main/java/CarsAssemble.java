public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        double totalRate = speed * 221;

        if(speed >=5 && speed < 9){
            totalRate = totalRate - totalRate * 0.1;
        }
        else if(speed == 9){
            totalRate = totalRate - totalRate * 0.2;
        }
        else if(speed == 10){
            totalRate = totalRate - totalRate * 0.23;
        }

        // for speed 0 and between 1 to 5 it will return value as it is
        return totalRate;
    }

    public int workingItemsPerMinute(int speed) {
        // throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        return (int)productionRatePerHour(speed)/60;
    }
}
