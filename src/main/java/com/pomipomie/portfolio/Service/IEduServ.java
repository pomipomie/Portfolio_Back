
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.Education;
import com.pomipomie.portfolio.Model.Skills;
import java.util.List;


public interface IEduServ {
    public void createEdu (Education edu);
    public void deleteEdu (Long eduId);
    public Education searchEdu (Long eduId);
    public Education editEdu (Education edu);
    public List<Education> eduList();
    public List<Skills> seeSkills(Long eduId);
}
