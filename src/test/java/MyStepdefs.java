

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyStepdefs {

        @Given("^user enters the credentials$")
        public void user_enters_the_credentials(DataTable userCredentials) {

            List<String> data = userCredentials.row(0);
            Map<String, String> credentials = new HashMap<>();
            credentials.put("username", data.get(0));
            credentials.put("password", data.get(1));

            System.out.println("Username is: " + credentials.get("username"));
            System.out.println("Password is: " + credentials.get("password"));


        }

}
