/**
 * 
 */
package czfshine.json.tojson.test;

import java.lang.reflect.Modifier;

import czfshine.json.tojson.BadObject;
import czfshine.json.tojson.Encoder;
import czfshine.json.tojson.JsonLoop;
import junit.framework.*;

/**
 * @author czfshine
 *
 */
public class EncoderTest extends TestCase {

	/**
	 * Test method for {@link czfshine.json.tojson.Encoder#Encoder()}.
	 */
	
	public final void testEncoder() {
		 Encoder en=new Encoder();
		 
		try {
			assertEquals("\"123\"", en.tojson("123"));
		} catch (JsonLoop e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadObject e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link czfshine.json.tojson.Encoder#Encoder(czfshine.json.tojson.Writer)}.
	 */
	
	public final void testEncoderWriter() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link czfshine.json.tojson.Encoder#trackPath(java.lang.Object)}.
	 */
	
	public final void testTrackPath() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link czfshine.json.tojson.Encoder#tojson(java.lang.Object)}.
	 */
	
	public final void testTojson() {
		//fail("Not yet implemented"); // TODO
	}

}
