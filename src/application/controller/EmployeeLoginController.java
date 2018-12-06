package application.controller;

import application.model.Employee;

public class EmployeeLoginController extends LoginController {
	
	protected static String viewPath = "view/Employee.fxml";
	protected static String EmpAccFilePath = "Data/EmployeeAccountFiles";
	@Override
	public String getNextViewPath() {
		return viewPath;
	}

	@Override
	public String getAccountStoragePath() {
		return EmpAccFilePath;
	}
	public void newAccount() {
		super.newAccount();
		Employee employee = new Employee(usernameField.getText());
		employee.save(employee.getName());
	}
}
