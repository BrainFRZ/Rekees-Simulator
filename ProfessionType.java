package rekees;

/**
 *
 * @author Terry
 */
public enum ProfessionType {
    BARBARIAN {
        @Override
        public int getWillModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return badSaveModifier(level);
        }
    },
    BARD {
        @Override
        public int getWillModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return goodSaveModifier(level);
        }
    },
    CLERIC {
        @Override
        public int getWillModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return badSaveModifier(level);
        }
    },
    DRUID {
        @Override
        public int getWillModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return badSaveModifier(level);
        }
    },
    FIGHTER {
        @Override
        public int getWillModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return goodSaveModifier(level);
        }
    },
    HOLYBLADE {
        @Override
        public int getWillModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return badSaveModifier(level);
        }
    },
    MAGE {
        @Override
        public int getWillModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return goodSaveModifier(level);
        }
    },
    RANGER {
        @Override
        public int getWillModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return goodSaveModifier(level);
        }
    },
    ROGUE {
        @Override
        public int getWillModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return goodSaveModifier(level);
        }
    },
    WARRIOR {
        @Override
        public int getWillModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return badSaveModifier(level);
        }
    },
    WIZARD {
        @Override
        public int getWillModifier(int level) {
            return goodSaveModifier(level);
        }

        @Override
        public int getFortitudeModifier(int level) {
            return badSaveModifier(level);
        }

        @Override
        public int getReflexModifier(int level) {
            return badSaveModifier(level);
        }
    };


    private static int goodSaveModifier(int level) {
        return ((level / 2) + 2);
    }

    private static int badSaveModifier(int level) {
        return (level / 3);
    }

    /**
     * Calculates the Profession's Fortitude modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the Will save
     */
    abstract int getWillModifier(int level);

    /**
     * Calculates the Profession's Fortitude modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the Fortitude save
     */
    abstract int getFortitudeModifier(int level);

    /**
     * Calculates the Profession's Reflex modifier.
     *
     * @param level Character's current level
     * @return Profession's modifier of the Reflex save
     */
    abstract int getReflexModifier(int level);

}
