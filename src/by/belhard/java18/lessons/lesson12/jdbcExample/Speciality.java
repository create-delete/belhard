package by.belhard.java18.lessons.lesson12.jdbcExample;

public class Speciality {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public String getSpeciality() {
        return speciality;
    }

    private String speciality;

    public Speciality(int id, String speciality) {
        this.id = id;
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "id=" + id +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
