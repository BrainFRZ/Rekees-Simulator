/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Barbarian
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
*     This class handles the Barbarian profession.
  **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Barbarian extends Profession {
    public Barbarian() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }
}
