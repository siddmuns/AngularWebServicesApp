package sheridancollege.siddmuns.a4_webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sheridancollege.siddmuns.a4_webservices.beans.Course;

import java.util.List;
import java.util.Optional;

public interface DatabaseAccess extends JpaRepository<Course, Long> {
    Optional<Course> findCourseByCourseCode(String courseCode);

    void deleteByCourseCode(String courseCode);
}
