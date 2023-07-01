package com.vesoft.nebula.util;



public class NebulaConstant {
    public static final String USE = "USE ";
    public static final String SEMICOLON = "; ";
    public static final String ERROR_CODE = "-1";
    public enum NebulaJson{
        ERRORS("errors"),
        CODE("code"),
        MESSAGE("message"),
        RESULTS("results"),
        COLUMNS("columns"),
        DATA("data"),
        ROW("row");

        NebulaJson(String key) {
            this.key = key;
        }

        private String key;

        public String getKey() {
            return key;
        }
    }
}
