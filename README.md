# Bank Management System

I developed this Bank Management System as a Java Swing desktop application connected with a MySQL database. I used this project to manage a simple ATM-style banking workflow where a user can sign up, create an account, log in with a generated card number and PIN, deposit money, withdraw money, use fast cash, change PIN, and check balance.

<img width="959" height="488" alt="Screenshot 2026-06-23 100012" src="https://github.com/user-attachments/assets/e21f86ab-76cf-407d-bf2c-8f61b4c3d965" />


## Features

* I created a login system using card number and PIN.
* I added a three-step signup process for collecting personal, additional, and account details.
* I added validation so users cannot move to the next form without filling the required fields.
* I added account type selection and banking service selection.
* I generated card number and PIN automatically after successful signup.
* I added deposit, withdrawal, fast cash, PIN change, and balance enquiry features.
* I connected the application with a MySQL database using JDBC.
* I updated the user interface so pages open in full screen by default.

## Technologies Used

* Java
* Java Swing
* MySQL / XAMPP MySQL
* JDBC
* VS Code

## Requirements

Before running this project, I need these installed on my computer:

* JDK 21 or higher
* VS Code
* Extension Pack for Java in VS Code
* XAMPP or MySQL Server
* MySQL Connector/J `.jar` file

## How I Run the Project

From the project folder, I can compile and run the project using PowerShell:

```powershell
javac -cp "lib/*" -d out src\bank\management\system\*.java
java -cp "out;lib/*" bank.management.system.login
```

The main class is:

```text
bank.management.system.login
```

## Screenshots


### Login Page

<img width="959" height="488" alt="Screenshot 2026-06-23 100012" src="https://github.com/user-attachments/assets/15c5faa1-71a0-4e49-ba07-70971c9e58ab" />


### Signup Page 1

<img width="959" height="499" alt="Screenshot 2026-06-23 100106" src="https://github.com/user-attachments/assets/0bf40172-0403-487d-bc37-bc15900b7ee5" />


### Signup Page 2

<img width="959" height="473" alt="Screenshot 2026-06-23 100156" src="https://github.com/user-attachments/assets/d71fdfa1-f7a6-463f-b241-dbcf05a3e0d7" />


### Signup Page 3

<img width="958" height="492" alt="Screenshot 2026-06-23 101712" src="https://github.com/user-attachments/assets/aa8a30a6-d3a1-437f-ae75-58ae6d7e2774" />
<img width="789" height="472" alt="Screenshot 2026-06-23 101738" src="https://github.com/user-attachments/assets/921a566c-5628-474d-b6de-0def951d1089" />
<img width="824" height="497" alt="Screenshot 2026-06-23 101752" src="https://github.com/user-attachments/assets/c18a9278-a1a6-43f5-b171-48f62834ca73" />





### Main ATM Menu

<img width="952" height="449" alt="Screenshot 2026-06-23 101839" src="https://github.com/user-attachments/assets/8ae5a668-167b-4e29-921f-cd6a772a756d" />

### Deposit Page

<img width="958" height="481" alt="Screenshot 2026-06-23 101809" src="https://github.com/user-attachments/assets/a85cd109-069f-449f-ac68-ce1a12a2fab9" />

### Withdraw Page

<img width="959" height="443" alt="Screenshot 2026-06-23 102153" src="https://github.com/user-attachments/assets/e3e11e2e-cf3e-482d-881f-f38b26daa686" />

### PIN Change Page
<img width="953" height="455" alt="Screenshot 2026-06-23 102232" src="https://github.com/user-attachments/assets/42ed638c-cb0d-45d3-984c-2104ab8b5365" />

### Fast Cash page
<img width="959" height="464" alt="Screenshot 2026-06-23 102209" src="https://github.com/user-attachments/assets/8305d0aa-aead-4d28-937c-f14bc1c3a312" />

### Balance Enquiry Page

<img width="959" height="470" alt="Screenshot 2026-06-23 102221" src="https://github.com/user-attachments/assets/fc8fcbed-802b-4052-ad89-4aea58f35396" />

## What I Implemented

In this project, I implemented a complete basic banking workflow. First, I created the signup forms so a user can enter personal information, additional information, and account details. Then I added form validation so the user cannot continue without completing the required fields. After successful signup, the system generates a card number and PIN and stores them in the database. I also implemented login, deposit, withdrawal, fast cash, PIN change, and balance enquiry using Java Swing and MySQL.

## Author

Sanzida Moin Tithi
