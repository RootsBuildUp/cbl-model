package com.service.cblmodel.redis.model;//package com.RootBuildUp.oauth2jwtspringboot.redis.model;
//
//import com.fasterxml.jackson.databind.JsonDeserializer;
//import org.codehaus.jackson.JsonNode;
//import org.codehaus.jackson.map.DeserializationContext;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.map.type.MapType;
//import org.codehaus.jackson.node.ObjectNode;
//import com.fasterxml.jackson.core.JsonParser;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
//import org.springframework.security.oauth2.provider.OAuth2Request;
//
//import java.io.IOException;
//import java.util.Map;
//
//class MessageSubscriptionJsonDeserializer extends JsonDeserializer<OAuth2Authentication> {
//
//
//    @Override
//    public OAuth2Authentication deserialize(JsonParser jsonParser, com.fasterxml.jackson.databind.DeserializationContext deserializationContext) throws IOException, com.fasterxml.jackson.core.JsonProcessingException {
//        final String value = jsonParser.getValueAsString();
////        final Map<String, String> map = deserializeAsMap(value,jsonParser.getCodec().readTree(), deserializationContext);
//        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
//        OAuth2Request OAuth2Request = (OAuth2Request) (node.get("storedRequest"));
//        String itemName = node.get("itemName").asText();
//        return new OAuth2Authentication(map.get("Message"), map.get("SubscriptionUID"));
//    }
//
//    private Map<String, String> deserializeAsMap(String value, ObjectMapper mapper, DeserializationContext ctxt) throws IOException {
//        final MapType mapType = ctxt.getTypeFactory().constructMapType(Map.class, String.class, String.class);
//        return mapper.readValue(value, mapType);
//    }
//    }
//
//}
