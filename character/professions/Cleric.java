/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Cleric
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Cleric profession.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Cleric extends Profession {
    public Cleric() {
        will      = WillSave.GOOD;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.AVERAGE;
    }
}
