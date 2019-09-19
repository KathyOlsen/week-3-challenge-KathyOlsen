import java.util.ArrayList;

public class Job {
    private String company;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String jobDescription;
    private ArrayList<Job> jobs = new ArrayList<>();

    public Job(){}

    public Job(String company, String jobTitle, String startDate, String endDate, String jobDescription){
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescription = jobDescription;
        this.jobs = jobs;
    }

    public String jobString(){
        String js = "WORK EXPERIENCE\n";
        for(int i = 0; i < jobs.size(); i++){
            js += jobTitle + ", " + company.toUpperCase() + "\n" + startDate + " - " + endDate + "\n\t- " + jobDescription
                    + "\n\n";
        }
        js += "\n";
        return js;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
