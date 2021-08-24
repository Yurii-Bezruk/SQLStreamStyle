package com.striker.tableproxies;

public class Table {
    private final String _TABLE_NAME_;

    public Table(String name) {
        this._TABLE_NAME_ = name;
    }

    public String getTableName() {
        return _TABLE_NAME_;
    }

    public class Column {
        private final String _COLUMN_NAME_;

        public Column(String name) {
            _COLUMN_NAME_ = _TABLE_NAME_ + "." + name;
        }

        public String getColumnName() {
            return _COLUMN_NAME_;
        }

        public SortedColumn ASC(){
            return new SortedColumn(_COLUMN_NAME_ + " ASC");
        }
        public SortedColumn DESC(){
            return new SortedColumn(_COLUMN_NAME_ + " DESC");
        }
    }
    public static class SortedColumn {
        private final String _COLUMN_NAME_;

        public SortedColumn(String name) {
            _COLUMN_NAME_ = name;
        }

        public String getColumnName() {
            return _COLUMN_NAME_;
        }
    }
}