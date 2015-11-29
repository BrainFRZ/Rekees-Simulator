/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.Profession
 *  Author:           Terry Weiss
 *  Date Written:     October 29, 2015
 *  Program Description:
 *     This class enumerated list of all the Professions available in Rekees,
 *  and defines most of the attributes for each Profession.
 * 
 * To Do:
 * - Add support for Flurry attacks. Design special treatment for mages when wielding staff or
 *   spell.
 **************************************************************************************************/
package rekees;

/**
 * An enumerated list of all the Professions available in Rekees, and defines most of the attributes
 * for each Profession.
 *
 * @author Terry Weiss
 */
public enum Profession {
    BARBARIAN   (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.POOR, AttackModifier.GOOD),
    BARD        (WillSave.GOOD, FortitudeSave.POOR, ReflexSave.GOOD, AttackModifier.AVERAGE),
    CLERIC      (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.POOR, AttackModifier.AVERAGE),
    DRUID       (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.POOR, AttackModifier.AVERAGE),
    FIGHTER     (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.GOOD, AttackModifier.GOOD),
    HOLYBLADE   (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.POOR, AttackModifier.GOOD),
    MAGE        (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.GOOD, AttackModifier.POOR),
    RANGER      (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.GOOD, AttackModifier.GOOD),
    ROGUE       (WillSave.POOR, FortitudeSave.POOR, ReflexSave.GOOD, AttackModifier.AVERAGE),
    WARRIOR     (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.POOR, AttackModifier.GOOD),
    WIZARD      (WillSave.GOOD, FortitudeSave.POOR, ReflexSave.POOR, AttackModifier.POOR);


    private static int poorSaveModifier(int level) {
        return (level / 3);
    }
    
    private static int goodSaveModifier(int level) {
        return ((level / 2) + 2);
    }

    private static int poorAttackModifier(int level) {
        return (level / 2);
    }
    
    private static int averageAttackModifier(int level) {
        return (level * 3 / 4);
    }
    
    private static int goodAttackModifier(int level) {
        return level;
    }



    /**
     * Generates the given Profession
     *
     * @param wil <code>WillSave.GOOD</code> if profession has a good will save, or
     * <code>POOR</code> otherwise
     * @param fort <code>FortitudeSave.GOOD</code> if profession has a good fortitude save, or
     * <code>POOR</code> otherwise
     * @param ref <code>ReflexSave.GOOD</code> if profession has a good reflex save, or
     * <code>POOR</code> otherwise
     */
    Profession(WillSave wil, FortitudeSave fort, ReflexSave ref, AttackModifier atk) {
        will      = wil;
        fortitude = fort;
        reflex    = ref;
        attack    = atk;
    }


    /**
     * Calculates the Profession's Fortitude modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the WillSave save
     * @throws IndexOutOfBoundsException If saving throw strength isn't valid
     */
    public int willModifier(int level) {
        int modifier;

        switch(will) {
            case GOOD:
                modifier = goodSaveModifier(level);
                break;
            case POOR:
                modifier = poorSaveModifier(level);
                break;
            default:
                throw new IndexOutOfBoundsException("Save type " + will.name() + " doesn't exist.");
        }

        return modifier;
    }

    /**
     * Calculates the Profession's Fortitude modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the FortitudeSave save
     * @throws IndexOutOfBoundsException If saving throw strength isn't valid
     */
    public int fortitudeModifier(int level) {
        int modifier;

        switch(fortitude) {
            case GOOD:
                modifier = goodSaveModifier(level);
                break;
            case POOR:
                modifier = poorSaveModifier(level);
                break;
            default:
                throw new IndexOutOfBoundsException("Save type " + fortitude.name()
                                                            + " doesn't exist.");
        }

        return modifier;
    }

    /**
     * Calculates the Profession's Reflex modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the ReflexSave save
     * @throws IndexOutOfBoundsException If saving throw strength isn't valid
     */
    public int reflexModifier(int level) {
        int modifier;

        switch(reflex) {
            case GOOD:
                modifier = goodSaveModifier(level);
                break;
            case POOR:
                modifier = poorSaveModifier(level);
                break;
            default:
                throw new IndexOutOfBoundsException("Save type " + reflex.name()
                                                            + " doesn't exist.");
        }

        return modifier;
    }

    /**
     * Calculates the Profession's Reflex modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the ReflexSave save
     * @throws IndexOutOfBoundsException If saving throw strength isn't valid
     */
    public int attackModifier(int level) {
        int modifier;

        switch(attack) {
            case POOR:
                modifier = poorAttackModifier(level);
                break;
            case AVERAGE:
                modifier = averageAttackModifier(level);
                break;
            case GOOD:
                modifier = goodAttackModifier(level);
                break;
            default:
                throw new IndexOutOfBoundsException("Attack modifier " + attack.name()
                                                            + " doesn't exist.");
        }

        return modifier;
    }


    /**
     * String label of the given Profession, using its name in Capital Case
     *
     * @return Profession's name in Capital Case
     */
    @Override
    public String toString() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }


    private final WillSave will;
    private final FortitudeSave fortitude;
    private final ReflexSave reflex;
    private final AttackModifier attack;




    private enum WillSave {
        POOR, GOOD;
    }

    private enum FortitudeSave {
        POOR, GOOD;
    }

    private enum ReflexSave {
        POOR, GOOD;
    }
    
    private enum AttackModifier {
        POOR, AVERAGE, GOOD;
    }
}
