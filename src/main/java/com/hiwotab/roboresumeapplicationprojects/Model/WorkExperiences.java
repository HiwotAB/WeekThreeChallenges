package com.hiwotab.roboresumeapplicationprojects.Model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
public class WorkExperiences {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String orgName;
    @NotNull
    private String profName;
    @NotNull
    private String ProfLevel;
    @NotNull
    private String duty;
    @NotNull
    @DateTimeFormat(pattern = "MM/dd/YYYY")
    private Date startDate;
    @NotNull
    @DateTimeFormat(pattern = "MM/dd/YYYY")
    private Date endDate;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfLevel() {
        return ProfLevel;
    }

    public void setProfLevel(String profLevel) {
        ProfLevel = profLevel;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
