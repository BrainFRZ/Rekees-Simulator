/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Marshal
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Marshal profession. This is an incredibly talented leader in combat
 *  who inspires followers to victory.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Marshal extends Profession {
    public Marshal() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "An incredibly talented leader in combat who inspires followers to victory.";
    }

    @Override
    public String toString() {
        return "Marshal";
    }
}
