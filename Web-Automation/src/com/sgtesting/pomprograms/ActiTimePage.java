package com.sgtesting.pomprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
public ActiTimePage(WebDriver oBrowser)
{
	PageFactory.initElements(oBrowser, this);
}
//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
//ClickLogin Button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	//User button Field
		@FindBy(xpath="//div[text()='USERS']")
		private WebElement Users;
		public WebElement getUser()
		{
			return Users;
		}

		//AddUser button Field
		@FindBy(xpath="//div[text()='Add User']")
		private WebElement AddUser;
		public WebElement getAdduser()
		{
			return AddUser;
		}
		//Firstname text field
		private WebElement firstName;
		public WebElement getFirstname()
		{
			return firstName;
		}
		
		//Lastname text Field
		private WebElement lastName;
		public WebElement getLastname()
		{
			return lastName;
		}
		
		//Email text Field
		private WebElement email;
		public WebElement getEmail()
		{
			return email;
		}
		
		//Username text Field
		private WebElement userDataLightBox_usernameField;
		public WebElement getUsername()
		{
			return userDataLightBox_usernameField;
		}
		
		//CreatePassword Text Field
		private WebElement userDataLightBox_passwordField;
		public WebElement getcreatePassword()
		{
			return userDataLightBox_passwordField;
		}
		
		//RetypePassword Text Field
		private WebElement userDataLightBox_passwordCopyField;
		public WebElement getretypePassword()
		{
			return userDataLightBox_passwordCopyField;
		}
		
		//CreateUser button Field
		@FindBy(xpath="//span[text()='Create User']")
		private WebElement CreateUser;
		public WebElement getCreateUser()
		{
			return CreateUser;
		}
		//ClickDemoUser Button field
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement DeleteUser;
		public WebElement getDemoUserButton()
		{
			return DeleteUser;
		}
		
		//deleteUser button Field
		@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
		private WebElement deleteUsers;
		public WebElement getdeleteUser()
		{
			return  deleteUsers;
		} 
		//UserDemo1 button Field
		@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement userDemo1;
		public WebElement getuserDemo1()
		{
			return  userDemo1;
		}
		//SaveChanges button Field
		@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
		private WebElement savechanges;
		public WebElement getSaveChangesButton()
		{
			return savechanges;
		}
		//CreateCustomer button Field
		@FindBy(xpath="//span[text()='Create Customer']")
		private WebElement createCustomer;
		public WebElement getCreateCustomer()
		{
			return createCustomer;
		}
		//ClickTasks
		@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
		private WebElement ClickTask;
		public WebElement getTaskList()
		{
			return ClickTask;
		}
		//Click Add new 
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
		private WebElement Addnew;
		public WebElement getAddnew()
		{
			return Addnew;
		}
		//Add new customer
		@FindBy(xpath="/html/body/div[12]/div[1]")
		private WebElement NewCustomer;
		public WebElement getNewCustomer()
		{
			return NewCustomer;
		}
		//Enter Customer Name
		@FindBy(xpath="//*[@id=\"customerLightBox_nameField\"]")
		private WebElement EnterCustomername;
		public WebElement getCustomername()
		{
			return EnterCustomername;
		}
		//DCSetting button Field
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
		private WebElement dccustomer;
		public WebElement getDCSetting()
		{
			return dccustomer;
		}

		//ActionDemoC button Field
		@FindBy(xpath="//div[text()='ACTIONS']")
		private WebElement actiondcustomersetting;
		public WebElement getAction()
		{
			return actiondcustomersetting;
		}
		//ModifyCustomerclick button field
		@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")
		private WebElement modifyCclick;
		public WebElement getmodifyCustomerclick()
		{
			return modifyCclick;
		}
		
		//ModifyCustomerInput button field
		@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")
		private WebElement modifyCInput;
		public WebElement getmodifyCustomerInput()
		{
			return modifyCInput;
		}
		
		//DeleteCustomer button Field
		@FindBy(xpath="//div[text()='Delete']")
		private WebElement deleteCustomer;
		public WebElement getdeleteCustomer()
		{
			return deleteCustomer;
		}
		
		//deletePermanentlyCustomer button Field
		private WebElement customerPanel_deleteConfirm_submitTitle;
		public WebElement getdeteletpermanentlyCustomer()
		{
			return customerPanel_deleteConfirm_submitTitle;
		}
		//CreatePoject button Field
		@FindBy(xpath="/html/body/div[12]/div[2]")
		private WebElement AddProject;
		public WebElement getAddProject()
		{
			return AddProject;
		}
		//EnterProjectName
		@FindBy(xpath="//*[@id=\"projectPopup_projectNameField\"]")
		private WebElement ProjectName;
		public WebElement getProjectName()
		{
			return ProjectName;
		}
		//CreateProject
		@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]/div/span")
		private WebElement CreateProject;
		public WebElement getCreateProjectButton()
		{
			return CreateProject;
		}
		//ModifyProjectclick button field
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
		private WebElement modifyProjectclick;
		public WebElement getmodifyProjectclick()
		{
			return modifyProjectclick;
		}
		
		//ModifyProjectInput button field
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
		private WebElement modifyPInput;
		public WebElement getmodifyProjectInput()
		{
			return modifyPInput;
		}
		
		//EditProject button Field
		@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement projectEdit;
		public WebElement getProjectEditButton()
		{
			return projectEdit;
		}
		//ProjectAction Button Field
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
		private WebElement ProjectAction;
		public  WebElement getProjectactionButton()
		{
			return ProjectAction;
		}
		//DeleteProject Button Field
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
		private WebElement ProjectDelete;
		public WebElement getProjectDeleteButton()
		{
			return ProjectDelete;
		}
		//DeleteprojectPermanently Button Field
		@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitTitle\"]")
		private WebElement ProjectDeletepermnt;
		public WebElement getProjectDeletePermntButton()
		{
			return ProjectDeletepermnt;
		}
		
		//Add task Button Field
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
		private WebElement Addtask;
		public WebElement getAddTaskButton()
		{
			return Addtask;
		}
		//Create new task Button Field
		@FindBy(xpath="/html/body/div[11]/div[1]")
		private WebElement NewTask;
		public WebElement getCreateNewTaskbutton()
		{
			return NewTask;
		}
		//Input task name
		@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
		private WebElement TaskName;
		public WebElement getInputTaskName()
		{
			return TaskName;
		}
		//CreateTask Button Field
		@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div/span")
		private WebElement CreateTask;
		public WebElement getCreateTaskButton()
		{
			return CreateTask;
		}
		//TaskCheckbox button field
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")
		private WebElement taskCheckbox;
		public WebElement getTaskCheckbox()
		{
			return taskCheckbox;
		}
		
		//DeleteTask button field
		@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]")
		private WebElement deleteTask;
		public WebElement getDeleteTask()
		{
			return deleteTask;
		}
			
		//DeleteTaskPermentaly button field
		private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
		public WebElement getdeleteTaskPermentaly()
		{
			return deleteTaskPopup_deleteConfirm_submitTitle;
		}
		
		//ExploreActiTime button Field
		@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
		private WebElement exploreActiTime;
		public WebElement getexploreActiTime()
		{
			return  exploreActiTime;
		}
		//UserDemo1 button Field
		@FindBy(xpath="//span[text()='user1, Demo']")
		private WebElement UserDemo1;
		public WebElement getUserDemo1()
		{
			return  userDemo1;
		}
		
		//UserDemo2 button Field
		@FindBy(xpath="//span[text()='user2, Demo']")
		private WebElement userDemo2;
		public WebElement getuserDemo2()
		{
			return  userDemo2;
		}
		
		//UserDemo3 button Field
		@FindBy(xpath="//span[text()='user3, Demo']")
		private WebElement userDemo3;
		public WebElement getuserDemo3()
		{
			return  userDemo3;
		}
		//ModifySaveChanges button Field
		@FindBy(xpath="//span[text()='Save Changes']")
		private WebElement modifysaveChanges;
		public WebElement getmodifysaveChanges()
		{
			return  modifysaveChanges;
		}

		//deleteUser button Field
		@FindBy(xpath="//*[@id='userDataLightBox_deleteBtn']")
		private WebElement deleteusers;
		public WebElement getdeleteuser()
		{
			return  deleteUsers;
		}
	//Logout Link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}

	}