package com.company;
import java.util.ArrayList;

public class Skill {
    private String skillName;
    private String proficiency;
    private ArrayList<Skill> skills;

    public Skill() {
    }

    public Skill(String skillName, String proficiency, ArrayList<Skill> skills) {
        this.skillName = skillName;
        this.proficiency = proficiency;
        this.skills = new ArrayList<>();
    }

    public String skillString(){
        String ss = "SKILLS\n";
        for(Skill skill : getSkills()){
            ss += getSkillName() + ", " + getProficiency() + "\n";
        }
        ss += "\n";
        return ss;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
