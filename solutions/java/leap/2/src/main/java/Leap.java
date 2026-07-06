class Leap {

    boolean isLeapYear(int year) {
        // if(year % 100 != 0 && year % 4 == 0){
        //     return true;
        // }
        // else{
        //     return (year % 400 == 0);
        // }

        return ( year%100 != 0 && year % 4==0 ) || (year % 400 == 0);
    }
}
