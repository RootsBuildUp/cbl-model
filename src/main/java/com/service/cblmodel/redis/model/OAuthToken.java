package com.service.cblmodel.redis.model;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class OAuthToken  implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String username;
	private String clientId;
	private String token;
	private String oAuth2AccessToken;
	private String authentication;
	private String refreshToken;
//	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expiredDateAndTime = LocalDateTime.now();

//	public LocalDateTime getExpiredDateAndTime() {
//		return SerializableObjectConverter.asObject(expiredDateAndTime,LocalDateTime.class);
//	}
//
//	public OAuthToken setExpiredDateAndTime(LocalDateTime expiredDateAndTime) {
//		this.expiredDateAndTime = SerializableObjectConverter.asJsonString(expiredDateAndTime);
//		return this;
//	}

}
