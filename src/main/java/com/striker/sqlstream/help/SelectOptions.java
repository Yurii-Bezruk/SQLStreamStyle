package com.striker.sqlstream.help;

public class SelectOptions {
    public static HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
    public static StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
    public static SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
    public static SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
    public static SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
    public static DistinctOption DISTINCT = new DistinctOption("DISTINCT");
    public static DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
    public static DistinctOption ALL = new DistinctOption("ALL");


    public abstract static class SelectOption {
        protected String name;
        private SelectOption(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
	public static class HighPriorityOption extends SelectOption {
		public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
		public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
		public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
		public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
		public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
		public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
		public DistinctOption ALL = new DistinctOption("ALL");
		public class StraightJoinOption extends SelectOption {
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class SqlBigResultOption extends SelectOption {
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlSmallResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public StraightJoinOption() {
			    super("STRAIGHT_JOIN");
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
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class StraightJoinOption extends SelectOption {
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlSmallResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
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
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBigResultOption() {
			    super("SQL_BIG_RESULT");
			}
			@Override
			public String getName() {
			    return HighPriorityOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlSmallResultOption extends SelectOption {
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class StraightJoinOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlSmallResultOption() {
			    super("SQL_SMALL_RESULT");
			}
			@Override
			public String getName() {
			    return HighPriorityOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBufferResultOption extends SelectOption {
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class StraightJoinOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBufferResultOption() {
			    super("SQL_BUFFER_RESULT");
			}
			@Override
			public String getName() {
			    return HighPriorityOption.this.getName() + " " + super.getName();
			}
		}
		public class DistinctOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
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
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public DistinctOption(String name) {
			    super(name);
			}
			@Override
			public String getName() {
			    return HighPriorityOption.this.getName() + " " + super.getName();
			}
		}
		public HighPriorityOption() {
		    super("HIGH_PRIORITY");
		}
	}
	public static class StraightJoinOption extends SelectOption {
		public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
		public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
		public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
		public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
		public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
		public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
		public DistinctOption ALL = new DistinctOption("ALL");
		public class HighPriorityOption extends SelectOption {
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class SqlBigResultOption extends SelectOption {
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlSmallResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public HighPriorityOption() {
			    super("HIGH_PRIORITY");
			}
			@Override
			public String getName() {
			    return StraightJoinOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBigResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlSmallResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBigResultOption() {
			    super("SQL_BIG_RESULT");
			}
			@Override
			public String getName() {
			    return StraightJoinOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlSmallResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlSmallResultOption() {
			    super("SQL_SMALL_RESULT");
			}
			@Override
			public String getName() {
			    return StraightJoinOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBufferResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBufferResultOption() {
			    super("SQL_BUFFER_RESULT");
			}
			@Override
			public String getName() {
			    return StraightJoinOption.this.getName() + " " + super.getName();
			}
		}
		public class DistinctOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public class HighPriorityOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public DistinctOption(String name) {
			    super(name);
			}
			@Override
			public String getName() {
			    return StraightJoinOption.this.getName() + " " + super.getName();
			}
		}
		public StraightJoinOption() {
		    super("STRAIGHT_JOIN");
		}
	}
	public static class SqlBigResultOption extends SelectOption {
		public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
		public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
		public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
		public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
		public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
		public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
		public DistinctOption ALL = new DistinctOption("ALL");
		public class HighPriorityOption extends SelectOption {
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class StraightJoinOption extends SelectOption {
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlSmallResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
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
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public HighPriorityOption() {
			    super("HIGH_PRIORITY");
			}
			@Override
			public String getName() {
			    return SqlBigResultOption.this.getName() + " " + super.getName();
			}
		}
		public class StraightJoinOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlSmallResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public StraightJoinOption() {
			    super("STRAIGHT_JOIN");
			}
			@Override
			public String getName() {
			    return SqlBigResultOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlSmallResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlSmallResultOption() {
			    super("SQL_SMALL_RESULT");
			}
			@Override
			public String getName() {
			    return SqlBigResultOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBufferResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBufferResultOption() {
			    super("SQL_BUFFER_RESULT");
			}
			@Override
			public String getName() {
			    return SqlBigResultOption.this.getName() + " " + super.getName();
			}
		}
		public class DistinctOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public class HighPriorityOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
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
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public DistinctOption(String name) {
			    super(name);
			}
			@Override
			public String getName() {
			    return SqlBigResultOption.this.getName() + " " + super.getName();
			}
		}
		public SqlBigResultOption() {
		    super("SQL_BIG_RESULT");
		}
	}
	public static class SqlSmallResultOption extends SelectOption {
		public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
		public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
		public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
		public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
		public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
		public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
		public DistinctOption ALL = new DistinctOption("ALL");
		public class HighPriorityOption extends SelectOption {
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class StraightJoinOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public HighPriorityOption() {
			    super("HIGH_PRIORITY");
			}
			@Override
			public String getName() {
			    return SqlSmallResultOption.this.getName() + " " + super.getName();
			}
		}
		public class StraightJoinOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public StraightJoinOption() {
			    super("STRAIGHT_JOIN");
			}
			@Override
			public String getName() {
			    return SqlSmallResultOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBigResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBufferResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBigResultOption() {
			    super("SQL_BIG_RESULT");
			}
			@Override
			public String getName() {
			    return SqlSmallResultOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBufferResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBufferResultOption() {
			    super("SQL_BUFFER_RESULT");
			}
			@Override
			public String getName() {
			    return SqlSmallResultOption.this.getName() + " " + super.getName();
			}
		}
		public class DistinctOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public DistinctOption(String name) {
			    super(name);
			}
			@Override
			public String getName() {
			    return SqlSmallResultOption.this.getName() + " " + super.getName();
			}
		}
		public SqlSmallResultOption() {
		    super("SQL_SMALL_RESULT");
		}
	}
	public static class SqlBufferResultOption extends SelectOption {
		public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
		public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
		public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
		public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
		public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
		public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
		public DistinctOption ALL = new DistinctOption("ALL");
		public class HighPriorityOption extends SelectOption {
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class StraightJoinOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public HighPriorityOption() {
			    super("HIGH_PRIORITY");
			}
			@Override
			public String getName() {
			    return SqlBufferResultOption.this.getName() + " " + super.getName();
			}
		}
		public class StraightJoinOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class SqlBigResultOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public StraightJoinOption() {
			    super("STRAIGHT_JOIN");
			}
			@Override
			public String getName() {
			    return SqlBufferResultOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBigResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlSmallResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBigResultOption() {
			    super("SQL_BIG_RESULT");
			}
			@Override
			public String getName() {
			    return SqlBufferResultOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlSmallResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
			public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
			public DistinctOption ALL = new DistinctOption("ALL");
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class SqlBigResultOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
				public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
				public DistinctOption ALL = new DistinctOption("ALL");
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class StraightJoinOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
					public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
					public DistinctOption ALL = new DistinctOption("ALL");
					public class HighPriorityOption extends SelectOption {
						public DistinctOption DISTINCT = new DistinctOption("DISTINCT");
						public DistinctOption DISTINCTROW = new DistinctOption("DISTINCTROW");
						public DistinctOption ALL = new DistinctOption("ALL");
						public class DistinctOption extends SelectOption {
							public DistinctOption(String name) {
							    super(name);
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class DistinctOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return DistinctOption.this.getName() + " " + super.getName();
							}
						}
						public DistinctOption(String name) {
						    super(name);
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class DistinctOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return DistinctOption.this.getName() + " " + super.getName();
						}
					}
					public DistinctOption(String name) {
					    super(name);
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class DistinctOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return DistinctOption.this.getName() + " " + super.getName();
					}
				}
				public DistinctOption(String name) {
				    super(name);
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlSmallResultOption() {
			    super("SQL_SMALL_RESULT");
			}
			@Override
			public String getName() {
			    return SqlBufferResultOption.this.getName() + " " + super.getName();
			}
		}
		public class DistinctOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return DistinctOption.this.getName() + " " + super.getName();
				}
			}
			public DistinctOption(String name) {
			    super(name);
			}
			@Override
			public String getName() {
			    return SqlBufferResultOption.this.getName() + " " + super.getName();
			}
		}
		public SqlBufferResultOption() {
		    super("SQL_BUFFER_RESULT");
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
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
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return HighPriorityOption.this.getName() + " " + super.getName();
				}
			}
			public HighPriorityOption() {
			    super("HIGH_PRIORITY");
			}
			@Override
			public String getName() {
			    return DistinctOption.this.getName() + " " + super.getName();
			}
		}
		public class StraightJoinOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public class HighPriorityOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
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
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return StraightJoinOption.this.getName() + " " + super.getName();
				}
			}
			public StraightJoinOption() {
			    super("STRAIGHT_JOIN");
			}
			@Override
			public String getName() {
			    return DistinctOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBigResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public class HighPriorityOption extends SelectOption {
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
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
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
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
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
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlSmallResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBigResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBigResultOption() {
			    super("SQL_BIG_RESULT");
			}
			@Override
			public String getName() {
			    return DistinctOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlSmallResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBufferResultOption SQL_BUFFER_RESULT = new SqlBufferResultOption();
						public class SqlBufferResultOption extends SelectOption {
							public SqlBufferResultOption() {
							    super("SQL_BUFFER_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBufferResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBufferResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBufferResultOption() {
						    super("SQL_BUFFER_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBufferResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBufferResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBufferResultOption() {
					    super("SQL_BUFFER_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBufferResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBufferResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBufferResultOption() {
				    super("SQL_BUFFER_RESULT");
				}
				@Override
				public String getName() {
				    return SqlSmallResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlSmallResultOption() {
			    super("SQL_SMALL_RESULT");
			}
			@Override
			public String getName() {
			    return DistinctOption.this.getName() + " " + super.getName();
			}
		}
		public class SqlBufferResultOption extends SelectOption {
			public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
			public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
			public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
			public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
			public class HighPriorityOption extends SelectOption {
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class StraightJoinOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return HighPriorityOption.this.getName() + " " + super.getName();
					}
				}
				public HighPriorityOption() {
				    super("HIGH_PRIORITY");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class StraightJoinOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class SqlBigResultOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return StraightJoinOption.this.getName() + " " + super.getName();
					}
				}
				public StraightJoinOption() {
				    super("STRAIGHT_JOIN");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlBigResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlSmallResultOption SQL_SMALL_RESULT = new SqlSmallResultOption();
						public class SqlSmallResultOption extends SelectOption {
							public SqlSmallResultOption() {
							    super("SQL_SMALL_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlSmallResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlSmallResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlSmallResultOption() {
						    super("SQL_SMALL_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlSmallResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlSmallResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlSmallResultOption() {
					    super("SQL_SMALL_RESULT");
					}
					@Override
					public String getName() {
					    return SqlBigResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlBigResultOption() {
				    super("SQL_BIG_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public class SqlSmallResultOption extends SelectOption {
				public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
				public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
				public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
				public class HighPriorityOption extends SelectOption {
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class StraightJoinOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return HighPriorityOption.this.getName() + " " + super.getName();
						}
					}
					public HighPriorityOption() {
					    super("HIGH_PRIORITY");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class StraightJoinOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
					public class HighPriorityOption extends SelectOption {
						public SqlBigResultOption SQL_BIG_RESULT = new SqlBigResultOption();
						public class SqlBigResultOption extends SelectOption {
							public SqlBigResultOption() {
							    super("SQL_BIG_RESULT");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public class SqlBigResultOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return SqlBigResultOption.this.getName() + " " + super.getName();
							}
						}
						public SqlBigResultOption() {
						    super("SQL_BIG_RESULT");
						}
						@Override
						public String getName() {
						    return StraightJoinOption.this.getName() + " " + super.getName();
						}
					}
					public StraightJoinOption() {
					    super("STRAIGHT_JOIN");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public class SqlBigResultOption extends SelectOption {
					public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
					public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
					public class HighPriorityOption extends SelectOption {
						public StraightJoinOption STRAIGHT_JOIN = new StraightJoinOption();
						public class StraightJoinOption extends SelectOption {
							public StraightJoinOption() {
							    super("STRAIGHT_JOIN");
							}
							@Override
							public String getName() {
							    return HighPriorityOption.this.getName() + " " + super.getName();
							}
						}
						public HighPriorityOption() {
						    super("HIGH_PRIORITY");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public class StraightJoinOption extends SelectOption {
						public HighPriorityOption HIGH_PRIORITY = new HighPriorityOption();
						public class HighPriorityOption extends SelectOption {
							public HighPriorityOption() {
							    super("HIGH_PRIORITY");
							}
							@Override
							public String getName() {
							    return StraightJoinOption.this.getName() + " " + super.getName();
							}
						}
						public StraightJoinOption() {
						    super("STRAIGHT_JOIN");
						}
						@Override
						public String getName() {
						    return SqlBigResultOption.this.getName() + " " + super.getName();
						}
					}
					public SqlBigResultOption() {
					    super("SQL_BIG_RESULT");
					}
					@Override
					public String getName() {
					    return SqlSmallResultOption.this.getName() + " " + super.getName();
					}
				}
				public SqlSmallResultOption() {
				    super("SQL_SMALL_RESULT");
				}
				@Override
				public String getName() {
				    return SqlBufferResultOption.this.getName() + " " + super.getName();
				}
			}
			public SqlBufferResultOption() {
			    super("SQL_BUFFER_RESULT");
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
}
