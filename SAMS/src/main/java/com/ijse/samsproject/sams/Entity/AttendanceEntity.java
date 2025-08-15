package com.ijse.samsproject.sams.Entity;

public class AttendanceEntity {
    private String date;
    private String course;
    private String student;
    private String attendance;

    public AttendanceEntity(String date, String course, String student, String attendance) {
        this.date = date;
        this.course = course;
        this.student = student;
        this.attendance = attendance;
    }

    public AttendanceEntity(){}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "AttendanceEntity{" +
                "date='" + date + '\'' +
                ", course='" + course + '\'' +
                ", student='" + student + '\'' +
                ", attendance='" + attendance + '\'' +
                '}';
    }
}
