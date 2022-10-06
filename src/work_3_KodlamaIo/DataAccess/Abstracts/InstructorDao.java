package work_3_KodlamaIo.DataAccess.Abstracts;

import work_3_KodlamaIo.Entities.Concretes.Instructor;

public interface InstructorDao {
    void add(Instructor ınstructor);
    void delete(Instructor ınstructor);
    void update(Instructor ınstructor);
}
