
package com.pomipomie.portfolio.Repo;

import com.pomipomie.portfolio.Model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEduRepo extends JpaRepository <Education, Long> {
    
}
