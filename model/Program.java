package model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "programs")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "learning_profile_id")
    private LearningProfile learning_profile;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id")
    private Subject subject;
    @Column
    private String study_form;
    @Column
    private Integer year;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp creation_date;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    private Timestamp last_edit;
    @Column
    private String status;

    public Program() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LearningProfile getLearning_profile() {
        return learning_profile;
    }

    public void setLearning_profile(LearningProfile learning_profile) {
        this.learning_profile = learning_profile;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getStudy_form() {
        return study_form;
    }

    public void setStudy_form(String study_form) {
        this.study_form = study_form;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Timestamp getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Timestamp creation_date) {
        this.creation_date = creation_date;
    }

    public Timestamp getLast_edit() {
        return last_edit;
    }

    public void setLast_edit(Timestamp last_edit) {
        this.last_edit = last_edit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", learning_profile=" + learning_profile +
                ", subject=" + subject +
                ", study_form='" + study_form + '\'' +
                ", year=" + year +
                ", creation_date=" + creation_date +
                ", last_edit=" + last_edit +
                ", status='" + status + '\'' +
                '}';
    }
}
