
package com.pomipomie.portfolio.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter @Setter
@Entity
public class EduType implements Serializable {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "edut_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )
    private Long eduTId;
    
    private String eduType;
    
    @JsonIgnore
    @OneToMany (cascade= CascadeType.ALL, mappedBy="eduTId")
    private List<Education> edus;

    public EduType() {
    }

    public EduType(Long eduTId, String eduType, List<Education> edus) {
        this.eduTId = eduTId;
        this.eduType = eduType;
        this.edus = edus;
    }
    
    
}
