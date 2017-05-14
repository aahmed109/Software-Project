package DataAccess;

import TableObjects.AdminPanelObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.activation.DataSource;

/**
 * Created by graphics on 5/6/2017.
 */
public class AdminPanelDAO {
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
    public AdminPanelObject LoginValidate(String user_name, String password){
        AdminPanelObject adminPanelObject = null;
        String sql = "SELECT * FROM ADMIN_PANEL WHERE ADMIN_NAME = ? AND ADMIN_PASS = ? ";
        try {
            adminPanelObject = jdbcTemplate.queryForObject(sql,new Object[]{user_name,password},new BeanPropertyRowMapper<AdminPanelObject>(AdminPanelObject.class));
        }catch (Exception e){
            System.out.println("Found NULL");
            //return p;
        }
        return adminPanelObject;
    }
}
