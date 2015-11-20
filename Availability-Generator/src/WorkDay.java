/**
 * Created by Steven Gantz on 11/19/2015.
 * This container can be used to better
 * organize the Data Access Object for
 * later handling.
 */

// Language imports
import java.util.ArrayList;

public class WorkDay {

    // Attributes
    private String workDayName;
    ArrayList<Boolean> timeSlots;

    /**
     * General Constructor
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
     */
    public void setTrue(int i){
        timeSlots.set(i, true);
    }

    /**
     * Set parameter location to false
     */
    public void setFalse(int i){
        timeSlots.set(i, false);
    }

    /**
     * Day name getter and setter below
     * @param workDayName
     */
    public void setWorkDayName(String workDayName){
        this.workDayName = workDayName;
    }
    public String getWorkDayName(){
        return this.workDayName;
    }



}
