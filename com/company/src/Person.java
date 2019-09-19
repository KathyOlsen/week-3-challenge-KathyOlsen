import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private ArrayList<Education> educations = new ArrayList<>();
    private ArrayList<Job> jobs = new ArrayList<>();
    private ArrayList<Skill> skills = new ArrayList<>();

    public Person(){}

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Person(String name, String email, ArrayList<Education> educations, ArrayList<Job> jobs, ArrayList<Skill> skills) {
        this.name = name;
        this.email = email;
        this.educations = educations;
        this.jobs = jobs;
        this.skills = skills;
    }

    public String personString(){
        String ps = name.toUpperCase() + "\n" + email + "\n\n";
        return ps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
