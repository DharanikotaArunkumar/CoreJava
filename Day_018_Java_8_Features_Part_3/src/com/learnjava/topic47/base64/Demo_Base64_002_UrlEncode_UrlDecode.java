/*
 * URL Encoding and Decoding
 */
package com.learnjava.topic47.base64;

import java.util.Base64;

public class Demo_Base64_002_UrlEncode_UrlDecode {

	public static void main(String[] args) {

		String java8DocUrl = "https://docs.oracle.com/javase/8/docs/";

		Base64.Encoder encoder = Base64.getUrlEncoder();

		String encodedJava8DocUrl = encoder.encodeToString(java8DocUrl.getBytes()); 

		System.out.println("Encoded java8 DocUrl : " + encodedJava8DocUrl);

		Base64.Decoder decoder = Base64.getUrlDecoder();

		String decodedjava8DocUrl = new String(decoder.decode(encodedJava8DocUrl));

		System.out.println("Decoded java8 DocUrl : " + decodedjava8DocUrl);

	}

}
