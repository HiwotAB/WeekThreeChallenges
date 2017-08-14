package com.hiwotab.roboresumeapplicationprojects.Model;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EduAchievements {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @NotEmpty
    @Size(min=4)
    private String eduType;
    @NotNull
    @NotEmpty
    @Size(min=4)
    private String uniName;

    private int grdYear;
    public String getEduType() {return eduType;   }

    public void setEduType(String eduType) {
        this.eduType = eduType;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public int getGrdYear() {
        return grdYear;
    }

    public void setGrdYear(int grdYear) {
        this.grdYear = grdYear;
    }
}
