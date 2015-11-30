/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Vekblade
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Vekblade profession. This is the complete opposite of Holyblades who
 *  serve Vek, the God of Secrets.
 *
 *  To Do:
 *  Add special "backhand" skill that stuns you and renders you prone if they're mounted.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Vekblade extends Profession {
    public Vekblade() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "The complete opposite of Holyblades who serve Vek, the God of Secrets.";
    }

    @Override
    public String toString() {
        return "Vekblade";
    }
}
