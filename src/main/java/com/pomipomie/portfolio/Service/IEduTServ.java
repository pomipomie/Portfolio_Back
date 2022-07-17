
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.EduType;
import java.util.List;

public interface IEduTServ {
    public void createEduT (EduType edut);
    public void deleteEduT (Long eduTId);
    public EduType searchEduT (Long eduTId);
    public EduType editEduT (EduType edut);
    public List<EduType> eduTList();
}
