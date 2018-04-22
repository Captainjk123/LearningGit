package com.transaction;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void setDataSource(DataSource ds);

    public void create(String name, Integer age, Integer mark, Integer year);


    public List<StudentMarks> listStudents();

}
