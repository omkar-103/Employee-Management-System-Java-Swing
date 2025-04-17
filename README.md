# 👩‍💼 Employee Management System (Java Swing + Oracle SQL)

A robust **Java-based desktop application** for managing employee data within an organization. Built using **Java Swing** for the GUI and **Oracle SQL** for backend storage, this system includes full CRUD operations, secure admin login, and additional features like date pickers and result set viewing via external libraries.

---

## 🧩 Features

| Feature                  | Description                                                                 |
|--------------------------|-----------------------------------------------------------------------------|
| 🔐 Admin Login          | Secure authentication using Oracle-based credentials                        |
| 📊 Dashboard            | Overview of employee data with navigation to different modules              |
| ➕ Add Employee         | Add new employee with validations and date picker                          |
| 🔍 View Employees      | View all employee records in a `JTable` using `rs2xml.jar`                   |
| ✏️ Update Employee     | Modify details for existing employees                                       |
| ❌ Delete Employee     | Delete employee records by ID                                               |
| 📅 JCalendar Support    | Use `JCalendar` for intuitive date selection                                 |

---

## 💻 Tech Stack

| Technology         | Usage                                  |
|--------------------|------------------------------------------|
| Java Swing         | GUI development                         |
| Oracle SQL         | Backend relational database             |
| NetBeans IDE       | Primary development environment         |
| JDBC               | Java Database Connectivity               |
| JCalendar.jar      | GUI Date Picker                         |
| rs2xml.jar         | Populate JTable from ResultSet          |
| ojdbc8.jar         | Oracle JDBC driver                      |

---

## 🧾 Database Details

### 🔑 Admin Table (Schema: `admin`)

| Column   | Data Type | Description                |
|----------|-----------|----------------------------|
| username | VARCHAR   | Admin username             |
| password | VARCHAR   | Admin password (plain text or hashed) |

### 👨‍💼 Employee Table (Schema: `employee`)

| Column      | Data Type | Description                  |
|-------------|-----------|------------------------------|
| NAME        | VARCHAR   | Employee name                |
| FNAME       | VARCHAR   | Father's name                |
| DOB         | DATE      | Date of Birth                |
| SALARY      | NUMBER    | Monthly salary               |
| ADDRESS     | VARCHAR   | Residential address          |
| PHONE       | VARCHAR   | Contact number               |
| EMAIL       | VARCHAR   | Email address                |
| EDUCATION   | VARCHAR   | Education qualification      |
| DESIGNATION | VARCHAR   | Job title                    |
| AADHAR      | VARCHAR   | Aadhaar number               |
| EMPID       | VARCHAR   | Unique employee ID (Primary Key) |

---

## 📁 Project Structure

```
EmployeeManagementSystem/
├── src/
│   ├── AddEmployee.java
│   ├── ViewEmployee.java
│   ├── UpdateEmployee.java
│   ├── RemoveEmployee.java
│   ├── Login.java
│   ├── Dashboard.java
│   └── Conn.java
├── lib/
│   ├── ojdbc8.jar
│   ├── rs2xml.jar
│   └── JCalendar.jar
├── README.md
└── Database Schema (SQL files)
```

---

## 🛠️ How to Run

1. 🔧 **Install Oracle Database** and create two schemas: `admin` and `employee`.
2. 📥 **Clone this repository** or download the ZIP.
3. 🧩 **Add JARs** to your project:
   - `ojdbc8.jar` for Oracle
   - `rs2xml.jar` for ResultSet to JTable
   - `JCalendar.jar` for date picker
4. 📝 **Update database credentials** in `Conn.java`:
   ```java
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yourUsername", "yourPassword");
   ```
5. ▶️ **Run the `Login.java`** file to start the application.

---

## 🧠 Future Scope

| Idea                            | Description                                             |
|---------------------------------|---------------------------------------------------------|
| 🔐 Password Encryption         | Use SHA-256 or BCrypt for admin credentials            |
| ☁️ Cloud DB Integration        | Connect to cloud-based Oracle DB                        |
| 📈 Analytics Dashboard         | Show employee trends using charts                      |
| 🌐 Web Version                 | Migrate to Spring Boot or Node.js frontend              |
| 🧪 Unit Testing               | Integrate with JUnit for code reliability               |

---

## 📸 Screenshots

> Add screenshots of your GUI here once available:
- Login Page
- Add Employee Form
- View Table in JTable

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

> Crafted with ❤️ in Java + Oracle by Omkar. 🚀

