package oct9class;

public class Person extends NameHolder
{
	private String lastName;
	public Person() throws NameException
	{
		String firstNameDefault = "Bo";
		String lastNameDefault = "Smith";
		lastName = lastNameDefault;
		super.setFirstName(firstNameDefault);
	}
	
	public Person(String firstName, String lastName) throws NameException
	{
		this.lastName = lastName;
		super.setFirstName(firstName);
	}
	
	@Override
	public String describeSelf() {
		String description = "*** First Name: " + super.getFirstName() + " Last Name: " + lastName + "***";
		return description;

	}

}
