import java.util.Calendar;

public class Person {
    String firstName;
    String lastName;
    String ID;
    String title;
    int YOB;
int Year;
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
        this.Year = Year;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    public int getYear(){
        return Year;
    }
    public int setYear(int i){
        return this.Year = Year;
    }
    public String getFullName() {
        return this.firstName + " " + this.getLastName();
    }
    public String getFormalName() {

        return this.title + " " + this.firstName + " " + this.lastName;

    }
public int getAge(){
        return 2024 - this.YOB;
}
    public String toCSVDataRecord()
    {
        return this.ID + ", " + this.firstName + ", " + this.lastName + ", " + this.title + ", " + this.YOB;
    }
    //Calendar rightNow = Calendar.getInstance();
    public String getAge2(){
        return this.ID;
    }
}
