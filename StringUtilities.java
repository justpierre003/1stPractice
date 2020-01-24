/**
 * Write a description of class StringUtilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringUtilities
{
   public Character getMiddleCharacter(String word) {
        int middle = word.length()/2;
        char m = word.charAt(middle);
        return(m);
    }
   public String removeCharacter(String value, char charToRemove) {
        String m = Character.toString(charToRemove);
        return(value.replace(m,""));
    }
   public String getLastWord(String value) {
        return(value.substring(value.lastIndexOf(" ")+1));
    }
    
   public String concatenate(String baseValue, String valueToBeAdded) {
        return(baseValue + valueToBeAdded);
    }
   public String reverse(String valueToBeReversed) {
        String reversed = "";
        for(int i = valueToBeReversed.length()-1;i >= 0;i-- ) {
            reversed = reversed + valueToBeReversed.charAt(i);
        }
        
        return(reversed);
    }
    public String returnInput(String value){
        return(value);
    }
}
