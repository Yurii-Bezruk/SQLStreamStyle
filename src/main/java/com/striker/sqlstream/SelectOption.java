package com.striker.sqlstream;

public class SelectOption {
    public static DistinctOption DISTINCT = new DistinctOption("DISTINCT");
    public static DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
    public static DistinctOption ALL = new DistinctOption("ALL");
    public static StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption("STRAIGHT_JOIN");

    protected String name;
    private SelectOption(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static class DistinctOption extends SelectOption {
        public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption("STRAIGHT_JOIN");
        public DistinctOption(String name) {
            super(name);
        }
        public class StraightJoinOption extends SelectOption {
            public StraightJoinOption(String name) {
                super(name);
            }
            @Override
            public String getName() {
                return DistinctOption.this.getName() + " " + super.getName();
            }
        }
    }
    public static class StraightJoinOption extends SelectOption {
        public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
        public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
        public DistinctOption ALL = new DistinctOption("ALL");
        public StraightJoinOption(String name) {
            super(name);
        }
        public class DistinctOption extends SelectOption {
            public DistinctOption(String name) {
                super(name);
            }
            @Override
            public String getName() {
                return StraightJoinOption.this.getName() + " " + super.getName();
            }
        }
    }
}
