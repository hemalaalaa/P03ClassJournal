package com.example.a16022706.p03_classjournal;

import java.io.Serializable;

public class DailyCA implements Serializable {
    private String dgGrade;
    private String moduleCode;
    private int week;

    public DailyCA(String dgGrade, String moduleCode) {
        this.dgGrade = dgGrade;
        this.moduleCode = moduleCode;
    }

    public DailyCA(int i, String b) {
    }

    public String getDgGrade() {
        return dgGrade;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public int getWeek() {
        return week;
    }
}
