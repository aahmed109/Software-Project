package DataAccess;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;

/**
 * Created by graphics on 4/29/2017.
 */
public class CourseDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    //All CRUD Operations here
}
