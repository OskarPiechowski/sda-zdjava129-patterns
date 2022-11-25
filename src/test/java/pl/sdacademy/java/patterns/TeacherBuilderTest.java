package pl.sdacademy.java.patterns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TeacherBuilderTest {

    @Test
    void shouldCreateTeacherWithSubject(){
        //when
        Teacher teacher = new TeacherBuilder()
                .subjectCode(Subject.ENG)
                .build();
        //then
        assertThat(teacher).isNotNull();
        assertThat(teacher.getSubjectCodes()).isEqualTo(Subject.ENG);

        }
}
