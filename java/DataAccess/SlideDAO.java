package DataAccess;

import TableObjects.BookListObject;
import TableObjects.SlideObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by graphics on 5/1/2017.
 */
public class SlideDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public SlideDAO(){

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
    public List<SlideObject> GetAll(String course_id){
        String sql = "SELECT * FROM SLIDES_PDF WHERE COURSE_ID = ? ";
        List<SlideObject> slideObjectList = jdbcTemplate.query(sql,new Object[]{course_id},new BeanPropertyRowMapper<SlideObject>(SlideObject.class));
        return slideObjectList;
    }
}
