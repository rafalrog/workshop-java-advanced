package reflection.task1;

public class Student {

    String firstName;
    String lastName;
    int index;
    String fieldOfStudy;

    public Student() {
    }

    public Student(String firstName, String lastName, int index, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        this.fieldOfStudy = fieldOfStudy;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
