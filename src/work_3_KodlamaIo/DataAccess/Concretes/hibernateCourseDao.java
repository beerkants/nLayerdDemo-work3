package work_3_KodlamaIo.DataAccess.Concretes;

import work_3_KodlamaIo.DataAccess.Abstracts.CourseDao;
import work_3_KodlamaIo.Entities.Concretes.Course;

public class hibernateCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Kurs hibernate ile eklendi." + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs hibernate ile silindi." + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Kurs hibernate ile güncellnedi." + course.getCourseName());
    }
}
