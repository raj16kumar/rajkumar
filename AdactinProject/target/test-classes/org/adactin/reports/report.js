$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sadhana/eclipse-workspace/AdactinProject/Features/adactin1.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin HotelBooking",
  "description": "",
  "id": "adactin-hotelbooking",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "User should login the application",
  "description": "",
  "id": "adactin-hotelbooking;user-should-login-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TC-101"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user opens the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User enter the username in username field",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User enter the Password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user click login button to login the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactin1StepDefinition.user_opens_the_chrome_browser()"
});
formatter.result({
  "duration": 3790100000,
  "status": "passed"
});
formatter.match({
  "location": "Adactin1StepDefinition.user_enter_the_username_in_username_field()"
});
formatter.result({
  "duration": 1390917900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin1StepDefinition.user_enter_the_Password_in_password_field()"
});
formatter.result({
  "duration": 212932900,
  "status": "passed"
});
formatter.match({
  "location": "Adactin1StepDefinition.user_click_login_button_to_login_the_application()"
});
formatter.result({
  "duration": 2647042900,
  "status": "passed"
});
});