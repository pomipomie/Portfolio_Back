
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.Projects;
import com.pomipomie.portfolio.Model.Skills;
import java.util.List;


public interface IProjServ {
    public void createProj (Projects proj);
    public void deleteProj (Long projId);
    public Projects searchProj (Long projId);
    public Projects editProj (Projects proj);
    public List<Projects> projList();
    public List<Skills> seeSkills(Long projId);
}
