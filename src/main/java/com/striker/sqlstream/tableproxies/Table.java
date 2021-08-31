package com.striker.sqlstream.tableproxies;

public class Table {
    private String _TABLE_NAME_;

    public Table(String name) {
        this._TABLE_NAME_ = name;
    }

    public String getTableName() {
        return _TABLE_NAME_;
    }

    public void setTableName(String name) {
        this._TABLE_NAME_ = name;
    }
    public interface SelectableColumn {
        String getColumnName();
    }
    public interface OrderableColumn {
        String getColumnName();
    }
    public class Column implements OrderableColumn, SelectableColumn {
        protected String _COLUMN_NAME_;
        public Column(String name) {
            _COLUMN_NAME_ = name;
        }
        public String getColumnName() {
            return _TABLE_NAME_ + "." +  _COLUMN_NAME_;
        }
        public String getClearName() {
            return _COLUMN_NAME_;
        }
        public void setColumnName(String name) {
            this._COLUMN_NAME_ = name;
        }
        public Table getTable(){
            return Table.this;
        }

        public Column bitwiseAnd(Table.Column column){
            return operation("&", column.getColumnName());
        }
        public Column bitwiseAnd(Number number){
            return operation("&", number.toString());
        }
        public Column bitwiseAnd(String column){
            return operation("&", column);
        }
        public Column bitwiseXor(Table.Column column){
            return operation("^", column.getColumnName());
        }
        public Column bitwiseXor(Number number){
            return operation("^", number.toString());
        }
        public Column bitwiseXor(String column){
            return operation("^", column);
        }
        public Column AND(Table.Column column){
            return operation("AND", column.getColumnName());
        }
        public Column AND(Number number){
            return operation("AND", number.toString());
        }
        public Column AND(String column){
            return operation("AND", column);
        }
        public Column greaterThan(Table.Column column){
            return operation(">", column.getColumnName());
        }
        public Column greaterThan(Number number){
            return operation(">", number.toString());
        }
        public Column greaterThan(String column){
            return operation(">", column);
        }
        public Column lessThan(Table.Column column){
            return operation("<", column.getColumnName());
        }
        public Column lessThan(Number number){
            return operation("<", number.toString());
        }
        public Column lessThan(String column){
            return operation("<", column);
        }
        public Column greaterThanOrEqual(Table.Column column){
            return operation(">=", column.getColumnName());
        }
        public Column greaterThanOrEqual(Number number){
            return operation(">=", number.toString());
        }
        public Column greaterThanOrEqual(String column){
            return operation(">=", column);
        }
        public Column lessThanOrEqual(Table.Column column){
            return operation("<=", column.getColumnName());
        }
        public Column lessThanOrEqual(Number number){
            return operation("<=", number.toString());
        }
        public Column lessThanOrEqual(String column){
            return operation("<=", column);
        }
        public Column equalTo(Table.Column column){
            return operation("=", column.getColumnName());
        }
        public Column equalTo(Number number){
            return operation("=", number.toString());
        }
        public Column equalTo(String column){
            return operation("=", column);
        }
        public Column notEqualTo(Table.Column column){
            return operation("<>", column.getColumnName());
        }
        public Column notEqualTo(Number number){
            return operation("<>", number.toString());
        }
        public Column notEqualTo(String column){
            return operation("<>", column);
        }
        public Column nullSafeEqualTo(Table.Column column){
            return operation("<=>", column.getColumnName());
        }
        public Column nullSafeEqualTo(Number number){
            return operation("<=>", number.toString());
        }
        public Column nullSafeEqualTo(String column){
            return operation("<=>", column);
        }
        public Column rightShift(Table.Column column){
            return operation(">>", column.getColumnName());
        }
        public Column rightShift(Number number){
            return operation(">>", number.toString());
        }
        public Column rightShift(String column){
            return operation(">>", column);
        }
        public Column leftShift(Table.Column column){
            return operation("<<", column.getColumnName());
        }
        public Column leftShift(Number number){
            return operation("<<", number.toString());
        }
        public Column leftShift(String column){
            return operation("<<", column);
        }
        public Column MOD(Table.Column column){
            return operation("MOD", column.getColumnName());
        }
        public Column MOD(Number number){
            return operation("MOD", number.toString());
        }
        public Column MOD(String column){
            return operation("MOD", column);
        }
        public Column plus(Table.Column column){
            return operation("+", column.getColumnName());
        }
        public Column plus(Number number){
            return operation("+", number.toString());
        }
        public Column plus(String column){
            return operation("+", column);
        }
        public Column minus(Table.Column column){
            return operation("-", column.getColumnName());
        }
        public Column minus(Number number){
            return operation("-", number.toString());
        }
        public Column minus(String column){
            return operation("-", column);
        }
        public Column multiply(Table.Column column){
            return operation("*", column.getColumnName());
        }
        public Column multiply(Number number){
            return operation("*", number.toString());
        }
        public Column multiply(String column){
            return operation("*", column);
        }
        public Column divide(Table.Column column){
            return operation("/", column.getColumnName());
        }
        public Column divide(Number number){
            return operation("/", number.toString());
        }
        public Column divide(String column){
            return operation("/", column);
        }
        public BetweenColumn BETWEEN(Table.Column column){
            return BETWEEN(column.getColumnName());
        }
        public BetweenColumn BETWEEN(Number number){
            return BETWEEN(number.toString());
        }
        public BetweenColumn BETWEEN(String column){
            return new BetweenColumn(_COLUMN_NAME_ + " BETWEEN " + column);
        }


        public Column operation(String operation, Table.Column operand) {
            return operation(operation, operand.getColumnName());
        }
        public Column operation(String operation, Number operand) {
            return operation(operation, operand.toString());
        }
        public Column operation(String operation, String operand) {
            _COLUMN_NAME_ += " " + operation + " " + operand;
            return this;
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
    public class RenamedColumn implements SelectableColumn {
        protected String _COLUMN_NAME_;

        public RenamedColumn(String name) {
            _COLUMN_NAME_ = name;
        }
        @Override
        public String getColumnName() {
            return _TABLE_NAME_ + "." +  _COLUMN_NAME_;
        }
    }
    public class SortedColumn implements OrderableColumn {
        protected String _COLUMN_NAME_;

        public SortedColumn(String name) {
            _COLUMN_NAME_ = name;
        }

        @Override
        public String getColumnName() {
            return _TABLE_NAME_ + "." +  _COLUMN_NAME_;
        }
    }
    public class BetweenColumn {
        protected String _COLUMN_NAME_;

        public BetweenColumn(String name) {
            _COLUMN_NAME_ = name;
        }

        public Column AND(Column column){
            return AND(column.getColumnName());
        }
        public Column AND(Number number){
            return AND(number.toString());
        }
        public Column AND(String column){
            return new Column(_COLUMN_NAME_ + " AND " + column);
        }
    }

}
