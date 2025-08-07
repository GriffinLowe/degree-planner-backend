package models;

import java.util.List;

public class Plan {

    private List<SubProgram> targetProgram;
    private List<Semester> semPlan;

    // Getters and Setters
    public List<SubProgram> getTargetProgram() {
        return targetProgram;
    }

    public void setTargetProgram(List<SubProgram> targetProgram) {
        this.targetProgram = targetProgram;
    }

    public List<Semester> getSemPlan() {
        return semPlan;
    }

    public void setSemPlan(List<Semester> semPlan) {
        this.semPlan = semPlan;
    }

    public static class SubProgram {

        private String programID;
        private String title;

        public String getProgramID() {
            return programID;
        }

        public void setProgramID(String programID) {
            this.programID = programID;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class Semester {

        private String semID;
        private String name;
        private String preSemID;
        private String nextSemID;
        private List<CourseSummary> courses;
        private String season;
        private long year;

        // Getters and Setters
        public String getSemID() {
            return semID;
        }

        public void setSemID(String semID) {
            this.semID = semID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPreSemID() {
            return preSemID;
        }

        public void setPreSemID(String preSemID) {
            this.preSemID = preSemID;
        }

        public String getNextSemID() {
            return nextSemID;
        }

        public void setNextSemID(String nextSemID) {
            this.nextSemID = nextSemID;
        }

        public List<CourseSummary> getCourses() {
            return courses;
        }

        public void setCourses(List<CourseSummary> courses) {
            this.courses = courses;
        }
    }
}


