public record Moneda(String result, //ej. success
                     String base_code, //ej. CLP
                     String target_code, //ej. USD
                     String conversion_result) { //ej. 1.0032
    public String mensajedeRespuesta(String montoaConvertir,String monedaOrigen,String montoConvertido, String monedaDestino){
        try {
              return "El valor de "+montoaConvertir+" ["+monedaOrigen+"] corresponde al valor final de =>>> " +montoConvertido+" ["+monedaDestino+"]";
        } catch (Exception e) {
            throw new RuntimeException("Error en mensaje de respuesta.");
        }
    }

}
