
package com.pomipomie.portfolio.Repo;

import com.pomipomie.portfolio.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository <User, Long> {
    
}
