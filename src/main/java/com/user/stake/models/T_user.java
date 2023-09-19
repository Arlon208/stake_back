package com.user.stake.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "t_user")
public class T_user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;
    private String v_user;
    private String v_name;
    private String v_pass;
    private short i_enabled;
    private String v_email;
    private short i_profile;
    private Date t_creation_date;

    public T_user() {
    }

    public T_user(int s_id, String v_user, String v_name, String v_pass, short i_enabled, String v_email, short i_profile, Date t_creation_date) {
        this.s_id = s_id;
        this.v_user = v_user;
        this.v_name = v_name;
        this.v_pass = v_pass;
        this.i_enabled = i_enabled;
        this.v_email = v_email;
        this.i_profile = i_profile;
        this.t_creation_date = t_creation_date;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getV_user() {
        return v_user;
    }

    public void setV_user(String v_user) {
        this.v_user = v_user;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_pass() {
        return v_pass;
    }

    public void setV_pass(String v_pass) {
        this.v_pass = v_pass;
    }

    public short getI_enabled() {
        return i_enabled;
    }

    public void setI_enabled(short i_enabled) {
        this.i_enabled = i_enabled;
    }

    public String getV_email() {
        return v_email;
    }

    public void setV_email(String v_email) {
        this.v_email = v_email;
    }

    public short getI_profile() {
        return i_profile;
    }

    public void setI_profile(short i_profile) {
        this.i_profile = i_profile;
    }

    public Date getT_creation_date() {
        return t_creation_date;
    }

    public void setT_creation_date(Date t_creation_date) {
        this.t_creation_date = t_creation_date;
    }

    @Override
    public String toString() {
        return "T_user{" +
                "s_id=" + s_id +
                ", v_user='" + v_user + '\'' +
                ", v_name='" + v_name + '\'' +
                ", v_pass='" + v_pass + '\'' +
                ", i_enable=" + i_enabled +
                ", v_email='" + v_email + '\'' +
                ", i_profile=" + i_profile +
                ", t_creation_date=" + t_creation_date +
                '}';
    }
}
