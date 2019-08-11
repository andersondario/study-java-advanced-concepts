package topics.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        // \d - todos os dígitos
        // \D - tudo o que não é digito
        // \s - espaços em brancos
        // \S - caractere que não é branco
        // \w - caracteres não especiais a-z, A-Z, dígitos e _
        // \W - caracteres especiais
        // [] - OU
        // ?  - zero ou uma ocorrencia
        // *  - zero ou mais ocorrencia
        // +  - uma ou mais ocorrencias
        // {n, m} - de n ate m
        // () - agrupador
        // | - OU
        // $ - fim de linha
        // ^ - Negação

        final String simpleExpression = "\\D";
        final String simpleText = "asda//_uisd h8aosjd1,=231";
        final Pattern simplePattern = Pattern.compile(simpleExpression);
        Matcher matcher = simplePattern.matcher(simpleText);
        print(matcher);

        final String hexExpression = "0[xX]([0-9a-fA-F])+(\\s|$)";
        final String hexText = "0X1 0x2Fs 00X1321F 0xFFGAAA 0xFAH1";
        final Pattern hexPattern = Pattern.compile(hexExpression);
        matcher = hexPattern.matcher(hexText);
        print(matcher);

        final String emailsText = "arara@gmail.com joao@.com masoq.com keke1@g.com 12a@gmail.com ryca1@gmail.com ";
        final String emailExpresion = "([a-zA-Z])+(\\d)*@gmail.com(.br)?(\\s|$)";
        final Pattern emailPattern = Pattern.compile(emailExpresion);
        matcher = emailPattern.matcher(emailsText);
        print(matcher);
    }

    private static void print(Matcher matcher) {
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
    }
}
