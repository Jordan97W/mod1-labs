package lab13;

import java.util.ArrayList;

public class SkilledWorker extends Employee {

    private ArrayList<String> skills;

    public SkilledWorker(String name, String jobTitle) {
        super(name, jobTitle);
        skills = new ArrayList<String>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder(super.getInfo());
        info.append("Skills: ");
        for (String skill : skills) {
            info.append(skill).append(" ");
        }
        info.append("\n");
        return info.toString();
    }
}