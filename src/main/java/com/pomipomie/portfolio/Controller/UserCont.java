
package com.pomipomie.portfolio.Controller;
import com.pomipomie.portfolio.Model.User;
import com.pomipomie.portfolio.Service.IUserServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserCont {
    @Autowired
    public IUserServ userServ;
    
    @PostMapping ("/pdata/user/new")
    public void createUser (@RequestBody User us) {
       userServ.createUser(us);
    }
    
    @DeleteMapping ("/pdata/user/{id}/delete")
    public void deleteUser (@PathVariable Long id) {
        userServ.deleteUser(id);
    }
    
    @PutMapping ("/pdata/user/edit")
    public User editUser (@RequestBody User us) {   
        userServ.editUser(us);
         return us;
    }
    
    @GetMapping ("/pdata/user/{id}/search")
    @ResponseBody
    public User searchUser(@PathVariable Long id) {
        return userServ.searchUser(id);
    }
}
