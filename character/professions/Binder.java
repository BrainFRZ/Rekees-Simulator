/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Binder
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Binder profession. This is a practitioner of "low" magic who is often
 *  looked down upon by more talented spellcasters.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Binder extends Profession {
    public Binder() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "Practitioner of \"low\" magic who is often looked down upon by more talented "
                + "spellcasters.";
    }

    @Override
    public String toString() {
        return "Binder";
    }
}
