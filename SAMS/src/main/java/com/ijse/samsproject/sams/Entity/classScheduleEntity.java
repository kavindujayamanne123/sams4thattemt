package com.ijse.samsproject.sams.Entity;

public class classScheduleEntity {
    private String time;
    private String date;
    private String course;
    private String lecture;

    public classScheduleEntity(String course, String time, String date, String lecture) {
        this.course = course;
        this.time = time;
        this.date = date;
        this.lecture = lecture;
    }

    public classScheduleEntity(){}

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "classScheduleEntity{" +
                "time='" + time + '\'' +
                ", date='" + date + '\'' +
                ", course='" + course + '\'' +
                ", lecture='" + lecture + '\'' +
                '}';
    }
}
