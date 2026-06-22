public class Lasagna {

    // there are 3 ways to call methods of same class within other class - like direct call, className.methodName(), this.methodName()
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeSpentInOven){
        // here we use calling of method using class name
        // return Lasagna.expectedMinutesInOven() - timeSpentInOven;

        // here we use this to indicate call method of current class
        return this.expectedMinutesInOven() - timeSpentInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return 2 * layers;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeSpentInOven){
        // here we use direct calling of method within same class
        return preparationTimeInMinutes(layers) + timeSpentInOven;
        
    }
}
