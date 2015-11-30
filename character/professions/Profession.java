/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.Profession
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
package rekees.character.professions;

/**
 * An enumerated list of all the Professions available in Rekees, and defines most of the attributes
 * for each Profession.
 *
 * @author Terry Weiss
 */
public abstract class Profession {
    protected WillSave will;
    protected FortitudeSave fortitude;
    protected ReflexSave reflex;
    protected AttackModifier attack;



    static final int poorSaveModifier(int level) {
        return (level / 3);
    }

    static final int goodSaveModifier(int level) {
        return ((level / 2) + 2);
    }

    static final int poorAttackModifier(int level) {
        return (level / 2);
    }

    static final int averageAttackModifier(int level) {
        return (level * 3 / 4);
    }

    static final int goodAttackModifier(int level) {
        return level;
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


    
    public abstract String getDescription();



    public enum WillSave {
        POOR, GOOD;
    }

    public enum FortitudeSave {
        POOR, GOOD;
    }

    public enum ReflexSave {
        POOR, GOOD;
    }

    public enum AttackModifier {
        POOR, AVERAGE, GOOD;
    }
}
