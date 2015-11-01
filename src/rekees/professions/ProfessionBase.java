package rekees.professions;

import rekees.Character;

/**
 * Created by Robert on 2015-10-31.
 */
public abstract class ProfessionBase implements Profession{
    protected final Character character;

    protected ProfessionBase(Character character) {
        this.character = character;
    }

    protected int goodSaveModifier() {
        return ((character.getLevel() / 2) + 2);
    }

    protected int poorSaveModifier() {
        return (character.getLevel() / 3);
    }
}
