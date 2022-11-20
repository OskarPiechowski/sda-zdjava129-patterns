package pl.sdacademy.java.patterns;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

//DRY - don't repeat yourself'
//YAGNI - you aren't going to need it '
//KISS - keep it simple stupid
//DEMETER - ograniczanie powiązań do "bliskich przyjaciół"
//Brzytwa Ockhama- nie mnóżmy bytów (YAGNI).

public class Grade {

    private UUID courseUuid;
    private GradeType gradeType;
    private BigDecimal value;
    private LocalDateTime issueDateTime;

    public Grade(UUID courseUuid, GradeType gradeType, BigDecimal value, LocalDateTime issueDateTime) {
        this.courseUuid = courseUuid;
        this.gradeType = gradeType;
        this.value = value;
        this.issueDateTime = issueDateTime;
    }

    public UUID getCourseUuid() {
        return courseUuid;
    }

    public GradeType getGradeType() {
        return gradeType;
    }

    public BigDecimal getValue() {
        return value;
    }

    public LocalDateTime getIssueDateTime() {
        return issueDateTime;
    }
}
