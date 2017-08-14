package com.hiwotab.roboresumeapplicationprojects.Model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
public class WorkExperiences {
    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @NotEmpty
    @Size(min=4)
    private String orgName;
    @NotNull
    @NotEmpty
    @Size(min=2)
    private String profName;
    @NotNull
    @NotEmpty
    @Size(min=1)
    private String ProfLevel;
    @NotNull
    @NotEmpty
    @Size(min=2)
    private String duty;
    @NotNull
   // @Temporal(TemporalType.Date)
    @DateTimeFormat(pattern = "MM/dd/YYYY")
    private Date startDate;
    @NotNull
   // @Temporal(TemporalType.Date)
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
