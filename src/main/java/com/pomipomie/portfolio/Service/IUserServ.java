
package com.pomipomie.portfolio.Service;

import com.pomipomie.portfolio.Model.User;


public interface IUserServ {
    public void createUser (User us);
    public void deleteUser (Long id);
    public User searchUser (Long id);
    public User editUser (User us);
}
