/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Shugenja
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Spellblade profession. This is Mujenia's version of Clerics who are
 *  less flexible but able to flurry unarmed.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Shugenja extends Profession {
    public Shugenja() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "Mujenia's version of Clerics who are less flexible but able to flurry unarmed.";
    }

    @Override
    public String toString() {
        return "Shugenja";
    }
}
