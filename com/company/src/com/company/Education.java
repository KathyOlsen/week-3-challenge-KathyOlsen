package com.company;
import java.util.ArrayList;

public class Education {
    private String degree;
    private String major;
    private String university;
    private int gradYear;
    private ArrayList<Education> educations;

    public Education(){}

    public Education (String degree, String major, String university, int gradYear){
        this.degree = degree;
        this.major = major;
        this.university = university;
        this.gradYear = gradYear;
        this.educations = new ArrayList<>();
    }

    public String educationString(ArrayList<Education> educations){
        String es = "EDUCATION\n";
        for(Education education : getEducations()){
            es += getUniversity() + " (" + getDegree() + " in " + getMajor() + ", " + getGradYear() + ")\n\n";
        }
        es += "\n";
        return es;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }
}
