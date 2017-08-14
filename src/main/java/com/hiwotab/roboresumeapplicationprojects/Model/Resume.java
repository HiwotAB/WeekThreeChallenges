package com.hiwotab.roboresumeapplicationprojects.Model;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class Resume {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull

    @Size(min=2)
    private String firstname;
    @NotNull

    @Size(min=2)
    private String lastname;
    @NotNull
    @NotEmpty
    @Email
    private String email;

    public ArrayList<EduAchievements> eduAchieve;

    private  ArrayList<WorkExperiences>  workExp;

    private ArrayList<Skills> skils;
    // here we see that the main class Resume default constructor has another
    // different classes that to make and create a 'has-a' relationship that is Composition.
    //Also we can see that access the relationship class attribute.

   /* public Resume(){
        this.eduAchieve=new EduAchievements();
        this.workExp=new WorkExperiences();
        this.skils=new Skills();
    }*/
   /* public String getEduType() {

        return eduAchieve.getEduType();
    }
    public String getUniName() {
        return eduAchieve.getUniName();
    }
    public int getGrdYear() {
        return eduAchieve.getGrdYear();
    }
    public String getOrgName() {
        return workExp.getOrgName();
    }
    public String getProfName() {
        return workExp.getProfName();
    }
    public String getProfLevel() {
        return workExp.getProfLevel();
    }
    public String getDuty() {
        return workExp.getDuty();
    }

    public Date getStartDate() {
        return workExp.getStartDate();
    }
    public String getSkill() {
        return skils.getSkill();
    }
    public String getRate() {
        return skils.getRate();
    }
*/
    public String getFirstname() {return firstname; }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<EduAchievements> getEduAchieve() {
        return eduAchieve;
    }
    public void setEduAchieve(ArrayList<EduAchievements> eduAchieve) {
        this.eduAchieve = eduAchieve;
    }

    public ArrayList<WorkExperiences> getWorkExp() {
        return workExp;
    }

    public void setWorkExp(ArrayList<WorkExperiences> workExp) {
        this.workExp = workExp;
    }

    public ArrayList<Skills> getSkils() {
        return skils;
    }

    public void setSkils(ArrayList<Skills> skils) {
        this.skils = skils;
    }
}
