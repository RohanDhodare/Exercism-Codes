import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
       return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        // boolean flag1 = false, flag2 = false;
        // for(String s : myCollection){
        //     if(!theirCollection.contains(s)){
        //         flag1 = true;
        //         break;
        //     }
        // }
        // for(String s: theirCollection){
        //     if(!myCollection.contains(s)){
        //         flag2 = true;
        //         break;
        //     }
        // }
        // return flag1 && flag2;

        Set<String> newMyCollection = new HashSet<>(myCollection);
        Set<String> newTheirCollection = new HashSet<>(theirCollection);
        
        myCollection.removeAll(newTheirCollection);
        theirCollection.removeAll(newMyCollection);

        return !myCollection.isEmpty() && !theirCollection.isEmpty();
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if(collections == null || collections.isEmpty()){
            return new HashSet<>();
        }

        Set<String> commonSet = new HashSet<>(collections.get(0));
        for(int i=1; i<collections.size(); i++){
            commonSet.retainAll(collections.get(i));
        }

        return commonSet;
        
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardsSet = new HashSet<>();
            // for(Set<String> cards : collections){
            //     for(String card : cards){
            //         allCardsSet.add(card);
            //     }
            // }
        // OR
        
        for(Set<String> cards : collections){
            allCardsSet.addAll(cards);
        }
        return allCardsSet;
    }
}
