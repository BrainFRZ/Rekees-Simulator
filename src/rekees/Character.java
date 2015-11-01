package rekees;

/****************************************************************************
 * Program Name:     Combat Simulator
 * Class Name:       rekees.rekees.Character
 * Author:           Terry Weiss
 * Date Written:     October 29, 2015
 * Program Description:
 * This class contains instance data for a single character.
 ****************************************************************************/

//import combatsim.rekees.StatusEffect;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Terry Weiss
 */
public class Character implements NewCharacterDefaults {
    public enum Position {
        FLYING, RIDING, STANDING, PRONE, ASLEEP, CLIMBING, FALLING, SWIMMING,
        SWIMMING_UNDERWATER, BOUND, UNCONSCIOUS, NEAR_DEATH, DEAD;
    }

    private final String name;
    private Profession profession;
    private Race race;
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
        this.name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();

        level = INITIAL_LEVEL;
        race = DEFAULT_RACE;
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
     * @return rekees.Character's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return rekees.Character's level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the race
     */
    public Race getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(Race race) {
        this.race = race;
    }

    /**
     * @param profession rekees.Profession to set
     */
    public void setProfession(Profession profession) {
        this.profession = profession;
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
     * @param HP rekees.Character's HP that will be set
     * @return rekees.Character's new HP
     */
    public int setCurrentHP(int HP) {
        if (HP < MIN_HP_VALUE) {
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

    public int getBaseAttack() {
        /* return profession.getAttackModifier(); */
        return 1;
    }

    public int getAttacksNumber() {
        // return profession.getAttacksNumber(); */
        return 1;
    }

    /**
     * @return rekees.Character's current position
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
     * @return List of statuses currently affecting the rekees.Character
     */
    public List<StatusEffect> getAffectedBy() {
        return affectedBy;
    }
}
