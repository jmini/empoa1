package fr.jmini.empoa.gson.intermal.serializers.info;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.info.License;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class LicenseSerializer implements JsonSerializer<License> {

    @Override
    public JsonElement serialize(License src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        return object;
    }

}
