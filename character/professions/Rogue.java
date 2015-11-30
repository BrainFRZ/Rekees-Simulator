/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Rogue
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Rogue profession. This is a very skilled person who chiefly
 *  specializes in stealth.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Rogue extends Profession {
    public Rogue() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.POOR;
        reflex    = ReflexSave.GOOD;
        attack    = AttackModifier.AVERAGE;
    }


    @Override
    public String getDescription() {
        return "A very skilled person who chiefly specializes in stealth.";
    }

    @Override
    public String toString() {
        return "Rogue";
    }
}
