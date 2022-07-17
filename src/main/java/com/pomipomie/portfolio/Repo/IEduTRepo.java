
package com.pomipomie.portfolio.Repo;

import com.pomipomie.portfolio.Model.EduType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEduTRepo extends JpaRepository <EduType, Long> {
    
}
