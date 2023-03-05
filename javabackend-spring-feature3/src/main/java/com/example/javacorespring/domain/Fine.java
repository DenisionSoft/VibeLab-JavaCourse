package com.example.javacorespring.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "violations")
@Data
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String car, violator, officer, date, amount, datepaid, datetopay;
    private Boolean issubpoena, ispaid;

    public Fine(long id, String car, String violator, String officer, String date, String amount, String datepaid, String datetopay, Boolean issubpoena, Boolean ispaid) {
        this.id = id;
        this.car = car;
        this.violator = violator;
        this.officer = officer;
        this.date = date;
        this.amount = amount;
        this.datepaid = datepaid;
        this.datetopay = datetopay;
        this.issubpoena = issubpoena;
        this.ispaid = ispaid;
    }

    public Fine() {

    }

    public long getId() {
        return id;
    }

    public String getCar() {
        return car;
    }

    public String getViolator() {
        return violator;
    }

    public String getOfficer() {
        return officer;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public String getDatepaid() {
        return datepaid;
    }

    public String getDatetopay() {
        return datetopay;
    }

    public Boolean getSubpoena() {
        return issubpoena;
    }

    public Boolean getPaid() {
        return ispaid;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setViolator(String violator) {
        this.violator = violator;
    }

    public void setOfficer(String officer) {
        this.officer = officer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDatepaid(String datePaid) {
        this.datepaid = datePaid;
    }

    public void setDatetopay(String dateToPay) {
        this.datetopay = dateToPay;
    }

    public void setSubpoena(Boolean isSubpoena) {
        this.issubpoena = isSubpoena;
    }

    public void setPaid(Boolean isPaid) {
        this.ispaid = isPaid;
    }
}
