package com.user.stake.models;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "t_stakeholder")
public class T_stakeholder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    private String b_document_type;
    private String b_document_number;
    private String v_first_name;
    private String v_second_name;
    private String v_first_surname;
    private String v_second_surname;
    private String v_full_name;
    private Date d_date_birth;
    private String v_city;
    private short i_sex;
    private short i_enabled;
    @ManyToOne
    @JoinColumn(name = "t_user", referencedColumnName="s_id", nullable=false)
    private T_user i_creation_user;
    private Date t_creation_date;

    public T_stakeholder() {
    }

    public T_stakeholder(int s_id, String b_document_type, String b_document_number, String v_first_name, String v_second_name, String v_fisrt_surname, String v_second_surname, String v_full_name, Date d_date_birth, String v_city, short i_sex, short i_enabled, T_user i_creation_user, Date t_creation_date) {
        this.s_id = s_id;
        this.b_document_type = b_document_type;
        this.b_document_number = b_document_number;
        this.v_first_name = v_first_name;
        this.v_second_name = v_second_name;
        this.v_first_surname = v_fisrt_surname;
        this.v_second_surname = v_second_surname;
        this.v_full_name = v_full_name;
        this.d_date_birth = d_date_birth;
        this.v_city = v_city;
        this.i_sex = i_sex;
        this.i_enabled = i_enabled;
        this.i_creation_user = i_creation_user;
        this.t_creation_date = t_creation_date;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getB_document_type() {
        return b_document_type;
    }

    public void setB_document_type(String b_document_type) {
        this.b_document_type = b_document_type;
    }

    public String getB_document_number() {
        return b_document_number;
    }

    public void setB_document_number(String b_document_number) {
        this.b_document_number = b_document_number;
    }

    public String getV_first_name() {
        return v_first_name;
    }

    public void setV_first_name(String v_first_name) {
        this.v_first_name = v_first_name;
    }

    public String getV_second_name() {
        return v_second_name;
    }

    public void setV_second_name(String v_second_name) {
        this.v_second_name = v_second_name;
    }

    public String getV_fisrt_surname() {
        return v_first_surname;
    }

    public void setV_fisrt_surname(String v_fisrt_surname) {
        this.v_first_surname = v_fisrt_surname;
    }

    public String getV_second_surname() {
        return v_second_surname;
    }

    public void setV_second_surname(String v_second_surname) {
        this.v_second_surname = v_second_surname;
    }

    public String getV_full_name() {
        return v_full_name;
    }

    public void setV_full_name(String v_full_name) {
        this.v_full_name = v_full_name;
    }

    public Date getD_date_birth() {
        return d_date_birth;
    }

    public void setD_date_birth(Date d_date_birth) {
        this.d_date_birth = d_date_birth;
    }

    public String getV_city() {
        return v_city;
    }

    public void setV_city(String v_city) {
        this.v_city = v_city;
    }

    public short getI_sex() {
        return i_sex;
    }

    public void setI_sex(short i_sex) {
        this.i_sex = i_sex;
    }

    public short getI_enabled() {
        return i_enabled;
    }

    public void setI_enabled(short i_enabled) {
        this.i_enabled = i_enabled;
    }

    public T_user getI_creation_user() {
        return i_creation_user;
    }

    public void setI_creation_user(T_user i_creation_user) {
        this.i_creation_user = i_creation_user;
    }

    public Date getT_creation_date() {
        return t_creation_date;
    }

    public void setT_creation_date(Date t_creation_date) {
        this.t_creation_date = t_creation_date;
    }

    @Override
    public String toString() {
        return "T_stakeholder{" +
                "s_id=" + s_id +
                ", b_document_type='" + b_document_type + '\'' +
                ", b_document_number='" + b_document_number + '\'' +
                ", v_first_name='" + v_first_name + '\'' +
                ", v_second_name='" + v_second_name + '\'' +
                ", v_fisrt_surname='" + v_first_surname + '\'' +
                ", v_second_surname='" + v_second_surname + '\'' +
                ", v_full_name='" + v_full_name + '\'' +
                ", d_date_birth=" + d_date_birth +
                ", v_city='" + v_city + '\'' +
                ", i_sex=" + i_sex +
                ", i_enabled=" + i_enabled +
                ", i_creation_user=" + i_creation_user +
                ", t_creation_date=" + t_creation_date +
                '}';
    }
}
