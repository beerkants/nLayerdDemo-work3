package work_3_KodlamaIo.DataAccess.Abstracts;

import work_3_KodlamaIo.Entities.Concretes.Course;

import java.util.ArrayList;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    void update(Course course);


}
