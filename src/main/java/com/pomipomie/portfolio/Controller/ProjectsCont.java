
package com.pomipomie.portfolio.Controller;


import com.pomipomie.portfolio.Model.Projects;
import com.pomipomie.portfolio.Model.Skills;
import com.pomipomie.portfolio.Service.IProjServ;
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
public class ProjectsCont {
    @Autowired
    public IProjServ projServ;
    
    @PostMapping ("/pdata/projects/new")
    public void createProj (@RequestBody Projects projs) {
       projServ.createProj(projs);
    }
    
    @DeleteMapping ("/pdata/projects/{projId}/delete")
    public void deleteProj (@PathVariable Long projId) {
        projServ.deleteProj(projId);
    }
    
    @PutMapping ("/pdata/projects/edit")
    public Projects editProj (@RequestBody Projects projs) {   
        projServ.editProj(projs);
         return projs;
    }
    
    @GetMapping ("/pdata/projects/{projId}/search")
    @ResponseBody
    public Projects searchProj(@PathVariable Long projId) {
        return projServ.searchProj(projId);
    }
    
    @GetMapping ("/pdata/projects/{ptojId}/skills")
    @ResponseBody
    public List<Skills> seeSkills (@PathVariable Long projId) {
        return projServ.seeSkills(projId);
    }
    
    @GetMapping ("/pdata/projects/list")
    @ResponseBody
    public List<Projects> projList() {
        List<Projects> projs = projServ.projList();
        return projs;
    }
    
}
