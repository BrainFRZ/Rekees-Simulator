/**************************************************************************************************
 *  Program Name:     Rekees Simulator
 *  Class Name:       rekees.character.Culture
 *  Author:           Terry Weiss
 *  Date Written:     November 29, 2015
 *  Program Description:
 *     This is an enumerated list of all the cultures in Rekees. This supports a separation of
 *  cultural benefits for members of a race who weren't born or raised in their homeland.
 **************************************************************************************************/
package rekees.character;

/**
 *
 * @author Terry
 */
public enum Culture {
    //Any race; tribal society; always primitive; usually ruled by Chief and Shaman
    BARBARIC,

    //Any race; Barbaric culture; "Keep what you kill"; always raiders/slavers
    CROVIAN,

    //ALWAYS Dark Elven; royalty worshipped as gods; mostly assassins
    DAVAR,

    //Usually Centaurs/wood elves; embroiled in mysticism;
    DIVINE,

    //Any race; primitive people who worship their leader as a god
    DIVINE_TRIBAL,

    //Usually Draconian; very honorable knights and dishonorable nobles; wild dragon-tamers
    DRACONIAN,

    //Usually Human; Isolated mountain-dwellers; honor- and gender-roles are paramount
    FANIR,

    //Usually dwarves; People who live under Frau'ud; warrior culture; very sexist
    FRAUUD,

    //Supporting Goblins; Whenever Goblins build an army of dumber species
    GOBLIN,

    //Usually Halfling; fearless; tramps, thieves and con men
    HALFLING,

    //Usually Human; Merchant culture; most soldiers and money rule; often ruled by a King
    IDESSAN,

    //Any race; Ilithid or their worshippers or controlled by them; infiltrate other cultures;
    //Usually has hidden horde
    ILITHID,

    //Currently only people from Highsword Empire; equivalent to Renaissance Europe; monarchy has
    //total control
    IMPERIAL,

    //Races that serve dark powers; Usually hide until dark powers surface;
    //tribal without leadership
    LURKERS,

    //Non-sentient creature
    MONSTER,

    //Usually Mujenian; heavily equivalent to feudal Japanese culture
    MUJENIAN,

    //Usually Human; Rekees's "melting pot"; equivalent to medieval Europe;
    //has slave market, but doesn't like it; can only repeal most recent law once per lineage
    NAHMUN,

    //Almost always High Elf; Treats non-High Elevs badly; most advanced culture overall;
    //Gets involved in everything; looks down on everyone else
    NEVLE,

    //ALWAYS Dark Elf; Extreme matriarchal society; lives underground;
    //Men of other races can be slaves
    ONACLOV,

    //Usually Orc; Brutal; typically favors isolation; easy to push into banditry;
    //"Might makes Right"
    ORCISH,

    //Usually Halfings; Primitive; everyone's equal; dinosaur-tamers
    SHAAK,

    //Any race; Mages who are on a conquest, and those who serve them
    SHADOW,

    //Any race excluding Mages; Church has more power than monarchy; usually advanced
    THEOCRACY,

    //Usually Human; Dedicated to piracy; more comically rogueish than blood-thirsty
    TUROB,

    //Usually Human; Naval culture with American-colonial technology; ruled by Merchants and a Queen
    VADARV,

    //Usually Human; Warriors who seek to prove themselves or others as martially superior
    VANGAD,

    //Any race; any culture with an organized military that is unlisted
    WARRIOR,

    //Usually Yuan-Ti; parallel to Imperial China; ruled by Empress; major caste system
    YUAN_TI;



    /**
     * String label of the given Culture, using its name in Capital Case
     *
     * @return Culture's name in Capital Case
     */
    @Override
    public String toString() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
