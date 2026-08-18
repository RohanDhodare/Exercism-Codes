class SqueakyClean {
    static String clean(String identifier) {
        // throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        char[] inputArray = identifier.toCharArray();
        StringBuilder sb = new StringBuilder();

        boolean kebabCase = false;
        for(int i=0; i<inputArray.length; i++){
            char ch = inputArray[i];
            if(Character.isWhitespace(ch)){
                ch='_';
            }
            else if(ch == '-'){
                kebabCase = true;
                continue;
            }
            else if( ! (Character.isLetter(ch) || Character.isDigit(ch)) ){
                continue;
            }
            else if(Character.isDigit(ch)){
            switch (ch){
                case '4':
                    ch = 'a';
                    break;
                case '3':
                    ch = 'e';
                    break;
                case '0':
                    ch = 'o';
                    break;
                case '1':
                    ch = 'l';
                    break;
                case '7':
                    ch = 't';
                    break;
                default:
                    break;
            }
            }
            else if(kebabCase == true){
                ch = Character.toUpperCase(ch);
                kebabCase = false;
            }
            sb.append(ch);
        }
            
       return sb.toString();
                
    }
}
