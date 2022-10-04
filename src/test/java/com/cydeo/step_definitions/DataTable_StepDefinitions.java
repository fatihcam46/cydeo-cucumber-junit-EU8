package com.cydeo.step_definitions;


import io.cucumber.java.en.*;

import java.util.*;

public class DataTable_StepDefinitions {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }
}
