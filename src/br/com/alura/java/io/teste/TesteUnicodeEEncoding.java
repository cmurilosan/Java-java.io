package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {    //para nos assegurarmos de que o charset existe

        String s = "ç";
        System.out.println(s.codePointAt(0));   //descobrirmos qual é o codepoint, que é o número associado na tabela de unicodes

        Charset charset = Charset.defaultCharset();   //descobrir qual é o encoding padrão.
        System.out.println(charset.displayName());    // UTF-8

        byte[] bytes = s.getBytes("UTF-8");
        System.out.print(bytes.length + ", UTF-8, ");
        String sNovo = new String(bytes, "UTF-8" );
        System.out.println(sNovo);

        bytes = s.getBytes("UTF-16");
        System.out.print(bytes.length + ", UTF-16, ");
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII, ");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);

        System.out.println("O ASCII continua apresentando erro, pois a ç não está presenta na tabela padrão.");
    }
}
