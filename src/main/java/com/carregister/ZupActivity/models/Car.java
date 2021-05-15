package com.carregister.ZupActivity.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @NotBlank
    private String CARBRAND;

    @NotBlank
    private String MODEL;

    @NotBlank
    private Integer YEAR;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User USER;

    public Long getID() {
        return ID;
    }

    public String getCARBRAND() {
        return CARBRAND;
    }

    public void setCARBRAND(String CARBRAND) {
        this.CARBRAND = CARBRAND;
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public Integer getYEAR() {
        return YEAR;
    }

    public void setYEAR(Integer YEAR) {
        this.YEAR = YEAR;
    }

    public User getUSER() {
        return USER;
    }

    public void setUSER(User USER) {
        this.USER = USER;
    }
}
