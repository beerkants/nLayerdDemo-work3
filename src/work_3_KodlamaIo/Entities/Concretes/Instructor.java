package work_3_KodlamaIo.Entities.Concretes;

import work_3_KodlamaIo.Entities.Abstracts.EntityInstructor;

public class Instructor implements EntityInstructor {

    private int id;
    private String neme;
    private int age;
    private String profession;

    public Instructor () {}
    public Instructor(int id, String name,int age,String profession) {
        this.setId(id);
        this.setNeme(name);
        this.setAge(age);
        this.setProfession(profession);
    }


    // getters - setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNeme() {
        return neme;
    }

    public void setNeme(String neme) {
        this.neme = neme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
