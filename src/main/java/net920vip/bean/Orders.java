package net920vip.bean;

import java.util.Date;
import java.util.List;

public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;

    // 因为是一对一关系，所以在此处加入user属性
    private UserBean userBean;

    // 因为是一对多关系，所以咋此处加入List<Orderdetail>,作为order的属性
//    private List<Orderdetail> orderdetails;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", userBean=" + userBean +
                '}';
    }
}
