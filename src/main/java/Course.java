import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by Phillip on 06/10/2016.
 */
public class Course {

    private String courseName;
    private List<Module> listOfModules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, List<Module> listOfModules, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.listOfModules = listOfModules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public List<Module> getListOfModules() {
        return listOfModules;
    }

    public void setListOfModules(List<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
