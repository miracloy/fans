package com.r1123.fans.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by helloqdz on 2018/11/1.
 */

@Entity
@Table(name = "core_users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String phone;

    private String gender;

    private Date createdAt = new Date();

    private String weChat;

    private BigDecimal accountMoney = new BigDecimal(0);

    private String inviteCode;

    private BigDecimal receiveMoney = new BigDecimal(0);

    @OneToOne(targetEntity = UserEntity.class)
    private UserEntity invitedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public BigDecimal getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(BigDecimal accountMoney) {
        this.accountMoney = accountMoney;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public BigDecimal getReceiveMoney() {
        return receiveMoney;
    }

    public void setReceiveMoney(BigDecimal receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    public UserEntity getInvitedBy() {
        return invitedBy;
    }

    public void setInvitedBy(UserEntity invitedBy) {
        this.invitedBy = invitedBy;
    }
}
