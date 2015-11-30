/****************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.Character
 *  Author:           Terry Weiss
 *  Date Written:     October 29, 2015
 *  Program Description:
 *     This class contains instance data for a single character.
 ****************************************************************************/
package rekees.character;

//import rekees.character.Culture;
//import rekees.character.Profession;
//import rekees.character.Race;
//import rekees.character.StatusEffect;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry Weiss
 */
public class Character {
    public enum Position {
        FLYING, RIDING, STANDING, PRONE, ASLEEP, CLIMBING, FALLING, SWIMMING,
        SWIMMING_UNDERWATER, BOUND, UNCONSCIOUS, NEAR_DEATH, DEAD;
    }

    private static final int DEFAULT_STAT_VALUE = 10;
    private static final int DEFAULT_HP = 8;
    private static final int MIN_HP_VALUE = -10;
    private static final int MIN_STAT_VALUE = 0;
    private static final Race DEFAULT_RACE = Race.HUMAN;
    private static final Profession DEFAULT_PROFESSION = Profession.WARRIOR;
    private static final Culture DEFAULT_CULTURE = Culture.WARRIOR;

    private String name;
    private Race race;
    private Culture culture;
    private Profession profession;
    private int level;

    private int maxHP;
    private int currentHP;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private Position position;
    private final List<StatusEffect> affectedBy;

    public Character(String name) {
        this.name = "Unnamed Character";
        level = 1;
        race = DEFAULT_RACE;
        culture = DEFAULT_CULTURE;
        profession = DEFAULT_PROFESSION;

        maxHP = DEFAULT_HP;
        currentHP = maxHP;

        strength = DEFAULT_STAT_VALUE;
        dexterity = DEFAULT_STAT_VALUE;
        constitution = DEFAULT_STAT_VALUE;
        intelligence = DEFAULT_STAT_VALUE;
        wisdom = DEFAULT_STAT_VALUE;
        charisma = DEFAULT_STAT_VALUE;

        position = Position.STANDING;
        affectedBy = new ArrayList<>();
    }

    private static int getStatModifier(int statValue) {
        return (statValue - 10) / 2;
    }


    /**
     * @param name Character's name
     * @return Character's new name
     */
    public String setName(String name) {
        return (this.name = name);
    }

    /**
     * @return Character's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Character's level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     * @return Character's new level
     */
    public int setLevel(int level) {
        return (this.level = level);
    }

    /**
     * @return the race
     */
    public Race getRace() {
        return race;
    }

    /**
     * @param race the race to set
     * @return Character's new race
     */
    public Race setRace(Race race) {
        return (this.race = race);
    }

    /**
     * @return the culture
     */
    public Culture getCulture() {
        return culture;
    }

    /**
     * @param culture the race to set
     * @return Character's new culture
     */
    public Culture setCulture(Culture culture) {
        return (this.culture = culture);
    }

    /**
     * @param profession Profession to set
     * @return The Character's Profession
     */
    public Profession setProfession(Profession profession) {
        return (this.profession = profession);
    }

    /**
     * @return the profession
     */
    public Profession getProfession() {
        return profession;
    }

    /**
     * @return the profession's String representation
     */
    public String getProfessionName() {
        return profession.toString();
    }

    /**
     * @return the maxHP
     */
    public int getMaxHP() {
        return maxHP;
    }

    /**
     * @param maxHP the maxHP to set
     */
    public void setMaxHP(int maxHP) {
        if (maxHP < 1) {
            maxHP = 1;
        }

        this.maxHP = maxHP;
    }

    /**
     * @return the currentHP
     */
    public int getCurrentHP() {
        return currentHP;
    }

    /**
     * @param HP Character's HP that will be set
     * @return Character's new HP
     */
    public int setCurrentHP(int HP) {
        if(HP < MIN_HP_VALUE) {
            HP = MIN_HP_VALUE;
        }

        return (this.currentHP = HP);
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        if (strength < MIN_STAT_VALUE) {
            strength = MIN_STAT_VALUE;
        }

        this.strength = strength;
    }

    /**
     * @return the dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * @param dexterity the dexterity to set
     */
    public void setDexterity(int dexterity) {
        if (dexterity < MIN_STAT_VALUE) {
            dexterity = MIN_STAT_VALUE;
        }

        this.dexterity = dexterity;
    }

    /**
     * @return the constitution
     */
    public int getConstitution() {
        return constitution;
    }

    /**
     * @param constitution the constitution to set
     */
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    /**
     * @return the intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * @param intelligence the intelligence to set
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * @return the wisdom
     */
    public int getWisdom() {
        return wisdom;
    }

    /**
     * @param wisdom the wisdom to set
     */
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * @return the charisma
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * @param charisma the charisma to set
     */
    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }


    public int getFortitude() {
        return getStatModifier(constitution) + profession.fortitudeModifier(level);
    }

    public int getWill() {
        return getStatModifier(wisdom) + profession.willModifier(level);
    }

    public int getReflex() {
        return getStatModifier(dexterity) + profession.reflexModifier(level);
    }


    public int getAttackModifier() {
        return profession.attackModifier(level);
    }

    public int getAttacksNumber() {
     // return profession.getAttacksNumber(); */
        return 1;
    }



    /**
     * @return Character's current position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position Position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }

    /**
     * @return List of statuses currently affecting the Character
     */
    public List<StatusEffect> getAffectedBy() {
        return affectedBy;
    }

}
