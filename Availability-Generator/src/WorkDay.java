// Language imports
import java.util.ArrayList;

/**
 * @author Steven Gantz
 * @version 1.0 -
 * This container can be used to better
 * organize the Data Access Object for
 * later handling.
 */
public class WorkDay {

    // Attributes
    /**
     * Contains the name of the work day
     */
    private String workDayName;

    /**
     * List of all available time slots
     */
    private ArrayList<Boolean> timeSlots;

    /**
     * General Constructor,
     * Creates empty lists
     */
    WorkDay(String workDayName){
        this.workDayName = workDayName;
        timeSlots = new ArrayList<>();
        // Start out with all time slots open
        for(int i = 0; i < 31; i++){
            //TODO
            // Note: This can be altered to true
            // depending on availability implementation
            timeSlots.add(false);
        }
    }

    /**
     * Set parameter location to true
     * @param i time slot boolean to be changed to true
     */
    public void setTrue(int i){
        timeSlots.set(i, true);
    }

    /**
     * Set parameter location to false
     * @param i time slot boolean to be changed to false
     */
    public void setFalse(int i){
        timeSlots.set(i, false);
    }

    /**
     * Check boolean value of parameter location
     * @param i time slot boolean to be returned
     */
    public boolean checkBooleanValue(int i){ return timeSlots.get(i);}

    /**
     * Day name setter
     * @param workDayName String to set as work day name
     */
    public void setWorkDayName(String workDayName){
        this.workDayName = workDayName;
    }

    /**
     * Day name getter
     */
    public String getWorkDayName(){
        return this.workDayName;
    }

    /**
     * Available method for debugging work days
     * @return Workday in string representation
     */
    @Override
    public String toString(){
        // Generate String of true and false from time slot array of size 31
        StringBuilder builder = new StringBuilder(31);
        // Iterate through timeSlots and append each element as strings to builder
        this.timeSlots.forEach(builder::append);
        return this.workDayName + ":" + builder.toString();
    }

}
