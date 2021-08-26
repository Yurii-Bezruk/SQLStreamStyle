package com.striker.sqlstream.tableproxies;

public class Table {
    private final String _TABLE_NAME_;

    public Table(String name) {
        this._TABLE_NAME_ = name;
    }

    public String getTableName() {
        return _TABLE_NAME_;
    }

    private abstract  class AbstractColumn {
        protected String _COLUMN_NAME_;

        public AbstractColumn(String name) {
            _COLUMN_NAME_ = name;
        }

        public String getColumnName() {
            return _TABLE_NAME_ + "." +  _COLUMN_NAME_;
        }
    }
    public interface SelectableColumn {
        String getColumnName();
    }
    public interface OrderableColumn {
        String getColumnName();
    }

    public class Column extends AbstractColumn implements SelectableColumn, OrderableColumn {
        public Column(String name) {
            super(name);
        }

        public RenamedColumn AS(String newName){
           return new RenamedColumn(_COLUMN_NAME_ + " AS " + newName);
        }
        public SortedColumn ASC(){
            return new SortedColumn(_COLUMN_NAME_ + " ASC");
        }
        public SortedColumn DESC(){
            return new SortedColumn(_COLUMN_NAME_ + " DESC");
        }
    }
    public class RenamedColumn extends AbstractColumn implements SelectableColumn {
        public RenamedColumn(String name) {
            super(name);
        }
    }
    public class SortedColumn extends AbstractColumn implements OrderableColumn {
        public SortedColumn(String name) {
            super(name);
        }
    }

}
