package files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.InputStream;

public class ReUsableMethods {

    public static JsonPath rawToJson(String response)
    {
        JsonPath js1 =new JsonPath(response);
        return js1;
    }
}
