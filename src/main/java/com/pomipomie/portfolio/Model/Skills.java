
package com.pomipomie.portfolio.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Skills {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "skills_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )
    private Long skillId;
    
    private String skillName;
    private String skillLevel;
    
    @JsonIgnore
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "education_skills",
            joinColumns = @JoinColumn(name = "skillId"),
            inverseJoinColumns = @JoinColumn(name = "eduId")
    )
    private List<Education> edus;

    public Skills() {
    }

    public Skills(Long skillId, String skillName, String skillLevel, List<Education> edus) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.skillLevel = skillLevel;
        this.edus = edus;
    }
    
    
}
