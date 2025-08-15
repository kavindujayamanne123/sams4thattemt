package com.ijse.samsproject.sams.Entity;

public class LectureEntity {
    private String LectureID;
    private String firstName;
    private String lastName;
    private String email;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private String city;
    private String course;
    private String contact;
    private String password;

    public LectureEntity(String lectureID, String firstName, String lastName, String email, String addressLine1, String addressLine2, String addressLine3, String city, String course, String contact, String password) {
        LectureID = lectureID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        AddressLine1 = addressLine1;
        AddressLine2 = addressLine2;
        AddressLine3 = addressLine3;
        this.city = city;
        this.course = course;
        this.contact = contact;
        this.password = password;
    }

    public LectureEntity(){}

    public String getLectureID() {
        return LectureID;
    }

    public void setLectureID(String lectureID) {
        LectureID = lectureID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return AddressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        AddressLine3 = addressLine3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LectureEntity{" +
                "LectureID='" + LectureID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", AddressLine1='" + AddressLine1 + '\'' +
                ", AddressLine2='" + AddressLine2 + '\'' +
                ", AddressLine3='" + AddressLine3 + '\'' +
                ", city='" + city + '\'' +
                ", course='" + course + '\'' +
                ", contact='" + contact + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
