package com.neeraj8le.leavemanager.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Employee implements Parcelable{

    private String id;
    private String name;
    private String departmentName;
    private String designation;
    private String phoneNumber;
    private String email;
//    private String supervisorName;
    private String token;
    private boolean isHR;

    public Employee() {}

    public Employee(String id, String name, String departmentName, String designation, String phoneNumber, String email, String token, boolean isHR) {
        this.id = id;
        this.name = name;
        this.departmentName = departmentName;
        this.designation = designation;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.token = token;
        this.isHR = isHR;
    }

    protected Employee(Parcel in) {
        id = in.readString();
        name = in.readString();
        departmentName = in.readString();
        designation = in.readString();
        phoneNumber = in.readString();
        email = in.readString();
        token = in.readString();
        isHR = in.readByte() != 0;
    }

    public static final Creator<Employee> CREATOR = new Creator<Employee>() {
        @Override
        public Employee createFromParcel(Parcel in) {
            return new Employee(in);
        }

        @Override
        public Employee[] newArray(int size) {
            return new Employee[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isHR() {
        return isHR;
    }

    public void setHR(boolean HR) {
        isHR = HR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(departmentName);
        dest.writeString(designation);
        dest.writeString(phoneNumber);
        dest.writeString(email);
        dest.writeString(token);
        dest.writeByte((byte) (isHR ? 1 : 0));
    }
}
