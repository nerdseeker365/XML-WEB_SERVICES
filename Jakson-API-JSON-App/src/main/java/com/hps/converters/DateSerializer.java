package com.hps.converters;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * 
 * @author Ashok
 * This class is used to Format the Date while writing json file
 *
 */
public class DateSerializer extends JsonSerializer<Date> {

	@Override
	public void serialize(Date dt, JsonGenerator jsonGen, SerializerProvider sp)
			throws IOException, JsonProcessingException {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = sdf.format(dt);
		jsonGen.writeString(formattedDate);

	}

}
