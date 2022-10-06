package work_3_KodlamaIo.DataAccess.Concretes;

import work_3_KodlamaIo.DataAccess.Abstracts.InstructorDao;
import work_3_KodlamaIo.Entities.Concretes.Instructor;

public class hibernateInstructorDao implements InstructorDao {
    public void add(Instructor ınstructor) {
        System.out.println("Eğitmen hibernate ile eklendi. " + ınstructor.getNeme());
    }

    @Override
    public void delete(Instructor ınstructor) {
        System.out.println("Eğitmen hibernate ile silindi. " + ınstructor.getNeme());
    }

    @Override
    public void update(Instructor ınstructor) {
        System.out.println("Eğitmen hibernate ile güncellendi. " + ınstructor.getNeme());
    }
}
