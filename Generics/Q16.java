package generics;
import java.util.*;

abstract class JobRole { String role; JobRole(String r){ this.role = r; } }
class SoftwareEngineer extends JobRole { SoftwareEngineer(){ super("Software Engineer"); } }
class DataScientist extends JobRole { DataScientist(){ super("Data Scientist"); } }

class Resume<T extends JobRole> {
    T jobRole;
    Resume(T jobRole){ this.jobRole = jobRole; }
}

class ScreeningUtil {
    static void processResumes(List<? extends JobRole> roles) {
        for(JobRole r: roles) System.out.println("Processing resume for " + r.role);
    }
}

public class Q16 {
    public static void main(String[] args){
        List<JobRole> roles = List.of(new SoftwareEngineer(), new DataScientist());
        ScreeningUtil.processResumes(roles);
    }
}
