package work_3_KodlamaIo.Business.Concretes;

import work_3_KodlamaIo.Business.Abstracts.courseService;
import work_3_KodlamaIo.Core.Logging.Logger;
import work_3_KodlamaIo.DataAccess.Abstracts.CourseDao;
import work_3_KodlamaIo.Entities.Concretes.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CourseManager implements courseService {
    private CourseDao courseDao;
    private List<Logger> loggers;
    ArrayList<Course> courses = new ArrayList<>();

    public CourseManager(CourseDao courseDao,List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    @Override
    public void add(Course course) {

        if (course.getPrice() < 0) {
            System.out.println("Kurs Ücreti Hatalı..!");
            return;
        }else {
            for (Course c : courses) {
                if (c.getCourseName() == course.getCourseName()) {
                    System.out.println("Kurs Zaten Kayıtlı.");
                    return;
                }
            }
            courses.add(course);
            courseDao.add(course);
            for (Logger logger : loggers) {
                logger.log(course.getCourseName());
            }
        }

    }

    @Override
    public void delete(Course course) {
        courseDao.delete(course);
    }

    @Override
    public void update(Course course) {
        courseDao.update(course);
    }

    @Override
    public List<Course> getAll() {
        return null;
    }
}
