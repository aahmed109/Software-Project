package DataAccess;

import TableObjects.CourseObject;
import TableObjects.DepartmentObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by graphics on 4/29/2017.
 */
public class CourseDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public CourseDAO(){

    }
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
    public List<CourseObject> GetAll(int dept_id){
        String sql = "SELECT * FROM DEPARTMENT WHERE DEPARTMENT_ID = ?";
        List<CourseObject> courseObjectList = jdbcTemplate.query(sql,new Object[]{dept_id},new BeanPropertyRowMapper<CourseObject>(CourseObject.class));
        return courseObjectList;
    }
}
