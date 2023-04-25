import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iqLevel;
    private Family family;
    private HumanScheduleDay humanScheduleDay;



    public void greetPet(){
        System.out.println("Hello, "+ family.getPet().getNickname());
    }

    public void describePet(){
        System.out.println("I have " + family.getPetSpecies() + " its age is " + family.getPetAge() +" " + family.getPetTrickennes());
    }

    @Override
    public String toString(){
        return "Human{name='"+ this.getName() + "', surname='" + this.getSurname() +"', year=" + this.getYearOfBirth()+ ", iq=" + this.getIqLevel()+ "," + this.getHumanScheduleDay() +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && iqLevel == human.iqLevel && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(family, human.family) && Objects.equals(humanScheduleDay, human.getHumanScheduleDay()) && Objects.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth, iqLevel, family, humanScheduleDay);
    }

    public Human(){}

    public Human(String name, String surname, int yearOfBirth){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.humanScheduleDay = new HashMap<String, String>();
    }

    public Human (String name, String surname, int yearOfBirth, int iqLevel, HumanScheduleDay humanScheduleDay ){
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iqLevel= iqLevel;
        this.setHumanScheduleDay(humanScheduleDay);
        this.humanScheduleDay = new HashMap<String, String>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    };

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setIqLevel(int iqLevel){
        this.iqLevel = iqLevel;
    }

    public int getIqLevel(){
        return iqLevel;
    }

    public void setHumanScheduleDay (HumanScheduleDay humanScheduleDay){
        this.humanScheduleDay = humanScheduleDay;
        this.humanScheduleDay = new HashMap<String, String>();
        for (String key : humanScheduleDay.getSchedule().keySet()) {
            this.humanScheduleDay.put(key, humanScheduleDay.getSchedule().get(key));
        }
    }

    public HumanScheduleDay getHumanScheduleDay(){
        return humanScheduleDay;
    }

    public void setFamily(Family family){
        this.family = family;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.humanScheduleDay = schedule;
    }

    public Map<String, String> getSchedule() {
        return humanScheduleDay;
    }

    @Override
    protected void finalize() throws Throwable {

