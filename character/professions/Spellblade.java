/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Spellblade
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Spellblade profession. This is a low-powered mage who also focuses
 *  on swordsmanship.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Spellblade extends Profession {
    public Spellblade() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "A low-powered mage who also focuses on swordsmanship.";
    }

    @Override
    public String toString() {
        return "Spellblade";
    }
}
