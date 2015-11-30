/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Samurai
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Ninja profession. This is Mujenia's version of Knights who are able
 *  to use flurry attacks with a katana.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Samurai extends Profession {
    public Samurai() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "Mujenia's version of Knights who are able to use flurry attacks with a katana.";
    }

    @Override
    public String toString() {
        return "Samurai";
    }
}
