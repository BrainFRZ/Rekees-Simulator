/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Ninja
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Ninja profession. This is Mujenia's version of Rogues who are less
 *  skilled but always uses flurry attacks.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Ninja extends Profession {
    public Ninja() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "Mujenia's version of Rogues who are less skilled but always uses flurry attacks.";
    }

    @Override
    public String toString() {
        return "Ninja";
    }
}
