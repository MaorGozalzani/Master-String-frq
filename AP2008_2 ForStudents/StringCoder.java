import java.util.ArrayList;
/**
 * 2008 #2
 * 
 * @author Robert Gammelgaard 
 * @version 04072015
 */
public class StringCoder
{
    private String masterString;

    /**
     * Constructor for objects of class StringCoder
     */
    public StringCoder(String master)
    {  masterString = master;  }

    /**
     * @param  parts an ArrayList of string parts that are valid in the master string
     *         Precondition: parts.size()>0
     * @return the string obtained by concatenating the parts of master string
     */
    public String decodeString(ArrayList<StringPart> parts)
    {
        /* to be implemented in part (a) */
        return "";
    }

    /** @param str the string to encode using the master string;
     *         Precondition: all of the characters in str appear in that master string;
     *                       str.length()>0
     *  @return a StringPart in the master string that matches the beginning of str.
     *          The returned string part has length at least 1.
     */
    private StringPart findPart(String str)
    { 
        int start=0;
        int length=0;
        for (int len=1; len<=str.length(); len++)
        {
            int found=masterString.indexOf(str.substring(0,len));
            if (found!=-1)
            {
                start=found;
                length=len;
            }
        }
        return new StringPart(start, length);
    }

    /** @param word the string to be encoded
     *         Precondition: all of the characters in word appear in the master string;
     *                       word.length()>0
     *  @return an ArrayList of string parts of the master string that can be combined
     *          to create word.
     */
    public ArrayList<StringPart> encodeString(String word)
    { 
        ArrayList<StringPart> list = new ArrayList<StringPart>();
        
        while(word.length()>0){
            StringPart cur= findPart(word);
            list.add(cur);
            word=(word.substring(cur.getLength()));
        }
        return list;
        /*to be implemented in part(b) */
    }
}
