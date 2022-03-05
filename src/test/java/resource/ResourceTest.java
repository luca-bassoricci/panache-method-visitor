package resource;

import java.math.BigInteger;
import java.util.stream.Stream;

import org.hamcrest.Matchers;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@QuarkusTest
@TestHTTPEndpoint(Resource.class)
class ResourceTest
{
	/**	This test will fail with
	 * <code>
	   ERROR: Request failed<br/>
		java.lang.NullPointerException<br/>
			at org.jboss.resteasy.reactive.common.headers.HeaderUtil.headerToString(HeaderUtil.java:44)<br/>
			at org.jboss.resteasy.reactive.server.core.ServerSerialisers.encodeResponseHeaders(ServerSerialisers.java:493)<br/>
		</code>
	 */
	@ParameterizedTest
	@MethodSource
	final void testTest(Number headerValue)
	{
		RestAssured.given()
			.contentType(ContentType.TEXT)
			.queryParam("value", headerValue)
		.when()
			.get("")
		.then()
			.statusCode(200)
			.body(Matchers.equalTo("ok"))
			.header("numeric-header", Matchers.equalTo(headerValue.toString()));
	}
	private static Stream<Arguments> testTest()
	{
		return Stream.of(
			Arguments.of(Byte.MAX_VALUE),
			Arguments.of(Short.MAX_VALUE),
			Arguments.of(Integer.MAX_VALUE),
			Arguments.of(Long.MAX_VALUE),
			Arguments.of(BigInteger.valueOf(Long.MAX_VALUE))
		);
	}
}
