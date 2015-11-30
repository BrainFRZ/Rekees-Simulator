/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Swashbuckler
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Swashbuckler profession. This is a roguish person who specializes in
 *  swordplay.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Swashbuckler extends Profession {
    public Swashbuckler() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "a roguish person who specializes in swordplay.";
    }

    @Override
    public String toString() {
        return "Swashbuckler";
    }
}
