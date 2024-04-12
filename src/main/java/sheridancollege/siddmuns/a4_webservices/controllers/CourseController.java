package sheridancollege.siddmuns.a4_webservices.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sheridancollege.siddmuns.a4_webservices.beans.Course;
import sheridancollege.siddmuns.a4_webservices.repository.DatabaseAccess;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private DatabaseAccess da;

    public CourseController(DatabaseAccess da){
        this.da = da;
    }

    @GetMapping
    public List<Course> getCourseCollection() {
        return da.findAll();
    }

    @PostMapping(consumes = "application/json")
    public String postCourse(@RequestBody Course course) {
        return "http://localhost:8080/courses/" + da.save(course);
    }

    @GetMapping("/{courseCode}")
    public ResponseEntity<Course> getCourseByCode(@PathVariable String courseCode) {
        return da.findCourseByCourseCode(courseCode)
                .map(ResponseEntity::ok)  // if the course is found, return 200 OK
                .orElse(ResponseEntity.notFound().build());  // if not found, return 404 Not Found
    }

    @PutMapping("/{courseCode}")
    public String putIndividualCourse(@RequestBody Course course,@PathVariable String courseCode) {
        course.setCourseCode(courseCode);
        da.save(course);
        return "Total Records: " + da.count();
    }

    @DeleteMapping("/{courseCode}")
    @Transactional
    public String deleteIndividualCourse(@PathVariable String courseCode) {
        da.deleteByCourseCode(courseCode);
        return "Total Records: " + da.count();
    }
}
