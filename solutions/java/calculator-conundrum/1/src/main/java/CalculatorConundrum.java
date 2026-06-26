class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        int result = 0;
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        else if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        switch(operation){
            case "+":
                result = operand1 + operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + result;
            case "*":
                result = operand1 * operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + result;
            case "/":
                try{
                result = operand1 / operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + result;
                }
                catch(ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        // return "";
}
}
