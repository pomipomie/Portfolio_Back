
package com.pomipomie.portfolio.Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter @Setter
@Entity
public class Projects {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "proj_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )
    private Long projId;
    
    private String pName;
    private String pDescription;
    private String pUrl;
    private String pPreview;
    private String pRepo;
    
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(name = "projects_skills",
        joinColumns = @JoinColumn(name = "projId"),
        inverseJoinColumns = @JoinColumn(name = "skillId")
    )
    private List<Skills> skills;

    public Projects() {
    }

    public Projects(Long projId, String pName, String pDescription, String pUrl, String pPreview, String pRepo, List<Skills> skills) {
        this.projId = projId;
        this.pName = pName;
        this.pDescription = pDescription;
        this.pUrl = pUrl;
        this.pPreview = pPreview;
        this.pRepo = pRepo;
        this.skills = skills;
    }

    
    
    
}
