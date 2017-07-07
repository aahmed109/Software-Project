package DataAccess;

import TableObjects.BookListObject;
import TableObjects.InteractiveTestObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by graphics on 5/1/2017.
 */
public class InteractiveTestDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public InteractiveTestDAO(){

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
    public List<InteractiveTestObject> GetAll(String course_id){
        String sql = "SELECT * FROM INTERACTIVE_TESTS WHERE COURSE_ID = ? ";
        List<InteractiveTestObject> interactiveTestObjectList = jdbcTemplate.query(sql,new Object[]{course_id},new BeanPropertyRowMapper<InteractiveTestObject>(InteractiveTestObject.class));
        return interactiveTestObjectList;
    }
}
