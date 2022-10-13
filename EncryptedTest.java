package com.strings.demo.pll;

import com.strings.demo.bll.Encrypted001;

public class EncryptedTest {

	public static void main(String[] args) {

		//created object that represents a text encrypted 
		Encrypted001 e = new Encrypted001("333divyanshu#001", 5);
		
		System.out.println("\nENCODE : "+e.getEncryptedText());//encrypted data
		System.out.println("\nDECODE :"+e.getDecryptedText(5));//decrypted data
		
	
	}

}
