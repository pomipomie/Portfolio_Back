
package com.pomipomie.portfolio.Controller;

import com.pomipomie.portfolio.Model.Education;
import com.pomipomie.portfolio.Model.Projects;
import com.pomipomie.portfolio.Model.Skills;
import com.pomipomie.portfolio.Service.ISkillsServ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin (origins = "http://localhost:3000" )
@RestController
public class SkillsCont {
    @Autowired
    public ISkillsServ skillServ;
    
    @PostMapping ("/pdata/skill/new")
    public void createSkill (@RequestBody Skills skill) {
        skillServ.createSkill(skill);
    }
    
    @DeleteMapping ("/pdata/skill/{skillId}/delete") 
    public void deleteSkill (@PathVariable Long skillId) {
        skillServ.deleteSkill(skillId);
    }
    
    @PutMapping ("/pdata/skill/edit")
    public Skills editSkill (@RequestBody Skills skill) {
        skillServ.editSkill(skill);
        return skill;
    }
    
    @GetMapping ("/pdata/skill/{skillId}/search")
    @ResponseBody
    public Skills searchSkill (@PathVariable Long skillId) {
        return skillServ.searchSkill(skillId);
    }
    
    @GetMapping ("/pdata/skill/list")
    @ResponseBody
    public List<Skills> skillList() {
        List<Skills> skills = skillServ.skillList();
        return skills;
    }
    
    @GetMapping ("/pdata/skill/{skillId}/education")
    @ResponseBody
    public List<Education> seeEdu (@PathVariable Long skillId) {
        return skillServ.seeEdu(skillId);
    }
    
    @GetMapping ("/pdata/skill/{skillId}/projects")
    @ResponseBody
    public List<Projects> seeProj (@PathVariable Long skillId) {
        return skillServ.seeProj(skillId);
    }
}
