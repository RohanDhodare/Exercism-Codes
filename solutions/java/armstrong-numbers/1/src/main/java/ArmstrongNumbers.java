import java.util.*;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        List<Integer> nums = new ArrayList<>();
        int n = numberToCheck;
        
        while(n>0){
            nums.add(n % 10);
            n = n / 10;
        }
        int power = nums.size();
        
        if(power == 1){
            return true; // cause single digit nums are all armstrong 
        }
        
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            sum += (int) Math.pow(nums.get(i), power); 
        }

        return sum == numberToCheck;
 

    }

}
