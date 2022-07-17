
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.Education;
import com.pomipomie.portfolio.Model.Skills;
import com.pomipomie.portfolio.Repo.ISkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsServ implements ISkillsServ {
    @Autowired
    public ISkillsRepo skillRepo;

    @Override
    public void createSkill(Skills skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long skillId) {
        skillRepo.deleteById(skillId);
    }

    @Override
    public Skills searchSkill(Long skillId) {
        return skillRepo.findById(skillId).orElse(null);
    }

    @Override
    public Skills editSkill(Skills skill) {
        Skills updatedSkill = skillRepo.save(skill);
        return updatedSkill;
    }

    @Override
    public List<Education> seeEdu(Long skillId) {
        Skills skills = skillRepo.findById(skillId).get();
        return skills.getEdus();
    }

    @Override
    public List<Skills> skillList() {
        List<Skills> skills = skillRepo.saveAll(skillRepo.findAll());
        return skills;
    }
    
    
}
