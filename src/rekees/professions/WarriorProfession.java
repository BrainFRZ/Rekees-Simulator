package rekees.professions;

import rekees.Character;

/**
 * Created by Robert on 2015-10-31.
 */
public class WarriorProfession extends ProfessionBase {
    public WarriorProfession(Character character) {
        super(character);
    }

    @Override
    public int getWillSaveModifier() {
        return poorSaveModifier();
    }

    @Override
    public int getFortitudeSaveModifier() {
        return goodSaveModifier();
    }

    @Override
    public int getReflexSaveModifier() {
        return poorSaveModifier();
    }
}
