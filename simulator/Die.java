/******************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.simulator.Die
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This handles a single Die object.
 ******************************************************************************/
package rekees.simulator;

/**
 *
 * @author Terry
 */
public class Die {
    public static int roll(int sides, int dice) {
        int total = 0;

        for (int i = 0; i < dice; i++) {
            total += (int)(Math.random() * sides) + 1;
        }

        return total;
    }
}
