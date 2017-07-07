package DataAccess;

import TableObjects.BookListObject;
import TableObjects.VideoTutorialObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by graphics on 5/1/2017.
 */
public class VideoTutorialDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public VideoTutorialDAO(){

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
    public List<VideoTutorialObject> GetAll(String course_id){
        String sql = "SELECT * FROM VIDEO_TUTORIAL WHERE COURSE_ID = ? ";
        List<VideoTutorialObject> videoTutorialObjectList = jdbcTemplate.query(sql,new Object[]{course_id},new BeanPropertyRowMapper<VideoTutorialObject>(VideoTutorialObject.class));
        return videoTutorialObjectList;
    }
}
