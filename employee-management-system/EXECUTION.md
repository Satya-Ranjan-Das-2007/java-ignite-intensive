#  How to Run the Project

EVERYTIME YOU MAKE CHANGES, PLS MAKE SURE YOU UPDATE MAVEN PROJECT AND CLEAN THE PROJECT AND RE-EXECUTE ! 
---

##  Step 1: Import Project

- Open Eclipse
- Click: File → Import → Existing Maven Project
- Select project folder
- Click Finish

---

## Step 2: Build Project

- Right click project
- Click: Maven → Update Project
- Wait for dependencies to download

---

##  Step 3: Run Application

- Open file:
  EmployeeManagementApplication.java

- Right click → Run As → Spring Boot App

---

##  Step 4: Check Server

If successful, you will see:

Server started on port 9191 or your port whichever you are using

---

## Step 5: Test in Postman

Use base URL:

http://localhost:9191 or the port number whichever you are using

---

### Example APIs:

#### 1. Add Employee
POST /employee/save

#### 2. Get All Employees
GET /employee/all

#### 3. Get Employee by ID
GET /employee/1

#### 4. Update Employee
PUT /employee/update/1

#### 5. Delete Employee
DELETE /employee/delete/1

---

##  Common Issues

- Port already in use - change port in application.properties
- Database not loading - check H2 configuration
- Project not running -  do Maven update

---

##  Final Output

If everything works:
- APIs respond in Postman
- Data stored in H2 database
- No errors in console