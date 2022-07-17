
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.Projects;
import com.pomipomie.portfolio.Model.Skills;
import com.pomipomie.portfolio.Repo.IProjRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjServ implements IProjServ {
   @Autowired
   public IProjRepo projRepo;

    @Override
    public void createProj(Projects proj) {
        projRepo.save(proj);
    }

    @Override
    public void deleteProj(Long projId) {
        projRepo.deleteById(projId);
    }

    @Override
    public Projects searchProj(Long projId) {
        return projRepo.findById(projId).orElse(null);
    }

    @Override
    public Projects editProj(Projects proj) {
        Projects updatedProj = projRepo.save(proj);
        return updatedProj;
    }

    @Override
    public List<Projects> projList() {
        List<Projects> projs = projRepo.saveAll(projRepo.findAll());
        return projs;
    }

    @Override
    public List<Skills> seeSkills(Long projId) {
        Projects projs = projRepo.findById(projId).get();
        return projs.getSkills();
    }
   
}
