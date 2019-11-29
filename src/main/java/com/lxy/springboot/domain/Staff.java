package com.lxy.springboot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Staff {
    @TableId(value = "staff_id", type = IdType.AUTO)
    private int staffId;
    private String staffAccount;
    private String staffName;
    private String staffPassword;
    private String staffPhone;
    private String departNo;
    private String staffDd;
    private String staffNote;
    private Boolean staffChecker;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffAccount() {
        return staffAccount;
    }

    public void setStaffAccount(String staffAccount) {
        this.staffAccount = staffAccount;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getDepartNo() {
        return departNo;
    }

    public void setDepartNo(String departNo) {
        this.departNo = departNo;
    }

    public String getStaffDd() {
        return staffDd;
    }

    public void setStaffDd(String staffDd) {
        this.staffDd = staffDd;
    }

    public String getStaffNote() {
        return staffNote;
    }

    public void setStaffNote(String staffNote) {
        this.staffNote = staffNote;
    }

    public Boolean getStaffChecker() {
        return staffChecker;
    }

    public void setStaffChecker(Boolean staffChecker) {
        this.staffChecker = staffChecker;
    }
}
