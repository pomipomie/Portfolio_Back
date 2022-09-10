
package com.pomipomie.portfolio.Controller;

import com.pomipomie.portfolio.Model.Education;
import com.pomipomie.portfolio.Model.Skills;
import com.pomipomie.portfolio.Service.IEduServ;
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

@RestController
@CrossOrigin (origins = "*", allowedHeaders = "*")
public class EducationCont {
    @Autowired
    public IEduServ eduServ;
    
    @PostMapping ("/pdata/education/new")
    public void createEdu (@RequestBody Education edus) {
       eduServ.createEdu(edus);
    }
    
    @DeleteMapping ("/pdata/education/{eduId}/delete")
    public void deleteEdu (@PathVariable Long eduId) {
        eduServ.deleteEdu(eduId);
    }
    
    @PutMapping ("/pdata/education/edit")
    public Education editEdu (@RequestBody Education edus) {   
        eduServ.editEdu(edus);
         return edus;
    }
    
    @GetMapping ("/pdata/education/{eduId}/search")
    @ResponseBody
    public Education searchEdu(@PathVariable Long eduId) {
        return eduServ.searchEdu(eduId);
    }
    
    @GetMapping ("/pdata/education/{eduId}/skills")
    @ResponseBody
    public List<Skills> seeSkills (@PathVariable Long eduId) {
        return eduServ.seeSkills(eduId);
    }
    
    @GetMapping ("/pdata/education/list")
    @ResponseBody
    public List<Education> eduList() {
        List<Education> edus = eduServ.eduList();
        return edus;
    }
}
