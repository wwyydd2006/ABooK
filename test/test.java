import com.sixteen.DAO.IUserDAO;
import com.sixteen.DAO.impl.UserDAOImpl;
import com.sixteen.entity.User;

public class test {
	public static void main(String[] args) {
		User user = new User();
		user.setUname("admin");
		IUserDAO userDAO = new UserDAOImpl();
		user = userDAO.get(user);
		System.out.println(user.getUpasswd()+"!!");
	}
}
