# banking_account_app
A banking application with basic functionalities and the ability to read a .CSV file to create new accounts

<ul>
<li>Read a .csv file of names, social security numbers, account type, and initial deposit</li>
<li>Use Object Oriented Programming to create a system to hold all these accounts</li>
</ul>

### BankAccountApp.java
<ul>
<li>Main function</li>
<li>Create data structure to hold all accounts and print our thier information 
</ul>

<p align="center"><img src="https://user-images.githubusercontent.com/14893642/68986817-0c199900-07e9-11ea-9d1b-5b54bb4f87b4.JPG" width="1000"></p>

### Account.java
<ul>
<li>Parent class of checking and savings class </li>
<li>Has methods: deposit(), withdraw(), transfer(), and showInfo() </li>
<li>11 digit account number (generated with the following process: 1 for savings & 2 for checkings, last two digits of SSN, 
      unique 5-digit number, and random 3 digit number</li>
</ul>

### Savings.java
<ul>
<li>Child class of the account class </li>
<li>Savings account holders are given a Safety Deposit Box, identified by a 3-digit code and accessed with a 4-digit key</li>
</ul>

### Checking.java
<ul>
<li>Child class of the account class </li>
<li>Checking account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN</li>
</ul>

### IBaseRate.java
<ul>
<li>Both checking and savings account will use an interface that determines the basic interest rate</li>
<li>Saving accounts will use 0.25 points less than the base rate</li>
<li>Checking accounts will use 15% of the base rate</li>
</ul>

### CSV.java
<ul>
<li>In the utilities package</li>
<li>Implement function to read account information from .csv file</li>
</ul>


