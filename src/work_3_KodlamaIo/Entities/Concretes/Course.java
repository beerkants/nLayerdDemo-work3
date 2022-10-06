package work_3_KodlamaIo.Entities.Concretes;

import work_3_KodlamaIo.Entities.Abstracts.EntityCourse;

public class Course implements EntityCourse {
    private int id;
    private String courseName;
    private String description;
    private int price;

    public Course() {}
    public Course(int id,String courseName,String description,int price) {
        this.setId(id);
        this.setCourseName(courseName);
        this.setDescription(description);
        this.setPrice(price);
    }

    // getters - setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
