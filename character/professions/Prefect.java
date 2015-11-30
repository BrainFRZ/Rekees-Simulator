/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Prefect
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Prefect profession. This is usually a Yuan-Ti who turned unarmed
 *  combat into an art form.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Prefect extends Profession {
    public Prefect() {
        will      = WillSave.POOR;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.GOOD;
    }


    @Override
    public String getDescription() {
        return "Usually a Yuan-Ti who turned unarmed combat into an art form.";
    }

    @Override
    public String toString() {
        return "Prefect";
    }
}
