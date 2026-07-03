class ReverseString {

    String reverse(String inputString) {
        if(inputString.isEmpty() || inputString.isBlank()){
            return inputString;
        }
        int len = inputString.length();

        StringBuilder sb = new StringBuilder();
        for(int i=len-1; i>=0; i--){
            sb.append(inputString.charAt(i));
        }

        return sb.toString();
    }
  
}
