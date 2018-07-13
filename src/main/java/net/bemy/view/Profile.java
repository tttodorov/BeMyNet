package net.bemy.view;

import lombok.Data;
import net.bemy.model.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Data
@Named
@ViewScoped
public class Profile {
	private List<User> users;

	private List<User> filteredCustomers;

	private User selectedUser;

	@PostConstruct
	public void setup()  {
		List<User> users = new ArrayList<>();
	}
}
