# Regex Registration Form

This JavaFX application is a fully functional **registration form** that collects and validates user input using **regex-based field validation** and transitions to a new scene upon successful submission.

---

## Features

- Real-time validation of:
  - ✅ First Name (2–25 letters)
  - ✅ Last Name (2–25 letters)
  - ✅ Email (`@farmingdale.edu` only)
  - ✅ Date of Birth (`MM/DD/YYYY` format, auto-formatted)
  - ✅ Zip Code (5 digits)
- Glowing, modern UI with custom CSS
- Submit via **Enter key** or button click
- Transitions to a success screen when valid
- Built with `JavaFX`, `FXML`, and clean MVC structure

---

## How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/yourusername/CSC311_RegistrationForm.git
   cd CSC311_RegistrationForm
   ```

2. Open the project in **IntelliJ IDEA**

3. Make sure JavaFX SDK is configured:
   - Add the SDK (JavaFX 17+) to your libraries
   - Add this to VM options if needed:
     ```
     --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
     ```

4. Run `RegistrationApplication.java`

---

## File Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/csc311_mod_6_assignment/
│   │       ├── RegistrationController.java
│   │       └── RegistrationApplication.java
│   └── resources/
│       └── com/example/csc311_mod_6_assignment/
│           ├── registration-view.fxml
│           ├── success-view.fxml
│           ├── css/
│           │   └── styles.css
│           └── img/
│               └── Registration.png
```

---

## Author

**Justin Derenthal**  
Farmingdale State College  
CSC 311 – Advanced Programming

