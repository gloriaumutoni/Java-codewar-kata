/*
 The parameter weekday is true if it is a weekday, and the parameter vacation is true if 
 we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true 
 if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/

public class sleepIn {
    public static void main(String[] args){
System.out.println(canSleepIn(false, false));
System.out.println(canSleepIn(true, false));
System.out.println(canSleepIn(false, true));
    }
    public static boolean canSleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation ? true : false;
    }
}
