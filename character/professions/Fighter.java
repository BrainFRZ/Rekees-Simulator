/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Fighter
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Fighter profession.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Fighter extends Profession {
    public Fighter() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.GOOD;
        attack    = AttackModifier.GOOD;
    }
}
