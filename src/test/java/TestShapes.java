import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestShapes {

        private Shape shape;
        private Double area;

        @Given("I am making a Shape")
        public void I_am_creating_a_shape() {
        }

        @When("the size and type are (\\d+) ([^\"]*)")
        public void the_size_is_provided(Double size, String shapeTypeName) {
            ShapeType shapeType = ShapeType.valueOf(shapeTypeName);
            shape = ShapeFactory.getShape(shapeType, size);
            area = shape.area();
        }

        @Then("Result should be (\\d.+)")
        public void I_should_be_told_the_correct_answer_is(Double expectedResult) {
            assertThat(area, is(equalTo(expectedResult)));
        }
}