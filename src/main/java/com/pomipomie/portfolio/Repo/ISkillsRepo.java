
package com.pomipomie.portfolio.Repo;

import com.pomipomie.portfolio.Model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepo extends JpaRepository <Skills, Long> {
    
}
