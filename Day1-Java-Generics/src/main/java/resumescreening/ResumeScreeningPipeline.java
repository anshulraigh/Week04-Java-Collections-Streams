package resumescreening;

import java.util.List;

public class ResumeScreeningPipeline {
    public void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
        for (Resume<? extends JobRole> resume : resumes) {
            System.out.println(resume.getJobRoleInfo());
        }
    }
}
