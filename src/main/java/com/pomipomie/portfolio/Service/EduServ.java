
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.Education;
import com.pomipomie.portfolio.Model.Skills;
import com.pomipomie.portfolio.Repo.IEduRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduServ implements IEduServ {
    
    @Autowired
    public IEduRepo eduRepo;

    @Override
    public void createEdu(Education edu) {
        eduRepo.save(edu);
    }

    @Override
    public void deleteEdu(Long eduId) {
        eduRepo.deleteById(eduId);
    }

    @Override
    public Education searchEdu(Long eduId) {
        return eduRepo.findById(eduId).orElse(null);
    }

    @Override
    public Education editEdu(Education edu) {
        Education updatedEdu = eduRepo.save(edu);
        return updatedEdu;
    }

    @Override
    public List<Education> eduList() {
        List<Education> edus = eduRepo.saveAll(eduRepo.findAll());
        return edus;
    }

    @Override
    public List<Skills> seeSkills(Long eduId) {
        Education edus = eduRepo.findById(eduId).get();
        return edus.getSkills();
    }
    
}
