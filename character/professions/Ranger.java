/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Ranger
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Ranger profession.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Ranger extends Profession {
    public Ranger() {
        will      = WillSave.GOOD;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.GOOD;
        attack    = AttackModifier.GOOD;
    }
}
