
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.Education;
import com.pomipomie.portfolio.Model.Skills;
import java.util.List;


public interface ISkillsServ {
    public void createSkill (Skills skill);
    public void deleteSkill (Long skillId);
    public Skills searchSkill (Long skillId);
    public Skills editSkill (Skills skill);
    public List<Education> seeEdu(Long skillId);
    public List<Skills> skillList();
}
