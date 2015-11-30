/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Warrior
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Warrior profession. This is an unspecialized person who fights on a
 *  regular basis, but doesn't adventure well.
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


    @Override
    public String getDescription() {
        return "An unspecialized person who fights on a regular basis, but doesn't adventure well.";
    }

    @Override
    public String toString() {
        return "Warrior";
    }
}
