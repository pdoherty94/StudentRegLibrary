
public class StudentInfo {

    private String name;
    private int age;
    private String dateOfBirth;
    private String username;
    private String ID;

    public StudentInfo(String name, int age, String dateOfBirth, String ID) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.ID = ID;
    }

    public String getUsername() {
        username= name + age;

        return username;
    }

    public int getAge() {
        return age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dateOfBirth;
    }

    public void setDob(String dob) {
        this.dateOfBirth = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}