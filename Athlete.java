public class Athlete {

    private String name; //Student name
    private int number;//Jersey Number
    private int points;// Total points scored
    private String school;//Student's school;

    public Athlete(String name, int number, int points, String school) {
        this.name = name;
        this.number = number;
        this.points = points;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    
    
    
    
}
