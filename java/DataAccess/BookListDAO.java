package DataAccess;

import TableObjects.BookListObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by graphics on 5/1/2017.
 */
public class BookListDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public BookListDAO(){

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
    public List<BookListObject> GetAll(String course_id){
        String sql = "SELECT * FROM BOOKLIST WHERE COURSE_ID = ? ";
        List<BookListObject> bookListObjectList = jdbcTemplate.query(sql,new Object[]{course_id},new BeanPropertyRowMapper<BookListObject>(BookListObject.class));
        return bookListObjectList;
    }
}
