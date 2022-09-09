
package com.pomipomie.portfolio.Controller;

import com.pomipomie.portfolio.Model.EduType;
import com.pomipomie.portfolio.Service.IEduTServ;
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

@CrossOrigin
@RestController
public class EduTCont {
    @Autowired
    public IEduTServ eduTServ;
    
    @CrossOrigin("http://pzxrslcdua.us09.qoddiapp.com/")
    @PostMapping ("/pdata/edut/new")
    public void createEduT (@RequestBody EduType edut) {
        eduTServ.createEduT(edut);
    }
    
    @CrossOrigin("http://pzxrslcdua.us09.qoddiapp.com/")
    @DeleteMapping ("/pdata/edut/{eduTId}/delete")
    public void deleteEduT (@PathVariable Long eduTId) {
        eduTServ.deleteEduT(eduTId);
    }
    
    @CrossOrigin("http://pzxrslcdua.us09.qoddiapp.com/")
    @PutMapping ("/pdata/edut/edit")
    public EduType editEduT (@RequestBody EduType edut) {
        eduTServ.editEduT(edut);
        return edut;
    }
    
    @CrossOrigin("http://pzxrslcdua.us09.qoddiapp.com/")
    @GetMapping ("/pdata/edut/{eduTId}/search")
    @ResponseBody
    public EduType searchEduT (@PathVariable Long eduTId) {
        return eduTServ.searchEduT(eduTId);
    }
    
    @CrossOrigin("http://pzxrslcdua.us09.qoddiapp.com/")
    @GetMapping ("/portfolioap/educt/list")
    @ResponseBody
    public List<EduType> eduTList() {
        List<EduType> eduts = eduTServ.eduTList();
        return eduts;
    }
}
