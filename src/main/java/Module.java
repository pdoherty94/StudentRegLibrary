import java.util.List;

/**
 * Created by Phillip on 06/10/2016.
 */
public class Module {

    private String modName;
    private String modID;
    private List<StudentInfo> listOfStudents;

    public Module(String modName, String modID, List<StudentInfo> listOfStudents) {
        this.modName = modName;
        this.modID = modID;
        this.listOfStudents = listOfStudents;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }
}
