
package com.pomipomie.portfolio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class User {
    @Id
    private Long id;
    
    private String email;
    private String firstName;
    private String lastName;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate birthDate;
    
    private String location;
    private String phone;
    private String instagram;
    private String linkedIn;
    private String facebook;
    private String twitter;
    private String gitHub;
    private String codePen;
    private String discord;

    public User() {
    }

    public User(Long id, String email, String firstName, String lastName, LocalDate birthDate, String location, String phone, String instagram, String linkedIn, String facebook, String twitter, String gitHub, String codePen, String discord) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.location = location;
        this.phone = phone;
        this.instagram = instagram;
        this.linkedIn = linkedIn;
        this.facebook = facebook;
        this.twitter = twitter;
        this.gitHub = gitHub;
        this.codePen = codePen;
        this.discord = discord;
    }
    
    
}

