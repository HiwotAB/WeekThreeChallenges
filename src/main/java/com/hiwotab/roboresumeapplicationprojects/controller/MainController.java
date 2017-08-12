package com.hiwotab.roboresumeapplicationprojects.controller;

import com.hiwotab.roboresumeapplicationprojects.Model.EduAchievements;
import com.hiwotab.roboresumeapplicationprojects.Model.Resume;
import com.hiwotab.roboresumeapplicationprojects.Model.Skills;
import com.hiwotab.roboresumeapplicationprojects.Model.WorkExperiences;
import com.hiwotab.roboresumeapplicationprojects.repositories.EduAchievementsRepostory;
import com.hiwotab.roboresumeapplicationprojects.repositories.ResumeRepostory;
import com.hiwotab.roboresumeapplicationprojects.repositories.SkillsRepostory;
import com.hiwotab.roboresumeapplicationprojects.repositories.WorkExperiencesRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class MainController {

    @Autowired
    ResumeRepostory resumeRepostory;
    @Autowired
    EduAchievementsRepostory eduAchievementsRepostory;
    @Autowired
    WorkExperiencesRepostory workExperiencesRepostory;
    @Autowired
    SkillsRepostory skillsRepostory;
    @GetMapping("/")
    public String showHomePages() {
        return "index";
    }
    @GetMapping("/homePage")
    public String showHomePage() {
        return "index";
    }

    @GetMapping("/addUser")
    public String addUserInfo(Model model) {
        model.addAttribute("newUser", new Resume());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUserInfo(@Valid @ModelAttribute("newUser") Resume resume, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "addUser";
        }

        resumeRepostory.save(resume);
        return "dispUserInfo";
    }

    @GetMapping("/addEduInfo")
    public String addEducationInfo(Model model) {
        model.addAttribute("newEduInfo", new EduAchievements());
        return "addEduInfo";
    }
    @PostMapping("/addEduInfo")
    public String addEducationInfo(@Valid @ModelAttribute("newEduInfo") EduAchievements eduAchievements, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addEduInfo";
        }

        eduAchievementsRepostory.save(eduAchievements);
        return "dispEduInfo";
    }
    @GetMapping("/addWorkExpInfo")
    public String addWorkExpiInfo(Model model) {
        model.addAttribute("newWork", new WorkExperiences());
        return "addWorkExpInfo";
    }
    @PostMapping("/addWorkExpInfo")
    public String addWorkExpiInfo(@Valid @ModelAttribute("newWork") WorkExperiences workExperiences, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addWorkExpInfo";
        }

        workExperiencesRepostory.save(workExperiences);
        return "dispWorkExpInfo";
    }
    @GetMapping("/addSkillInfo")
    public String addSkilsInfo(Model model) {
        model.addAttribute("newSkill", new Skills());
        return "addSkillInfo";
    }
    @PostMapping("/addSkillInfo")
    public String addSkilsInfo(@Valid @ModelAttribute("newSkill") Skills skills, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addSkillInfo";
        }

        skillsRepostory.save(skills);
        return "dispSkillsInfo";
    }
    @GetMapping("/ResultResumeInfo")
    public String listAllResumeInfo(Model model) {
        Resume resume=resumeRepostory.findOne(new Long(1));

        ArrayList<EduAchievements>eduAchievementsArrayList=(ArrayList<EduAchievements>)eduAchievementsRepostory.findAll();
        resume.setEduAchieve(eduAchievementsArrayList);

        ArrayList<Skills>skillsArrayList=(ArrayList<Skills>)skillsRepostory.findAll();
        resume.setSkils(skillsArrayList);

        ArrayList<WorkExperiences>workExperiencesArrayList=(ArrayList<WorkExperiences>) workExperiencesRepostory.findAll();
        resume.setWorkExp(workExperiencesArrayList);

        model.addAttribute("searchUser", resume);
        //model.addAttribute("searchEdu",  eduAchievementsArrayList);
        //model.addAttribute("searchSkil", skillsArrayList);
       // model.addAttribute("searchWork", workExperiencesArrayList);
        return "ResultResumeInfo";

    }


}