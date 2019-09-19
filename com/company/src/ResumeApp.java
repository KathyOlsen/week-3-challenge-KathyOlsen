import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        Person person = new Person();
        ArrayList<Education> educations = new ArrayList<>();
        ArrayList<Job> jobs = new ArrayList<>();
        ArrayList<Skill> skills = new ArrayList<>();


        System.out.println("Welcome to Robo Resume Builder. I will ask you for a variety of information. " +
                "\nPlease enter all words (apart from Job Descriptions and email) with Initial Caps.");
        System.out.println("Please enter your name as you wish it to appear on your resume: ");
        person.setName(key.nextLine());
        System.out.println("Please enter your email address: ");
        person.setEmail(key.nextLine());

        String anotherUni = "yes";
        System.out.println("I will now ask you for information on each educational institution you have attended. " +
                "\nIf you have more than one, please enter the most recent first, then going backwards in time.");
        while (anotherUni.equalsIgnoreCase("yes")){
            Education education = new Education();
            System.out.println("Please enter the full name of your educational institution (e.g, University of " +
                    "Maryland): ");
            education.setUniversity(key.nextLine());
            System.out.println("Please enter the degree you received (e.g., B.A.): ");
            education.setDegree(key.nextLine());
            System.out.println("Please enter your major (e.g., Mathematics): ");
            education.setMajor(key.nextLine());
            System.out.println("Please enter the year you graduated (e.g., 2005): ");
            education.setGradYear(key.nextInt());
            key.nextLine();
            educations.add(education);
            System.out.println("Do you have another educational institution to enter? (yes/no)");
            anotherUni = key.next();
            key.nextLine();
        }

        String anotherJob = "yes";
        System.out.println("Now I will ask you for information on each work experience you have had. " +
                "\nIf you have more than one, please enter the most recent first, then going backwards in time.");
        while (anotherJob.equalsIgnoreCase("yes")){
            Job job = new Job();
            System.out.println("Please enter the full name of the organization (e.g, Smith Industries): ");
            job.setCompany(key.nextLine());
            System.out.println("Please enter your job title (e.g., Program Manager): ");
            job.setJobTitle(key.nextLine());
            System.out.println("Please enter your start date (e.g., January 2015): ");
            job.setStartDate(key.nextLine());
            System.out.println("Please enter your end date (e.g., March 2019 or Current): ");
            job.setEndDate(key.nextLine());
            System.out.println("Please enter your job description: ");
            job.setJobDescription(key.nextLine());
            jobs.add(job);
            System.out.println("Do you have another job to enter? (yes/no)");
            anotherJob = key.next();
            key.nextLine();
        }

        System.out.println("Now I will ask you for information on each skill you have. " +
                "\nPlease enter your best or most important skill first, then in decreasing order of priority " +
                "or proficiency.");
        for(int i = 0; i < 3; i++) {
            Skill skill = new Skill();
            System.out.println("Please enter a skill (e.g, Java): ");
            skill.setSkillName(key.nextLine());
            System.out.println("Please enter your level of proficiency. (Fundamental/Novice/Intermediate/Advanced/Expert): ");
            skill.setProficiency(key.nextLine());
            skills.add(skill);
        }
        System.out.println("Do you have another skill to enter? (yes/no)");
        String anotherSkill = key.next();
        key.nextLine();
        while (anotherSkill.equalsIgnoreCase("yes")){
            Skill skill = new Skill();
            System.out.println("Please enter a skill (e.g, Java): ");
            skill.setSkillName(key.nextLine());
            System.out.println("Please enter your level of proficiency. (Fundamental/Novice/Intermediate/Advanced/Expert): ");
            skill.setProficiency(key.nextLine());
            skills.add(skill);
            System.out.println("Do you have another skill to enter? (yes/no)");
            anotherSkill = key.next();
            key.nextLine();
        }

        person.setEducations(educations);
        person.setJobs(jobs);
        person.setSkills(skills);

        String resume = person.personString() + person.educations.educationString() + person.jobs.jobString() + person.skills.skillString();
        System.out.println("Here is your resume:\n\n" + resume);
    }

}
