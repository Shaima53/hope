package com.example.a96653.LetsCode;
public final class SchemClass {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private
    private SchemClass() {}

    /* Inner class that defines the table contents */
    public static class LetsCode2 {
        public static final String TABLE_NAME = "Child";
        public static final String COLUMN_NAME_ChildName = "Name";
        public static final String COLUMN_NAME_ID = "ID";
        public static final String COLUMN_NAME_Score = "Score";


        public static final String SECOND_TABLE="LEVEL";
        public static final String COLUMN_NAME_LevelName="LevelName";
        public static final String COLUMN_NAME_LessonsPassed="NumOfLessonsPassed";
        public static final String COLUMN_NAME_LEVELSTATUS="LevelStatus";
    }
}