import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> dialCodeMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialCodeMap;
    }

    public void setDialingCode(Integer code, String country) {
        dialCodeMap.put(code,country);
    }

    public String getCountry(Integer code) {
        return dialCodeMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!dialCodeMap.containsKey(code)){
            if(!dialCodeMap.values().isEmpty()){   
                for(String value : dialCodeMap.values()){
                    if(value != country){
                        dialCodeMap.put(code, country);
                    }
                }
            }
            else{
                dialCodeMap.put(code, country);
            }
        }
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer,String> entry : dialCodeMap.entrySet()){
            if(entry.getValue() == country){
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(Map.Entry<Integer, String> entry : dialCodeMap.entrySet()){
            if(entry.getValue() == country){
                dialCodeMap.remove(entry.getKey());
                dialCodeMap.put(code,country);
                break;
            }
        }
    }
}
