package com.game.tetris.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.annotation.Native;
import java.util.Date;

/**
 * @author zjb
 * @date 2018/4/18.
 */
@Entity
@Table(name = "tlb_user")
public class UserEntity implements Serializable{

    private static final long serialVersionUID = -459848797892018227L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Integer maxScore;
    private Integer maxScore2;
    private String token;
    private Date gmtCreate;
    private Date gmtUpdate;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public Integer getMaxScore2() {
        return maxScore2;
    }

    public void setMaxScore2(Integer maxScore2) {
        this.maxScore2 = maxScore2;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", maxScore=" + maxScore +
                ", maxScore2=" + maxScore2 +
                ", token='" + token + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtUpdate=" + gmtUpdate +
                '}';
    }
}
