package net.bemy.view;

import net.bemy.model.Customer;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class Profile {
	private List<Customer> customers;

	private List<Customer> filteredCustomers;

	@PostConstruct
	public void setup()  {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer1 = new Customer();
		customer1.setEmail("John.Doe@mailinator.com");
		customer1.setFirstName("John");
		customer1.setLastName("Doe");
		customer1.setCustomerId(123456);
		customer1.setSex(true);

		customers.add(customer1);

		Customer customer2 = new Customer();
		customer2.setEmail("Adam.Scott@mailinator.com");
		customer2.setFirstName("Adam");
		customer2.setLastName("Scott");
		customer2.setCustomerId(98765);
		customer2.setSex(true);

		customers.add(customer2);

		Customer customer3 = new Customer();
		customer3.setEmail("Jane.Doe@mailinator.com");
		customer3.setFirstName("Jane");
		customer3.setLastName("Doe");
		customer3.setCustomerId(65432);
		customer3.setSex(false);

		customers.add(customer3);
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Customer> getFilteredCustomers() {
		return filteredCustomers;
	}

	public void setFilteredCustomers(List<Customer> filteredCustomers) {
		this.filteredCustomers = filteredCustomers;
	}
}
