package resumescreening;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResumeTest {

    @Test
    void testResumeProcessing() {
        Resume<SoftwareEngineer> engineerResume = new Resume<>(new SoftwareEngineer());
        assertEquals("Processing resume for: Software Engineer", engineerResume.getJobRoleInfo());
    }
}
