package resource;

import java.util.Objects;

import javax.ws.rs.ext.ParamConverter;

import org.apache.commons.lang3.math.NumberUtils;

public class NumberParamConverter implements ParamConverter<Number>
{
	@Override
	public Number fromString(String value)
	{
		return NumberUtils.createNumber(value);
	}

	@Override
	public String toString(Number value)
	{
		return Objects.toString(value);
	}
}
