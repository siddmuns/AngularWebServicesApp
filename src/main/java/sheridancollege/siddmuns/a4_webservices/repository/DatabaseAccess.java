package sheridancollege.siddmuns.a4_webservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sheridancollege.siddmuns.a4_webservices.beans.Course;

import java.util.List;

public interface DatabaseAccess extends JpaRepository<Course, Long> {
    List<Course> findCourseByCourseCode(String courseCode);
}
