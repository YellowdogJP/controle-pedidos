/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.math.BigInteger;
import java.security.MessageDigest;
/**
 *
 * @author joaop
 */
// Fonte do Código: https://pt.stackoverflow.com/questions/116349/classe-messagedigest-e-hash-com-md5-em-java
public class GerarHashMD5 {
    public static String gerarHashMD5(String message) throws java.lang.Exception{
        byte[] hash = MessageDigest.getInstance("MD5").digest(message.getBytes("UTF-8"));
        return new BigInteger(1, hash).toString(16);
    }
}
