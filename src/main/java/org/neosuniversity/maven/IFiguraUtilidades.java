package org.neosuniversity.maven;

public interface IFiguraUtilidades {

    static double redondeaValor(double valor){
        return Double.valueOf(String.format("%.3f", valor));
    }
}
