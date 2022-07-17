
package com.pomipomie.portfolio.Repo;

import com.pomipomie.portfolio.Model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjRepo extends JpaRepository <Projects, Long>{
    
}
