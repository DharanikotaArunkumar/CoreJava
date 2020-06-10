package com.learnjava.topic47.base64;

import java.util.Base64;

public class Demo_Base64_001_Encode_Decode {

	public static void main(String[] args) {
		
		
		String secretKey ="WerXpesde12&a12@M";
		  
        Base64.Encoder encoder = Base64.getEncoder();   // Getting encoder  
       
        byte[] secretKeyByteArr = secretKey.getBytes();  // Creating byte array          
        
        byte[] encodedByteArray = encoder.encode(secretKeyByteArr); // encoding byte array          
        
       String encodedSecretKey = new String(encodedByteArray); // Creating String from byte array
       
       System.out.println("Encoded Secret Key : "+encodedSecretKey);
        
        
      
        
        Base64.Decoder decoder = Base64.getDecoder();    // Getting decoder 
       
        String decoderStr = new String(decoder.decode(encodedSecretKey));     // Decoding string  
        
        System.out.println("Decoded Secret Key : "+decoderStr); 

	}

}
