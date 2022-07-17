
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.User;
import com.pomipomie.portfolio.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServ implements IUserServ {
    
    @Autowired
    public IUserRepo userRepo;

    @Override
    public void createUser(User us) {
        userRepo.save(us);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User searchUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public User editUser(User us) {
        User updatedUs = userRepo.save(us);
       return updatedUs;
    }
    
}
