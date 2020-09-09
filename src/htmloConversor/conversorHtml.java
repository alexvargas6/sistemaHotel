package htmloConversor;

import java.util.StringTokenizer;

/**
 *
 * @author manuel.vargas
 */
public class conversorHtml {

    public String saltosDeLinea(String descripción) {
        String convertido = null;
        String sinSaltos = descripción.replaceAll("\n", "<br> ");
        convertido = "<HTML> " + sinSaltos + " </HTML>";
        return convertido;
    }

}
