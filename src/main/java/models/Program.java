package models;

import java.util.List;

@Entity
@
public class Program {

    @Id
    private String programID;
    private String title;
    private String program_description;
    private String faculty;
    private List<CreditConfiguration> credit_requirements;
    private String program_level;
    private List<CourseSummary> prerequisites;
    private List<CourseSection> course_sections;

    public String getProgramID() { return programID; }
    public void setProgramID(String programID) { this.programID = programID; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getProgram_description() { return program_description; }
    public void setProgram_description(String program_description) { this.program_description = program_description; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public List<CreditConfiguration> getCredit_requirements() { return credit_requirements; }
    public void setCredit_requirements(List<CreditConfiguration> credit_requirements) { this.credit_requirements = credit_requirements; }

    public String getProgram_level() { return program_level; }
    public void setProgram_level(String program_level) { this.program_level = program_level; }

    public List<CourseSummary> getPrerequisites() { return prerequisites; }
    public void setPrerequisites(List<CourseSummary> prerequisites) { this.prerequisites = prerequisites; }

    public List<CourseSection> getCourse_sections() { return course_sections; }
    public void setCourse_sections(List<CourseSection> course_sections) { this.course_sections = course_sections; }

    public static class CreditConfiguration {
        private Integer credits;
        private List<CourseSummary> exemptions;

        public Integer getCredits() { return credits; }
        public void setCredits(Integer credits) { this.credits = credits; }

        public List<CourseSummary> getExemptions() { return exemptions; }
        public void setExemptions(List<CourseSummary> exemptions) { this.exemptions = exemptions; }
    }

    public static class CourseSection {
        private String category;
        private List<CourseSummary> course_list;
        private CourseRange course_range;
        private List<List<Object>> subcategory_restriction;
        private Boolean ranged_credits;
        private Integer min_credits;
        private Integer max_credits;

        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }

        public List<CourseSummary> getCourse_list() { return course_list; }
        public void setCourse_list(List<CourseSummary> course_list) { this.course_list = course_list; }

        public CourseRange getCourse_range() { return course_range; }
        public void setCourse_range(CourseRange course_range) { this.course_range = course_range; }

        public List<List<Object>> getSubcategory_restriction() { return subcategory_restriction; }
        public void setSubcategory_restriction(List<List<Object>> subcategory_restriction) { this.subcategory_restriction = subcategory_restriction; }

        public Boolean getRanged_credits() { return ranged_credits; }
        public void setRanged_credits(Boolean ranged_credits) { this.ranged_credits = ranged_credits; }

        public Integer getMin_credits() { return min_credits; }
        public void setMin_credits(Integer min_credits) { this.min_credits = min_credits; }

        public Integer getMax_credits() { return max_credits; }
        public void setMax_credits(Integer max_credits) { this.max_credits = max_credits; }
    }

    public static class CourseRange {
        private String rule;
        private List<String> codes;
        private List<Integer> levels;

        public String getRule() { return rule; }
        public void setRule(String rule) { this.rule = rule; }

        public List<String> getCodes() { return codes; }
        public void setCodes(List<String> codes) { this.codes = codes; }

        public List<Integer> getLevels() { return levels; }
        public void setLevels(List<Integer> levels) { this.levels = levels; }
    }
}
