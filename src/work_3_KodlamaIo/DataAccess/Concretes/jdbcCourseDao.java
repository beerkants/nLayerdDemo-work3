package work_3_KodlamaIo.DataAccess.Concretes;

import work_3_KodlamaIo.DataAccess.Abstracts.CourseDao;
import work_3_KodlamaIo.Entities.Concretes.Course;

public class jdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs jdbc ile eklendi." + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs jdbc ile silindi." + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Kurs jdbc ile güncellendi." + course.getCourseName());
    }
}
