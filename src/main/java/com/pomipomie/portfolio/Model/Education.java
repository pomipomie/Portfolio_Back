
package com.pomipomie.portfolio.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Getter @Setter
@Entity
public class Education {
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "edu_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )
    private Long eduId;
    
    private String title;
    private String institution;
    private String educInfo;
    private String educUrl;
    private String place;
    private String certif;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate endDate;
    
    @ManyToOne
    @JoinColumn (name="eduTId", nullable= false)
    private EduType eduTId;
    
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "education_skills",
            joinColumns = @JoinColumn(name = "eduId"),
            inverseJoinColumns = @JoinColumn(name = "skillId")
    )
    private List<Skills> skills;

    public Education() {
    }

    public Education(Long eduId, String title, String institution, String educInfo, String educUrl, String place, String certif, LocalDate startDate, LocalDate endDate, EduType eduTId, List<Skills> skills) {
        this.eduId = eduId;
        this.title = title;
        this.institution = institution;
        this.educInfo = educInfo;
        this.educUrl = educUrl;
        this.place = place;
        this.certif = certif;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eduTId = eduTId;
        this.skills = skills;
    }
    
    
}
