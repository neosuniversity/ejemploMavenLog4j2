package org.neosuniversity.maven;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestFigura {

    final static Logger logger = LogManager.getLogger(TestFigura.class);

    public static void main(String[] args) {

        try {
            Rectangulo figura1 = new Rectangulo("rojo", 8, 5);
            logger.info(figura1);
            logger.info("El Area es: " + figura1.getArea());
            logger.debug("Informacion: " + figura1.getInformacionFigura(Rectangulo.class,25));

        } catch (FiguraException e) {
            logger.error("***"+ e.getMessage()+"***");
        }
        logger.debug("-----------------------------------");


        try {
            Triangulo figura2 = new Triangulo("azul", 4, 5);
            logger.info(figura2);
            logger.info("El Area es:  " + figura2.getArea());
            logger.debug("Informacion: " + figura2.getInformacionFigura(Triangulo.class,25));
        } catch (FiguraException e) {
            logger.error("***"+ e.getMessage()+"***");
        }
        logger.debug("-----------------------------------");


        try {
            Circulo figura3 = new Circulo("naranja", 3);
            logger.info(figura3);
            logger.info("El Area es:  " + figura3.getArea());
            logger.debug("Informacion: " + figura3.getInformacionFigura(Circulo.class,25));
        } catch (FiguraException e) {
            logger.error("***"+ e.getMessage()+"***");
        }
        logger.debug("-----------------------------------");

        try {
            Cuboide figura4 = new Cuboide("rojo", 4, 5,3);
            logger.info(figura4);
            logger.info("El Volumen es:  " + figura4.getVolumen());
            logger.debug("Informacion: " + figura4.getInformacionFigura(Cuboide.class,25));
        } catch (FiguraException e) {
            logger.error("***"+ e.getMessage()+"***");
        }
        System.out.println("-----------------------------------");

        try {
            Cono figura5 = new Cono("naranja", 3, 5);
            logger.info(figura5);

            logger.info("El Volumen es:  " + figura5.getVolumen());
            logger.debug("Informacion: " + figura5.getInformacionFigura(Cono.class,25));
        } catch (FiguraException e) {
            logger.error("***"+ e.getMessage()+"***");
        }
        logger.debug("-----------------------------------");

        try {
            Piramide figura6 = new Piramide(null, 4, 5,5);
            logger.info(figura6);
            logger.info("El Volumen es:  " + figura6.getVolumen());
            logger.debug("Informacion: " + figura6.getInformacionFigura(Piramide.class,25));
        } catch (FiguraException e) {
            logger.error("***"+ e.getMessage()+"***");
        }
        logger.debug("-----------------------------------");

    }
}