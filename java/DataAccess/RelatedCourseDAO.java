package DataAccess;

import TableObjects.InteractiveTestObject;
import TableObjects.RelatedCourseObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by graphics on 5/1/2017.
 */
public class RelatedCourseDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public RelatedCourseDAO(){

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
    public List<RelatedCourseObject> GetAll(String course_id){
        String sql = "SELECT * FROM RELATED_COURSES WHERE COURSE_ID = ? ";
        List<RelatedCourseObject> relatedCourseObjectList = jdbcTemplate.query(sql,new Object[]{course_id},new BeanPropertyRowMapper<RelatedCourseObject>(RelatedCourseObject.class));
        return relatedCourseObjectList;
    }
}
