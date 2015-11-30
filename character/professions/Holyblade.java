/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Holyblade
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Holyblade profession.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Holyblade extends Profession {
    public Holyblade() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }
}
