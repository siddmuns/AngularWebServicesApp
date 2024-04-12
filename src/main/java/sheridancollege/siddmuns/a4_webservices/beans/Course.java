package sheridancollege.siddmuns.a4_webservices.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity(name="STUDENT")
@Data
public class Course {
    @Id
    @Column(name="COURSECODE", nullable = false)
    private String courseCode;
    @Column(name="COURSENAME")
    private String courseName;
    @Column(name="COURSECREDIT")
    private String courseCredit;
    @Column(name="EDIT")
    private boolean edit;

}
