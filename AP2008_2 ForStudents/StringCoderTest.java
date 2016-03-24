
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The test class StringCoderTest.
 *
 * @author  Robert Gammelgaard
 * @version 04082015
 */
public class StringCoderTest
{
    private StringCoder stringCo1;

    /**
     * Default constructor for test class StringCoderTest
     */
    public StringCoderTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        stringCo1 = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void overeagerEncode()
    {
        ArrayList<StringPart> sp=stringCo1.encodeString("overeager");
        assertEquals("[(37, 3), (14, 2), (46, 2), (9, 2)]", sp.toString());
    }

    @Test
    public void overeagerDecode()
    {
        ArrayList<StringPart> sp = new ArrayList<StringPart>();
        sp.add(new StringPart(37,3));
        sp.add(new StringPart(14,2));
        sp.add(new StringPart(46,2));
        sp.add(new StringPart(9,2));
        assertEquals("overeager", stringCo1.decodeString(sp));
    }

    @Test
    public void discombobulateEncode()
    {
        ArrayList<StringPart> sp=stringCo1.encodeString("discombobulate");
        assertEquals("[(28, 1), (1, 1), (0, 1), (19, 1), (31, 2), (45, 1), (31, 1), (45, 1), (17, 1), (21, 1), (46, 1), (43, 2)]", sp.toString());
    }

    @Test
    public void discombobulateDecode()
    {
        ArrayList<StringPart> sp = new ArrayList<StringPart>();
        sp.add(new StringPart(28, 1));
        sp.add(new StringPart(1, 1));
        sp.add(new StringPart(0, 1));
        sp.add(new StringPart(19, 1));
        sp.add(new StringPart(31, 2));
        sp.add(new StringPart(45, 1));
        sp.add(new StringPart(31, 1));
        sp.add(new StringPart(45, 1));
        sp.add(new StringPart(17, 1));
        sp.add(new StringPart(21, 1));
        sp.add(new StringPart(46, 1));
        sp.add(new StringPart(43, 2));

        assertEquals("discombobulate", stringCo1.decodeString(sp));
    }
   /* 
    @Test
    public void yourownphraseEncodeDecode()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode:");
        String entry = sc.nextLine();
        entry = entry.replaceAll("(\\W)", "");
        entry=entry.trim().toLowerCase();
        ArrayList<StringPart> sp=stringCo1.encodeString(entry);
        String decoded = stringCo1.decodeString(sp);
        System.out.println("Your decoded string is: "+decoded);
        assertEquals(entry, decoded);
    }
    */

}
