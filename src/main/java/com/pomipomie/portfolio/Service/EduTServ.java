
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.EduType;
import com.pomipomie.portfolio.Repo.IEduTRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EduTServ implements IEduTServ {
    
    @Autowired
    public IEduTRepo eduTRepo;

    @Override
    public void createEduT(EduType edut) {
        eduTRepo.save(edut);
    }

    @Override
    public void deleteEduT(Long eduTId) {
        eduTRepo.deleteById(eduTId);
    }

    @Override
    public EduType searchEduT(Long eduTId) {
        return eduTRepo.findById(eduTId).orElse(null);
    }

    @Override
    public EduType editEduT(EduType edut) {
        EduType updatedEduT = eduTRepo.save(edut);
        return updatedEduT;
    }

    @Override
    public List<EduType> eduTList() {
        List<EduType> eduts = eduTRepo.saveAll(eduTRepo.findAll());
        return eduts;
    }
    
}
