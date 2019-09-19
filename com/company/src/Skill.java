import java.util.ArrayList;

public class Skill {
    private String skillName;
    private String proficiency;
    private ArrayList<Skill> skills = new ArrayList<>();

    public Skill() {
    }

    public Skill(String skillName, String proficiency, ArrayList<Skill> skills) {
        this.skillName = skillName;
        this.proficiency = proficiency;
        this.skills = skills;
    }

    public String skillString(){
        String ss = "SKILLS\n";
        for(int i = 0; i < skills.size(); i++){
            ss += skillName + ", " + proficiency + "\n";
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
