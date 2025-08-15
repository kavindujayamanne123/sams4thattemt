package com.ijse.samsproject.sams.Entity;

public class CourseEntity {
    private String courseID;
    private String name;
    private String description;
    private String lecture;
    private String duration;
    private String courseFee;
    private String courseStream;
    private String minQlfic;

    public CourseEntity(String courseID, String name, String description, String lecture, String duration, String courseFee, String courseStream, String minQlfic) {
        this.courseID = courseID;
        this.name = name;
        this.description = description;
        this.lecture = lecture;
        this.duration = duration;
        this.courseFee = courseFee;
        this.courseStream = courseStream;
        this.minQlfic = minQlfic;
    }

    public CourseEntity(){}

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }

    public String getCourseStream() {
        return courseStream;
    }

    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
    }

    public String getMinQlfic() {
        return minQlfic;
    }

    public void setMinQlfic(String minQlfic) {
        this.minQlfic = minQlfic;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "courseID='" + courseID + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", lecture='" + lecture + '\'' +
                ", duration='" + duration + '\'' +
                ", courseFee='" + courseFee + '\'' +
                ", courseStream='" + courseStream + '\'' +
                ", minQlfic='" + minQlfic + '\'' +
                '}';
    }
}
