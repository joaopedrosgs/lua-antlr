package t1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {

        ArrayList<String> Arquivos = new ArrayList<String>(List.of("exemplos/lua1.txt", "exemplos/lua2.txt", "exemplos/lua3.txt", "exemplos/lua4.txt", "exemplos/lua5.txt", "exemplos/lua6.txt"));

        for (String arquivo : Arquivos) {
            System.out.println("\n\nPara " + arquivo + ":");
            SaidaParser out = new SaidaParser();
            CharStream cs = CharStreams.fromStream(TestaAnalisadorSintatico.class.getResourceAsStream(arquivo));
            LuaLexer lexer = new LuaLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LuaParser parser = new LuaParser(tokens);
            parser.addErrorListener(new T1ErrorListener(out));
            parser.eval();
            if (!out.isModificado()) {
                out.println("Fim da analise. Sem erros sintaticos.");
                out.println("Tabela de simbolos:");

                TabelaDeSimbolos.imprimirTabela(out);
                System.out.print(out);

            } else {
                out.println("Fim da analise. Com erros sintaticos.");
            }

        }
    }
}
