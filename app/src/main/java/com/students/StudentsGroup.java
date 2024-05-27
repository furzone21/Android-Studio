package com.students;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    private String number;
    private String facultyName;
    private int educationLevel;
    private boolean contractExistsFlg;
    private boolean privilegeExistsFlg;

    public StudentsGroup (String number, String facultyName,
                          int educationLevel, boolean contractExistsFlg, boolean privilegeExistsFlg) {
        this.number = number;
        this.facultyName = facultyName;
        this.educationLevel = educationLevel;
        this.contractExistsFlg = contractExistsFlg;
        this.privilegeExistsFlg = privilegeExistsFlg;
    }

    public String getNumber () {
        return number;
    }

    public String getFacultyName () {
        return facultyName;
    }

    public int getEducationLevel() {
        return educationLevel;
    }

    public boolean isContractExistsFlg() {
        return contractExistsFlg;
    }

    public boolean isPrivilegeExistsFlg() {
        return privilegeExistsFlg;
    }

    private static ArrayList<StudentsGroup> groups = new ArrayList<StudentsGroup>(
            Arrays.asList(
                    new StudentsGroup("301", "Комп'ютерних наук",
                            0, true, false),
                    new StudentsGroup("302", "Комп'ютерних наук",
                            0, true, false),
                    new StudentsGroup("303", "Комп'ютерних наук",
                            0, true, false),
                    new StudentsGroup("304", "Комп'ютерних наук",
                            1, false, true)
            )
    );

    public static StudentsGroup getGroup (String groupNumber) {
        for (StudentsGroup g: groups) {
            if (g.getNumber().equals(groupNumber)) {
                return g;
            }
        }
        return null;
    }

    public static ArrayList<StudentsGroup> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return number;
    }

    public static void addGroup (StudentsGroup group) { groups.add(group); }
}
