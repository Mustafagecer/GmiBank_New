package gmibank.com.pages;


import gmibank.com.utilities.Driver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;


public class US_016_Page {
    public US_016_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

        @FindBy(xpath = "//li[@id='account-menu']")
        public WebElement userIcon;

        @FindBy(xpath = "//span[contains(text(),'Sign in')]")
        public WebElement signIn;

        @FindBy(id = "username")
        public WebElement username;

        @FindBy(id = "password")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public  WebElement signInButton;

        @FindBy(xpath = "//span[contains(text(),'My Operations')]")
        public WebElement myOperations;

        @FindBy(xpath = "//a[contains(text(),'My Accounts')]")
        public WebElement myAccounts;

        @FindBy(xpath = "//a[contains(text(),'Transfer Money')]")
        public WebElement transferMoney;

        @FindBy(xpath = "//td[contains(text(),'98324')]")
        public WebElement account1;

        @FindBy(xpath = "//td[contains(text(),'98325')]")
        public WebElement account2;

        @FindBy(xpath = "//span[.='Bekir Fakir']")
        public WebElement userHakan;

        @FindBy(xpath = "//span[.='Sign out']")
        public WebElement signOut;

        @FindBy(id = "fromAccountId")
        public WebElement idFromDropdown;

        @FindBy(id = "toAccountId")
        public WebElement idToDropdown;

        @FindBy( xpath = "//input[@name='balance']")
        public WebElement balance;

        @FindBy( id = "description")
        public WebElement description;

        @FindBy( id = "make-transfer")
        public WebElement makeTransfer;

        @FindBy( xpath = "//div[contains(text(),'Transfer is succesfull')]")
        public WebElement successMessage;

        @FindBy( xpath = "(//button[@class='btn btn-success btn-sm'])[1]")
        public WebElement firstViewTransaction;

        @FindBy( xpath = "//*[@id='app-view-container']/div[1]/div/div/div/div[2]/div/table/tbody")
        public WebElement tableTransaction;



}
