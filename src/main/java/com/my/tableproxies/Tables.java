package com.my.tableproxies;

public final class Tables {
    public static final countryTable country = new countryTable();
    public static final departmentTable department = new departmentTable();
    public static final user_with_depTable user_with_dep = new user_with_depTable();

    private Tables(){}

    public static class countryTable extends Table {
        public final Column id = new Column("id");
        public final Column name = new Column("name");

        public countryTable() {
            super("country");
        }
    }
    public static class departmentTable extends Table {
        public final Column id = new Column("id");
        public final Column name = new Column("name");
        public final Column country = new Column("country");

        public departmentTable() {
            super("department");
        }
    }
    public static class user_with_depTable extends Table {
        public final Column id = new Column("id");
        public final Column name = new Column("name");
        public final Column department = new Column("department");

        public user_with_depTable() {
            super("user_with_dep");
        }
    }
}
