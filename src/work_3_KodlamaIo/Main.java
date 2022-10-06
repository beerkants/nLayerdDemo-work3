package work_3_KodlamaIo;

import work_3_KodlamaIo.Business.Concretes.CourseManager;
import work_3_KodlamaIo.Core.Logging.DataBaseLogger;
import work_3_KodlamaIo.Core.Logging.FileLogger;
import work_3_KodlamaIo.Core.Logging.Logger;
import work_3_KodlamaIo.DataAccess.Concretes.hibernateCourseDao;
import work_3_KodlamaIo.Entities.Concretes.Course;
import work_3_KodlamaIo.Entities.Concretes.Instructor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(1,"java geliştirici kursu","yazılım geliştirme",1000);
        Course course1 = new Course(1,"c# geliştirici kursu","yazılım geliştirme",1000);
        Instructor instructor = new Instructor(1,"Engin",30,"Software Developer");

        ArrayList<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DataBaseLogger());
        loggers.add(new FileLogger());

        CourseManager courseManager = new CourseManager(new hibernateCourseDao(),loggers);
        courseManager.add(course);
        courseManager.add(course1); // kurs zaten kayıtlı mesajı alacaksın.
    }
}