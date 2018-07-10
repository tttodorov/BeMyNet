package net.be_my.view;

import lombok.Data;
import net.be_my.model.User;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Data
@Named
@ViewScoped
public class ProfileView {
	private List<User> users;

	private List<User> filteredCustomers;

	private User selectedUser;

	@PostConstruct
	public void setup()  {
		List<User> users = new ArrayList<>();

		User user1 = new User();
		user1.setId(123456);
		user1.setEmail("John.Doe@mailinator.com");
		user1.setBirthDay(14);
		user1.setBirthMonth(8);
		user1.setBirthYear(1984);
		user1.setFirstName("John");
		user1.setLastName("Doe");
		user1.setSex(false);

		users.add(user1);

		User user2 = new User();
		user2.setId(98765);
		user2.setEmail("Adam.Scott@mailinator.com");
		user2.setBirthDay(19);
		user2.setBirthMonth(11);
		user2.setBirthYear(1994);
		user2.setFirstName("Adam");
		user2.setLastName("Scott");
		user2.setSex(false);

		users.add(user2);

		User user3 = new User();
		user3.setId(65432);
		user3.setEmail("Jane.Doe@mailinator.com");
		user3.setBirthDay(2);
		user3.setBirthMonth(4);
		user3.setBirthYear(2004);
		user3.setFirstName("Jane");
		user3.setLastName("Doe");
		user3.setSex(true);

		users.add(user3);
		this.users = users;
	}
}
