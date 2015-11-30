/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Bard
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Warrior profession.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Bard extends Profession {
    public Bard() {
        will      = WillSave.GOOD;
        fortitude = FortitudeSave.POOR;
        reflex    = ReflexSave.GOOD;
        attack    = AttackModifier.AVERAGE;
    }
}
