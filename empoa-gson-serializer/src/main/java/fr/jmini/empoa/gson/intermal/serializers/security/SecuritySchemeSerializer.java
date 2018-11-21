package fr.jmini.empoa.gson.intermal.serializers.security;
import java.lang.reflect.Type;

import org.eclipse.microprofile.openapi.models.security.SecurityScheme;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class SecuritySchemeSerializer implements JsonSerializer<SecurityScheme> {

    @Override
    public JsonElement serialize(SecurityScheme src, Type typeOfSrc, JsonSerializationContext context) {
        JsonObject object = new JsonObject();
        if(src.getRef() != null) {
            object.addProperty("$ref", src.getRef());
        } else {
            
            if (src.getType() != null) {
                object.add("type", context.serialize(src.getType()));
            }
            if (src.getDescription() != null) {
                object.add("description", context.serialize(src.getDescription()));
            }
            if (src.getName() != null) {
                object.add("name", context.serialize(src.getName()));
            }
            if (src.getIn() != null) {
                object.add("in", context.serialize(src.getIn()));
            }
            if (src.getScheme() != null) {
                object.add("scheme", context.serialize(src.getScheme()));
            }
            if (src.getBearerFormat() != null) {
                object.add("bearerFormat", context.serialize(src.getBearerFormat()));
            }
            if (src.getFlows() != null) {
                object.add("flows", context.serialize(src.getFlows()));
            }
            if (src.getOpenIdConnectUrl() != null) {
                object.add("openIdConnectUrl", context.serialize(src.getOpenIdConnectUrl()));
            }
            if (src.getExtensions() != null) {
                for (java.util.Map.Entry<String, Object> extension : src.getExtensions()
                        .entrySet()) {
                    object.add(extension.getKey(), context.serialize(extension.getValue()));
                }
            }
        }
        return object;
    }

}
