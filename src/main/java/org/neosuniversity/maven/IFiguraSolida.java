package org.neosuniversity.maven;

public interface IFiguraSolida {

    double getVolumen() throws FiguraException;

    void validaDatos() throws  FiguraException;

    default String getInformacionFigura(Class<?> clazz, int index) {
        try{
            return "Es una figura plana: " + clazz.getName().substring(index);
        }catch (StringIndexOutOfBoundsException e){
            return "**error index incorrecto "+ e.getMessage();
        }
    }
}
