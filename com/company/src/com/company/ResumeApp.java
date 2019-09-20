package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        Person person = new Person();
        Education education = new Education();
        Job job = new Job();
        Skill skill = new Skill();
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
            Education e = new Education();
            System.out.println("Please enter the full name of your educational institution (e.g, University of " +
                    "Maryland): ");
            e.setUniversity(key.nextLine());
            System.out.println("Please enter the degree you received (e.g., B.A.): ");
            e.setDegree(key.nextLine());
            System.out.println("Please enter your major (e.g., Mathematics): ");
            e.setMajor(key.nextLine());
            System.out.println("Please enter the year you graduated (e.g., 2005): ");
            e.setGradYear(key.nextInt());
            key.nextLine();
            educations.add(e);
            System.out.println("Do you have another educational institution to enter? (yes/no)");
            anotherUni = key.next();
            key.nextLine();
        }

        String anotherJob = "yes";
        System.out.println("Now I will ask you for information on each work experience you have had. " +
                "\nIf you have more than one, please enter the most recent first, then going backwards in time.");
        while (anotherJob.equalsIgnoreCase("yes")){
            Job j = new Job();
            System.out.println("Please enter the full name of the organization (e.g, Smith Industries): ");
            j.setCompany(key.nextLine());
            System.out.println("Please enter your job title (e.g., Program Manager): ");
            j.setJobTitle(key.nextLine());
            System.out.println("Please enter your start date (e.g., January 2015): ");
            j.setStartDate(key.nextLine());
            System.out.println("Please enter your end date (e.g., March 2019 or Current): ");
            j.setEndDate(key.nextLine());
            System.out.println("Please enter your job description: ");
            j.setJobDescription(key.nextLine());
            jobs.add(j);
            System.out.println("Do you have another job to enter? (yes/no)");
            anotherJob = key.next();
            key.nextLine();
        }

        System.out.println("Now I will ask you for information on each skill you have. " +
                "\nPlease enter your best or most important skill first, then in decreasing order of priority " +
                "or proficiency.");
        for(int i = 0; i < 3; i++) {
            Skill s = new Skill();
            System.out.println("Please enter a skill (e.g, Java): ");
            s.setSkillName(key.nextLine());
            System.out.println("Please enter your level of proficiency. (Fundamental/Novice/Intermediate/Advanced/Expert): ");
            s.setProficiency(key.nextLine());
            skills.add(s);
        }
        System.out.println("Do you have another skill to enter? (yes/no)");
        String anotherSkill = key.next();
        key.nextLine();
        while (anotherSkill.equalsIgnoreCase("yes")){
            Skill s = new Skill();
            System.out.println("Please enter a skill (e.g, Java): ");
            s.setSkillName(key.nextLine());
            System.out.println("Please enter your level of proficiency. (Fundamental/Novice/Intermediate/Advanced/Expert): ");
            s.setProficiency(key.nextLine());
            skills.add(s);
            System.out.println("Do you have another skill to enter? (yes/no)");
            anotherSkill = key.next();
            key.nextLine();
        }

        person.setEducations(educations);
        person.setJobs(jobs);
        person.setSkills(skills);

        String resume = person.personString() + education.educationString(educations) +
                job.jobString() + skill.skillString();
        System.out.println("Here is your resume:\n\n" + resume);
    }
}
