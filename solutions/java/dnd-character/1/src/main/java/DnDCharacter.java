import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    
    public DnDCharacter(){
        this.strength = this.ability(this.rollDice());
        this.dexterity = this.ability(this.rollDice());
        this.constitution = this.ability(this.rollDice());
        this.intelligence = this.ability(this.rollDice());
        this.wisdom = this.ability(this.rollDice());
        this.charisma = this.ability(this.rollDice());
    }

    int ability(List<Integer> scores) {
        List<Integer> rolls = new ArrayList<>(scores);
        int sum = 0;
        Collections.sort(rolls, Collections.reverseOrder());
        for(int i=0; i<3; i++){
            sum += rolls.get(i);
        }
        
        return sum;
    }

    List<Integer> rollDice() {
        List<Integer> diceScores = new ArrayList<>();
        Random rdm = new Random();
        for(int i=0; i<4; i++){
            diceScores.add(rdm.nextInt(1,7));
        }
        return diceScores;
    }

    int modifier(int input) {
        return (int) Math.floor( (input - 10) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return this.modifier(this.getConstitution()) + 10;
    }
}
