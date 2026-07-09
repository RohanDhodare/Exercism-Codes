class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int orgNum = numberToCheck;
        int power = String.valueOf(numberToCheck).length();
        int sum = 0;

        if(power == 1){
            return true;
        }
        while(orgNum > 0){
            int digit = orgNum % 10;
            sum += Math.pow(digit, power);
            orgNum = orgNum /10;
        }

        return sum == numberToCheck;

        

    }

}
