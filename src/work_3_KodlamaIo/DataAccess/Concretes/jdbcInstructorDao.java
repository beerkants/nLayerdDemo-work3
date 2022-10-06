package work_3_KodlamaIo.DataAccess.Concretes;

import work_3_KodlamaIo.DataAccess.Abstracts.InstructorDao;
import work_3_KodlamaIo.Entities.Concretes.Instructor;

public class jdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor ınstructor) {
        System.out.println("Eğitmen jdbc ile eklendi. " + ınstructor.getNeme());
    }

    @Override
    public void delete(Instructor ınstructor) {
        System.out.println("Eğitmen jdbc ile silindi. " + ınstructor.getNeme());
    }

    @Override
    public void update(Instructor ınstructor) {
        System.out.println("Eğitmen jdbc ile güncellendi. " + ınstructor.getNeme());
    }
}
