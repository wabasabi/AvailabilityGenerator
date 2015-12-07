import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Created by Steven Gantz on 11/19/2015.
 */
public class CustomExcelWriter {

    /**
     * Workbook to write to
     */
    private Workbook workbook;

    /**
     * General Constructor
     */
    CustomExcelWriter(){
        workbook = new XSSFWorkbook();
        Sheet availabilitySheet = workbook.createSheet("Availability");

    }
}
