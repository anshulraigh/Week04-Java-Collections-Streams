package resumescreening;

public class Resume<T extends JobRole> {
    private final T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobRoleInfo() {
        return "Processing resume for: " + jobRole.getRoleName();
    }
}
