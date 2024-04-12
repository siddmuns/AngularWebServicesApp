package sheridancollege.siddmuns.a4_webservices.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sheridancollege.siddmuns.a4_webservices.repository.DatabaseAccess;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/students")
public class CourseController {
    private DatabaseAccess da;

    public CourseController(DatabaseAccess da){
        this.da = da;
    }

}
