/******************************************************************************
 *  Program Name:     Combat Simulator
 *  Class Name:       rekees.AffectedType
 *  Author:           Terry Weiss
 *  Date Written:     October 29, 2015
 *  Program Description:
 *     This enumerated list contains all the status types that can be changed
 *  by a spell, trap, or other event.
 ******************************************************************************/
package rekees;

/**
 *
 * @author Terry
 */
public enum AffectedType {
    POISONED, MAGIC_SLEEP, FLOATING, DISEASED, DROWNING, SUFFOCATING, BUFFED,
    NEAR_DEATH, // For events that make you near death only during the event
    DEAD;       // For insta-kill events such as "Serpenticus"
}
