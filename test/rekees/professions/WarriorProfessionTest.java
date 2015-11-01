package rekees.professions;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rekees.Character;

import static org.testng.Assert.*;

/**
 * Created by Robert on 2015-10-31.
 */
public class WarriorProfessionTest {
    private WarriorProfession _target;

    @BeforeMethod
    public void setUp() throws Exception {
        Character character = new Character("TEST");
        character.setLevel(10);
        _target = new WarriorProfession(character);
    }

    @Test
    public void testGetWillSaveModifier() throws Exception {
        assertEquals(_target.getWillSaveModifier(), 3);
    }

    @Test
    public void testGetFortitudeSaveModifier() throws Exception {
        assertEquals(_target.getFortitudeSaveModifier(), 7);
    }

    @Test
    public void testGetReflexSaveModifier() throws Exception {
        assertEquals(_target.getReflexSaveModifier(), 3);
    }
}