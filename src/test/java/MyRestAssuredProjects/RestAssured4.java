package MyRestAssuredProjects;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class RestAssured4 {
    @Test
    public void test_put() {


        JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).

                when().
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200);
        //body("", hasItems("Raghav"));
    }

    @Test
    public void test_patch() {


        JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).

                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200);
        //body("", hasItems("Raghav"));
    }

    @Test
    public void test_delete() {

        given().
                when().
                delete("https://reqres.in/api/users/2").
                then().
                statusCode(204);
        //body("", hasItems("Raghav"));
    }
}
