package MyRestAssuredProjects;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestAssured3 {
    @Test
    public void test_post() {

        Map<String, Object> jsonMap = new HashMap<String, Object>();

        jsonMap.put("name", "Raghav");
        jsonMap.put("job", "Teacher");

        JSONObject request = new JSONObject(jsonMap);
        System.out.println("JSON request is : "+request);

        //JSONObject request = new JSONObject();

        request.put("name", "Raghav");
        request.put("job", "Teacher");

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type","application/json").
                body(request.toJSONString()).

                when().
                post("https://reqres.in/api/users").
                then().
                statusCode(201);
        //body("", hasItems("Raghav"));
    }
}
