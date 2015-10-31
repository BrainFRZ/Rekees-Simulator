package rekees;

/**
 * This is an enumerated list of all the Professions available in Rekees, and defines most of the
 * attributes for each Profession.
 *
 * @author Terry Weiss
 */
public enum ProfessionType {
    BARBARIAN   (WillSaveType.POOR, FortitudeSaveType.GOOD, ReflexSaveType.POOR),
    BARD        (WillSaveType.GOOD, FortitudeSaveType.POOR, ReflexSaveType.GOOD),
    CLERIC      (WillSaveType.GOOD, FortitudeSaveType.GOOD, ReflexSaveType.POOR),
    DRUID       (WillSaveType.GOOD, FortitudeSaveType.GOOD, ReflexSaveType.POOR),
    FIGHTER     (WillSaveType.POOR, FortitudeSaveType.GOOD, ReflexSaveType.GOOD),
    HOLYBLADE   (WillSaveType.POOR, FortitudeSaveType.GOOD, ReflexSaveType.POOR),
    MAGE        (WillSaveType.GOOD, FortitudeSaveType.GOOD, ReflexSaveType.GOOD),
    RANGER      (WillSaveType.GOOD, FortitudeSaveType.GOOD, ReflexSaveType.GOOD),
    ROGUE       (WillSaveType.POOR, FortitudeSaveType.POOR, ReflexSaveType.GOOD),
    WARRIOR     (WillSaveType.POOR, FortitudeSaveType.GOOD, ReflexSaveType.POOR),
    WIZARD      (WillSaveType.GOOD, FortitudeSaveType.POOR, ReflexSaveType.POOR);


    private static int goodSaveModifier(int level) {
        return ((level / 2) + 2);
    }

    private static int poorSaveModifier(int level) {
        return (level / 3);
    }



    /**
     * Generates the given ProfessionType
     *
     * @param wil <code>WillSaveType.STRONG</code> if profession has a good will save, or
     * <code>POOR</code> otherwise
     * @param fort <code>FortitudeSaveType.STRONG</code> if profession has a good fortitude save, or
     * <code>POOR</code> otherwise
     * @param ref <code>ReflexSaveType.STRONG</code> if profession has a good reflex save, or
     * <code>POOR</code> otherwise
     */
    ProfessionType(WillSaveType wil, FortitudeSaveType fort, ReflexSaveType ref) {
        will = wil;
        fortitude = fort;
        reflex = ref;
    }


    /**
     * Calculates the Profession's Fortitude modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the WillSaveType save
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
     * @return Profession's modifier of the FortitudeSaveType save
     * @throws IndexOutOfBoundsException If saving throw strength isn't valid
     */
    public int fortitudeModifier(int level) {
        int modifier;

        switch(will) {
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
     * @return Profession's modifier of the ReflexSaveType save
     * @throws IndexOutOfBoundsException If saving throw strength isn't valid
     */
    public int reflexModifier(int level) {
        int modifier;

        switch(will) {
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
     * String label of the given ProfessionType, using its name in Capital Case
     *
     * @return ProfessionType's name in Capital Case
     */
    @Override
    public String toString() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }


    private final WillSaveType will;
    private final FortitudeSaveType fortitude;
    private final ReflexSaveType reflex;




    private enum WillSaveType {
        GOOD, POOR;
    }

    private enum FortitudeSaveType {
        GOOD, POOR;
    }

    private enum ReflexSaveType {
        GOOD, POOR;
    }
}
