import com.sixteen.DAO.IUserDAO;
import com.sixteen.DAO.impl.UserDAOImpl;
import com.sixteen.entity.User;


public class test {
	public static void main(String[] args) {
		User user = new User();
		user.setUname("admin");
		user.setUpasswd("admin");
		user.setUpower(10);
		IUserDAO userDAO = new UserDAOImpl();
		userDAO.save(user);
		System.out.println(user.getUname());
		
		
	}
}
