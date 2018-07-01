package net.my.be.view;

import lombok.Data;
import net.my.be.model.User;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Data
@Named
@ViewScoped
public class UserView {
	private List<User> users;

	private List<User> filteredCustomers;

	private User selectedUser;

	@PostConstruct
	public void setup()  {
		List<User> users = new ArrayList<>();

		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Doe");
		user1.setId(123456);

		users.add(user1);

		User user2 = new User();
		user2.setFirstName("Adam");
		user2.setLastName("Scott");
		user2.setId(98765);

		users.add(user2);

		User user3 = new User();
		user3.setFirstName("Jane");
		user3.setLastName("Doe");
		user3.setId(65432);

		users.add(user3);
		this.users = users;
	}

	public String showGreeting(User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
	}
}
