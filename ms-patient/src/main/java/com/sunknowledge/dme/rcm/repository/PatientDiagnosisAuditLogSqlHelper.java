package com.sunknowledge.dme.rcm.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Table;

public class PatientDiagnosisAuditLogSqlHelper {

    public static List<Expression> getColumns(Table table, String columnPrefix) {
        List<Expression> columns = new ArrayList<>();
        columns.add(Column.aliased("id", table, columnPrefix + "_id"));
        columns.add(Column.aliased("patint_diagois_id", table, columnPrefix + "_patint_diagois_id"));
        columns.add(Column.aliased("old_row_data", table, columnPrefix + "_old_row_data"));
        columns.add(Column.aliased("new_row_data", table, columnPrefix + "_new_row_data"));
        columns.add(Column.aliased("dml_type", table, columnPrefix + "_dml_type"));
        columns.add(Column.aliased("dml_timestamp", table, columnPrefix + "_dml_timestamp"));
        columns.add(Column.aliased("dml_created_by", table, columnPrefix + "_dml_created_by"));

        return columns;
    }
}
