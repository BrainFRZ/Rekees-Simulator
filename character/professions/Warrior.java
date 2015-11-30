/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Warrior
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
public class Warrior extends Profession {
    public Warrior() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }
}
