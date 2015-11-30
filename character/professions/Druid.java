/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.professions.Druid
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This class handles the Druid profession. This is a rather sturdy spellcaster with a high
 *  affinity towards nature.
 **************************************************************************************************/
package rekees.character.professions;

/**
 *
 * @author Terry
 */
public class Druid extends Profession {
    public Druid() {
        will      = WillSave.GOOD;
        fortitude = FortitudeSave.GOOD;
        reflex    = ReflexSave.POOR;
        attack    = AttackModifier.AVERAGE;
    }


    @Override
    public String getDescription() {
        return "A rather sturdy spellcaster with a high affinity towards nature.";
    }

    @Override
    public String toString() {
        return "Druid";
    }
}
