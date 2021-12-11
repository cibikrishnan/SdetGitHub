package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

    @Given("^user enters the credentials$")
    public void user_enters_the_credentials(DataTable userCredentials) {
        List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);

        for (int i = 0; i < data.size(); i++) {
            int j = i + 1;
            System.out.println("Username in the row: " + j + " : " + data.get(i).get("username"));
            System.out.println("password in the row: " + j + " : " + data.get(i).get("password"));

        }

    }

    @Given("^I enter valid data on the page$")
    public void enterData(DataTable table) {
        List<Map<String, String>> fieldValue = table.asMaps(String.class, String.class);

        for (int i = 0; i < fieldValue.size(); i++) {

            System.out.println("field " +  fieldValue.get(i).get("Fields") + " has the value " + fieldValue.get(i).get("Values"));


        }

    }

}
