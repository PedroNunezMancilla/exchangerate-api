import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirAPI {
    public Moneda convertirMonedaOrigenMonedaDestino(String apiKEY,String monedaOrigen,String monedaDestino,String direccion,String montoaConvertir){
        //1) Dólar =>> Peso argentino > moneda origen [USD] moneda destino [ARS] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/ARS/1
        URI direccionCompleta = URI.create(direccion+"/"+apiKEY+"/"+"pair/"+monedaOrigen+"/"+monedaDestino+"/"+montoaConvertir);
        System.out.println("direccionCompleta: " +direccionCompleta);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionCompleta)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),  Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa moneda.");
        }
    }

}
