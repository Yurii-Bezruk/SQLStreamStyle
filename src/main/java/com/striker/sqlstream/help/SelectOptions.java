package com.striker.sqlstream.help;


public class SelectOptions {
    private static final String distinct = "DISTINCT";
    private static final String distinctrow = "DISTINCTROW";
    private static final String all = "ALL";
    private static final String high_priority = "HIGH_PRIORITY";
    private static final String straight_join = "STRAIGHT_JOIN";
    private static final String sql_big_result = "SQL_BIG_RESULT";
    private static final String sql_small_result = "SQL_SMALL_RESULT";
    private static final String sql_buffer_result = "SQL_BUFFER_RESULT";

    public static DistinctOption DISTINCT = new DistinctOption(distinct);
    public static DistinctOption DISTINCTROW = new DistinctOption(distinctrow);
    public static DistinctOption ALL = new DistinctOption(all);
    public static HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
    public static StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
    public static SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
    public static SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
    public static SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();


    public abstract static class SelectOption {
        protected String name;
        private SelectOption(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
    public static class DistinctOption extends SelectOption {
        public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
        public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
        public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
        public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
        public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();

        public class HighPriorityOption extends SelectOption {
            public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
            public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
            public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
            public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
            public class StraightJoinOption extends SelectOption {
                public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
                public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                public class SqlBigResultOption extends SelectOption {
                    public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                    public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                    public class SqlSmallResultOption extends SelectOption {
                        public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                        public class SqlBufferResultOption extends SelectOption {
                            public SqlBufferResultOption() {
                                super(sql_buffer_result);
                            }
                            @Override
                            public String getName() {
                                return SqlSmallResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlSmallResultOption() {
                            super(sql_small_result);
                        }
                        @Override
                        public String getName() {
                            return SqlBigResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public class SqlBufferResultOption extends SelectOption {
                        public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                        public class SqlSmallResultOption extends SelectOption {
                            public SqlSmallResultOption() {
                                super(sql_small_result);
                            }
                            @Override
                            public String getName() {
                                return SqlBufferResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlBufferResultOption() {
                            super(sql_buffer_result);
                        }
                        @Override
                        public String getName() {
                            return SqlBigResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public SqlBigResultOption() {
                        super(sql_big_result);
                    }
                    @Override
                    public String getName() {
                        return StraightJoinOption.this.getName() + " " + super.getName();
                    }
                }
                public class SqlSmallResultOption extends SelectOption {
                    public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
                    public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                    public class SqlBigResultOption extends SelectOption {
                        public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                        public class SqlBufferResultOption extends SelectOption {
                            public SqlBufferResultOption() {
                                super(sql_buffer_result);
                            }
                            @Override
                            public String getName() {
                                return SqlBigResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlBigResultOption() {
                            super(sql_big_result);
                        }
                        @Override
                        public String getName() {
                            return SqlSmallResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public class SqlBufferResultOption extends SelectOption {
                        public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
                        public class SqlBigResultOption extends SelectOption {
                            public SqlBigResultOption() {
                                super(sql_big_result);
                            }
                            @Override
                            public String getName() {
                                return SqlBufferResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlBufferResultOption() {
                            super(sql_buffer_result);
                        }
                        @Override
                        public String getName() {
                            return SqlSmallResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public SqlSmallResultOption() {
                        super(sql_small_result);
                    }
                    @Override
                    public String getName() {
                        return StraightJoinOption.this.getName() + " " + super.getName();
                    }
                }
                public class SqlBufferResultOption extends SelectOption {
                    public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
                    public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                    public class SqlBigResultOption extends SelectOption {
                        public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                        public class SqlSmallResultOption extends SelectOption {
                            public SqlSmallResultOption() {
                                super(sql_small_result);
                            }
                            @Override
                            public String getName() {
                                return SqlBigResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlBigResultOption() {
                            super(sql_big_result);
                        }
                        @Override
                        public String getName() {
                            return SqlBufferResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public class SqlSmallResultOption extends SelectOption {
                        public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
                        public class SqlBigResultOption extends SelectOption {
                            public SqlBigResultOption() {
                                super(sql_big_result);
                            }
                            @Override
                            public String getName() {
                                return SqlSmallResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlSmallResultOption() {
                            super(sql_small_result);
                        }
                        @Override
                        public String getName() {
                            return SqlBufferResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public SqlBufferResultOption() {
                        super(sql_buffer_result);
                    }
                    @Override
                    public String getName() {
                        return StraightJoinOption.this.getName() + " " + super.getName();
                    }
                }
                public StraightJoinOption() {
                    super(straight_join);
                }
                @Override
                public String getName() {
                    return HighPriorityOption.this.getName() + " " + super.getName();
                }
            }
            public class SqlBigResultOption extends SelectOption {
                public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
                public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                public class StraightJoinOption extends SelectOption {
                    public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                    public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                    public class SqlSmallResultOption extends SelectOption {
                        public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                        public class SqlBufferResultOption extends SelectOption {
                            public SqlBufferResultOption() {
                                super(sql_buffer_result);
                            }
                            @Override
                            public String getName() {
                                return SqlSmallResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlSmallResultOption() {
                            super(sql_small_result);
                        }
                        @Override
                        public String getName() {
                            return StraightJoinOption.this.getName() + " " + super.getName();
                        }
                    }
                    public class SqlBufferResultOption extends SelectOption {
                        public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
                        public class SqlSmallResultOption extends SelectOption {
                            public SqlSmallResultOption() {
                                super(sql_small_result);
                            }
                            @Override
                            public String getName() {
                                return SqlBufferResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlBufferResultOption() {
                            super(sql_buffer_result);
                        }
                        @Override
                        public String getName() {
                            return StraightJoinOption.this.getName() + " " + super.getName();
                        }
                    }
                    public StraightJoinOption() {
                        super(straight_join);
                    }
                    @Override
                    public String getName() {
                        return SqlBigResultOption.this.getName() + " " + super.getName();
                    }
                }
                public class SqlSmallResultOption extends SelectOption {
                    public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
                    public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                    public class StraightJoinOption extends SelectOption {
                        public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
                        public class SqlBufferResultOption extends SelectOption {
                            public SqlBufferResultOption() {
                                super(sql_buffer_result);
                            }
                            @Override
                            public String getName() {
                                return StraightJoinOption.this.getName() + " " + super.getName();
                            }
                        }
                        public StraightJoinOption() {
                            super(straight_join);
                        }
                        @Override
                        public String getName() {
                            return SqlSmallResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public class SqlBufferResultOption extends SelectOption {
                        public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
                        public class StraightJoinOption extends SelectOption {
                            public StraightJoinOption() {
                                super(straight_join);
                            }
                            @Override
                            public String getName() {
                                return SqlBufferResultOption.this.getName() + " " + super.getName();
                            }
                        }
                        public SqlBufferResultOption() {
                            super(sql_buffer_result);
                        }
                        @Override
                        public String getName() {
                            return SqlSmallResultOption.this.getName() + " " + super.getName();
                        }
                    }
                    public SqlSmallResultOption() {
                        super(sql_small_result);
                    }
                    @Override
                    public String getName() {
                        return SqlBigResultOption.this.getName() + " " + super.getName();
                    }
                }
                public class SqlBufferResultOption extends SelectOption {
                    public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
                    public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();

                    public SqlBufferResultOption() {
                        super(sql_buffer_result);
                    }
                    @Override
                    public String getName() {
                        return SqlBigResultOption.this.getName() + " " + super.getName();
                    }
                }
                public SqlBigResultOption() {
                    super(sql_big_result);
                }
                @Override
                public String getName() {
                    return HighPriorityOption.this.getName() + " " + super.getName();
                }
            }














            public class SqlSmallResultOption extends SelectOption {
                public SqlSmallResultOption() {
                    super(sql_small_result);
                }
                @Override
                public String getName() {
                    return HighPriorityOption.this.getName() + " " + super.getName();
                }
            }
            public class SqlBufferResultOption extends SelectOption {
                public SqlBufferResultOption() {
                    super(sql_buffer_result);
                }
                @Override
                public String getName() {
                    return HighPriorityOption.this.getName() + " " + super.getName();
                }
            }
            public HighPriorityOption() {
                super(high_priority);
            }
            @Override
            public String getName() {
                return DistinctOption.this.getName() + " " + super.getName();
            }
        }







        public class StraightJoinOption extends SelectOption {
            public StraightJoinOption() {
                super(straight_join);
            }
            @Override
            public String getName() {
                return DistinctOption.this.getName() + " " + super.getName();
            }
        }
        public class SqlBigResultOption extends SelectOption {
            public SqlBigResultOption() {
                super(sql_big_result);
            }
            @Override
            public String getName() {
                return DistinctOption.this.getName() + " " + super.getName();
            }
        }
        public class SqlSmallResultOption extends SelectOption {
            public SqlSmallResultOption() {
                super(sql_small_result);
            }
            @Override
            public String getName() {
                return DistinctOption.this.getName() + " " + super.getName();
            }
        }
        public class SqlBufferResultOption extends SelectOption {
            public SqlBufferResultOption() {
                super(sql_buffer_result);
            }
            @Override
            public String getName() {
                return DistinctOption.this.getName() + " " + super.getName();
            }
        }

        public DistinctOption(String name) {
            super(name);
        }
    }
    public static class HighPriorityOption extends SelectOption {
//        public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
//        public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
//        public DistinctOption ALL = new DistinctOption("ALL");
        public HighPriorityOption() {
            super(high_priority);
        }
//
//        public class DistinctOption extends SelectOption {
//            public DistinctOption(String name) {
//                super(name);
//            }
//            @Override
//            public String getName() {
//                return HighPriorityOption.this.getName() + " " + super.getName();
//            }
//        }
    }
    public static class StraightJoinOption extends SelectOption {
//        public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
//        public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
//        public DistinctOption ALL = new DistinctOption("ALL");

        public StraightJoinOption() {
            super(straight_join);
        }
//        public class DistinctOption extends SelectOption {
//            public DistinctOption(String name) {
//                super(name);
//            }
//            @Override
//            public String getName() {
//                return StraightJoinOption.this.getName() + " " + super.getName();
//            }
//        }
//        public class HighPriorityOption extends SelectOption {
//            public HighPriorityOption(String name) {
//                super(name);
//            }
//            @Override
//            public String getName() {
//                return StraightJoinOption.this.getName() + " " + super.getName();
//            }
//        }
    }

    public static class SqlBigResultOption extends SelectOption {
        public SqlBigResultOption() {
            super(sql_big_result);
        }
    }
    public static class SqlSmallResultOption extends SelectOption {
        public SqlSmallResultOption() {
            super(sql_small_result);
        }
    }
    public static class SqlBufferResultOption extends SelectOption {
        public SqlBufferResultOption() {
            super(sql_buffer_result);
        }
    }
}
