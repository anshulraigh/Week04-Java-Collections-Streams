package resumescreening;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Resume<? extends JobRole>> resumes = new ArrayList<>();

        resumes.add(new Resume<>(new SoftwareEngineer()));
        resumes.add(new Resume<>(new DataScientist()));
        resumes.add(new Resume<>(new ProductManager()));

        ResumeScreeningPipeline pipeline = new ResumeScreeningPipeline();
        pipeline.screenResumes(resumes);
    }
}
