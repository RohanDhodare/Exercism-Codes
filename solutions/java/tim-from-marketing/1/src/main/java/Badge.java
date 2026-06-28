class Badge {
    public String print(Integer id, String name, String department) {
        // throw new UnsupportedOperationException("Please implement the Badge.print() method");
        StringBuilder sb;
        if(id!= null && name != null && department != null){
            sb = new StringBuilder( "[" + id + "] - " + name + " - " + department.toUpperCase());
        }
        else if(id == null && department != null){
            sb = new StringBuilder( name + " - " + department.toUpperCase());
        }
        else{
            if(id != null){
                sb = new StringBuilder( "[" + id + "] - " + name + " - OWNER");
            }
            else{
                sb = new StringBuilder( name + " - OWNER");
            }
        }
        
        return sb.toString();
    }
}
