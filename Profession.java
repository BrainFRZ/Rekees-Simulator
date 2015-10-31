package rekees;

/**
 * This is an enumerated list of all the Professions available in Rekees, and defines most of the
 * attributes for each Profession.
 *
 * @author Terry Weiss
 */
public enum Profession {
    BARBARIAN   (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.POOR),
    BARD        (WillSave.GOOD, FortitudeSave.POOR, ReflexSave.GOOD),
    CLERIC      (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.POOR),
    DRUID       (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.POOR),
    FIGHTER     (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.GOOD),
    HOLYBLADE   (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.POOR),
    MAGE        (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.GOOD),
    RANGER      (WillSave.GOOD, FortitudeSave.GOOD, ReflexSave.GOOD),
    ROGUE       (WillSave.POOR, FortitudeSave.POOR, ReflexSave.GOOD),
    WARRIOR     (WillSave.POOR, FortitudeSave.GOOD, ReflexSave.POOR),
    WIZARD      (WillSave.GOOD, FortitudeSave.POOR, ReflexSave.POOR);


    private static int goodSaveModifier(int level) {
        return ((level / 2) + 2);
    }

    private static int poorSaveModifier(int level) {
        return (level / 3);
    }



    /**
     * Generates the given ProfessionType
     *
     * @param wil <code>WillSave.STRONG</code> if profession has a good will save, or
     * <code>POOR</code> otherwise
     * @param fort <code>FortitudeSave.STRONG</code> if profession has a good fortitude save, or
     * <code>POOR</code> otherwise
     * @param ref <code>ReflexSave.STRONG</code> if profession has a good reflex save, or
     * <code>POOR</code> otherwise
     */
    Profession(WillSave wil, FortitudeSave fort, ReflexSave ref) {
        will = wil;
        fortitude = fort;
        reflex = ref;
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




    private enum WillSave {
        GOOD, POOR;
    }

    private enum FortitudeSave {
        GOOD, POOR;
    }

    private enum ReflexSave {
        GOOD, POOR;
    }
}
