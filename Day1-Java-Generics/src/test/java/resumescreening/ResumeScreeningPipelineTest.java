package resumescreening;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ResumeScreeningPipelineTest {

    @Test
    void testScreeningPipeline() {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(new Resume<>(new SoftwareEngineer()));
        resumes.add(new Resume<>(new DataScientist()));
        resumes.add(new Resume<>(new ProductManager()));

        ResumeScreeningPipeline pipeline = new ResumeScreeningPipeline();
        assertDoesNotThrow(() -> pipeline.screenResumes(resumes));
    }
}
