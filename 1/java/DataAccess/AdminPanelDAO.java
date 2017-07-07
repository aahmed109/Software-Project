package DataAccess;

import TableObjects.AdminPanelObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

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
    public AdminPanelObject LoginValidate(int user_id , String password){
        AdminPanelObject adminPanelObject = null;
        String sql = "SELECT * FROM ADMIN_PANEL WHERE ADMIN_ID = ? AND ADMIN_PASS = ? ";
        String sql2 = "SELECT ADMIRAL_STATUS FROM ADMIN_PANEL WHERE ADMIN_ID = ? AND ADMIN_PASS = ? ";
        String sql3 = "SELECT ADMIN_NAME FROM ADMIN_PANEL WHERE ADMIN_ID = ? AND ADMIN_PASS = ? ";
        String sql4 = "SELECT JOIN_DATE FROM ADMIN_PANEL WHERE ADMIN_ID = ? AND ADMIN_PASS = ? ";
        try {
            adminPanelObject = jdbcTemplate.queryForObject(sql,new Object[]{user_id,password},new BeanPropertyRowMapper<AdminPanelObject>(AdminPanelObject.class));
            Object[] in = new Object[] {user_id, password};
            String sts = getJdbcTemplate().queryForObject(sql2, in, String.class);
            String name = getJdbcTemplate().queryForObject(sql3, in, String.class);
            String date = getJdbcTemplate().queryForObject(sql4, in, String.class);
            adminPanelObject.setStatus(sts);
            adminPanelObject.setAdmin_name(name);
            adminPanelObject.setJoin_date(date);
            //System.out.println(sts);

            //System.out.println(sql2);
        }catch (Exception e){
            System.out.println("Found NULL");
            e.printStackTrace();
            //return p;
        }
        return adminPanelObject;
    }
}
