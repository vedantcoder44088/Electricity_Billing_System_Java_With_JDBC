

# Electricity Billing System

## Overview

The Electricity Billing System is a Java-based application designed to manage and track electricity consumption and billing for customers. The system provides functionalities for adding new customers, storing monthly electricity consumption units, and viewing detailed billing information. The application uses MySQL as the database backend to store customer data and their monthly electricity consumption.

## Features

- **Customer Management**: Add and manage customer details including customer ID, meter ID, first name, last name, address, and mobile number.
- **Monthly Consumption Tracking**: Record and update monthly electricity consumption for each customer.
- **Billing Details**: View detailed billing information based on the recorded monthly consumption.
- **Database Integration**: Uses MySQL for storing and retrieving customer and billing data.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- JDBC Driver for MySQL

## Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/electricity-billing-system.git
cd electricity-billing-system
```

### 2. Database Setup

Create a new database and table in MySQL:

```sql
CREATE DATABASE IF NOT EXISTS electricity;

USE electricity;

CREATE TABLE IF NOT EXISTS customer (
    customerid BIGINT PRIMARY KEY,
    meterid BIGINT,
    firstname VARCHAR(50),
    lastname VARCHAR(50),
    address VARCHAR(100),
    mobile BIGINT,
    m1 DOUBLE DEFAULT NULL,
    m2 DOUBLE DEFAULT NULL,
    m3 DOUBLE DEFAULT NULL,
    m4 DOUBLE DEFAULT NULL,
    m5 DOUBLE DEFAULT NULL,
    m6 DOUBLE DEFAULT NULL,
    m7 DOUBLE DEFAULT NULL,
    m8 DOUBLE DEFAULT NULL,
    m9 DOUBLE DEFAULT NULL,
    m10 DOUBLE DEFAULT NULL,
    m11 DOUBLE DEFAULT NULL,
    m12 DOUBLE DEFAULT NULL
);
```

### 3. Update Database Connection

Update the `con.java` file with your MySQL database credentials:

```java
package com.electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con {
    static Connection c;
    static Statement s;

    public con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";  // Replace with your MySQL username
            String password = "your_password";  // Replace with your MySQL password
            String url = "jdbc:mysql://localhost:3306/electricity";
            this.c = DriverManager.getConnection(url, user, password);
            this.s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 4. Compile and Run

Compile the Java files and run the application:

```bash
javac -d bin src/com/electricity/billing/system/*.java
java -cp bin com.electricity.billing.system.Main
```

## Usage

- **Add New Customer**: Use the provided GUI or console interface to add a new customer.
- **Record Monthly Consumption**: Enter the current reading and month to record monthly electricity consumption for a customer.
- **View Billing Details**: Retrieve and view the detailed billing information for any customer based on their monthly consumption records.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Contact

For any inquiries or support, please contact [vedantcoder44088@gmail.com](mailto:yourname@domain.com).

