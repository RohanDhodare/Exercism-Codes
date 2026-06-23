
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
        
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for(int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i]==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int count = 0;
        // to take into account that numberOfDays can be greater than arr len
        for(int i=0; i<numberOfDays && i< birdsPerDay.length; i++){
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int count = 0;
        for(int i=0; i<birdsPerDay.length; i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}
