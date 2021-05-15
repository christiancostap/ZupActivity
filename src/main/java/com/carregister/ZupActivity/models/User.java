package com.carregister.ZupActivity.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "USER", uniqueConstraints = @UniqueConstraint(columnNames = {"CPF", "EMAIL"}))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    @NotBlank
    private String NAME;

    @NotBlank
    private String EMAIL;

    @NotBlank
    private String CPF;

    @NotBlank
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDate birthDate;

    @OneToMany(mappedBy="USER")
    private List<Car> CARS;

    public Long getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Car> getCARS() {
        return CARS;
    }

    public void setCARS(List<Car> CARS) {
        this.CARS = CARS;
    }
}
