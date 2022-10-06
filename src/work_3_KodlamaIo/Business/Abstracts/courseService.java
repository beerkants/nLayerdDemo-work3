package work_3_KodlamaIo.Business.Abstracts;

import work_3_KodlamaIo.Entities.Concretes.Course;

import java.util.List;

public interface courseService {
    void add(Course course);
    void delete(Course course);
    void update(Course course);
    List<Course> getAll();
}
