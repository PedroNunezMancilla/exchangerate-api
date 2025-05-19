import java.util.Scanner;

public class ConversorMonedaApp {
    public static void main(String[] args) {
        Scanner entradaEscaner = new Scanner(System.in);
        String apiKEY = "80d97146956c01505f48b00b";
        String monedaOrigen;
        String monedaDestino;
        String direccion = "https://v6.exchangerate-api.com/v6";
        String montoaConvertir = "";
        String montoConvertido;
        ConsumirAPI consumirAPI = new ConsumirAPI();
        String opcion;
        //********************* menu *******************************
        do {
            System.out.println("****************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida (escriba el número y presione la tecla ENTER/INTRO):");
            System.out.println("****************************************************");
            opcion = entradaEscaner.nextLine();
            System.out.println("La opción seleccionada es: " + opcion);
            if (!"7".equals(opcion)) {
                try{
                    System.out.print("Ingrese el valor que deseas convertir: ");
                    montoaConvertir = entradaEscaner.nextLine();
                    System.out.println("El monto a convertir es: " + montoaConvertir);
                } catch (NumberFormatException e){
                    System.out.println("Número no encontrado "+e.getMessage());
                } catch (RuntimeException e){ //| IOException e
                    System.out.println(e.getMessage());
                    System.out.println("Finalizando la aplicación.");
                }
                //IF o SWITCH CASE:
                //1) Dólar =>> Peso argentino > moneda origen [USD] moneda destino [ARS] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/ARS/1
                //2) Peso argentino =>> Dólar > moneda origen [ARS] moneda destino [USD] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/ARS/USD/950
                //3) Dólar =>> Real brasileño > moneda origen [USD] moneda destino [BRL] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/BRL/1
                //4) Real brasileño =>> Dólar > moneda origen [BRL] moneda destino [USD] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/BRL/USD/950
                //5) Dólar =>> Peso colombiano > moneda origen [USD] moneda destino [COP] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/COP/1
                //6) Peso colombiano =>> Dólar > moneda origen [COP] moneda destino [USD] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/COP/USD/950
                switch (opcion) {
                    case "1":
                        //1) Dólar =>> Peso argentino > moneda origen [USD] moneda destino [ARS] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/ARS/1
                        monedaOrigen = "USD";
                        monedaDestino = "ARS";
                        try{
                            Moneda moneda = consumirAPI.convertirMonedaOrigenMonedaDestino(apiKEY,monedaOrigen,monedaDestino,direccion,montoaConvertir);
                            System.out.println(moneda);
                            montoConvertido = moneda.conversion_result();
                            System.out.println(moneda.mensajedeRespuesta(montoaConvertir,monedaOrigen,montoConvertido,monedaDestino));
                        } catch (NumberFormatException e){
                            System.out.println("Número no encontrado "+e.getMessage());
                        } catch (RuntimeException e){ //| IOException e
                            System.out.println(e.getMessage());
                            System.out.println("Finalizando la aplicación.");
                        }
                        break;
                    case "2":
                        //2) Peso argentino =>> Dólar > moneda origen [ARS] moneda destino [USD] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/ARS/USD/950
                        monedaOrigen = "ARS";
                        monedaDestino = "USD";
                        try{
                            Moneda moneda = consumirAPI.convertirMonedaOrigenMonedaDestino(apiKEY,monedaOrigen,monedaDestino,direccion,montoaConvertir);
                            System.out.println(moneda);
                            montoConvertido = moneda.conversion_result();
                            System.out.println(moneda.mensajedeRespuesta(montoaConvertir,monedaOrigen,montoConvertido,monedaDestino));
                        } catch (NumberFormatException e){
                            System.out.println("Número no encontrado "+e.getMessage());
                        } catch (RuntimeException e){ //| IOException e
                            System.out.println(e.getMessage());
                            System.out.println("Finalizando la aplicación.");
                        }
                        break;
                    case "3":
                        //3) Dólar =>> Real brasileño > moneda origen [USD] moneda destino [BRL] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/BRL/1
                        monedaOrigen = "USD";
                        monedaDestino = "BRL";
                        try{
                            Moneda moneda = consumirAPI.convertirMonedaOrigenMonedaDestino(apiKEY,monedaOrigen,monedaDestino,direccion,montoaConvertir);
                            System.out.println(moneda);
                            montoConvertido = moneda.conversion_result();
                            System.out.println(moneda.mensajedeRespuesta(montoaConvertir,monedaOrigen,montoConvertido,monedaDestino));
                        } catch (NumberFormatException e){
                            System.out.println("Número no encontrado "+e.getMessage());
                        } catch (RuntimeException e){ //| IOException e
                            System.out.println(e.getMessage());
                            System.out.println("Finalizando la aplicación.");
                        }
                        break;
                    case "4":
                        //4) Real brasileño =>> Dólar > moneda origen [BRL] moneda destino [USD] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/BRL/USD/950
                        monedaOrigen = "BRL";
                        monedaDestino = "USD";
                        try{
                            Moneda moneda = consumirAPI.convertirMonedaOrigenMonedaDestino(apiKEY,monedaOrigen,monedaDestino,direccion,montoaConvertir);
                            System.out.println(moneda);
                            montoConvertido = moneda.conversion_result();
                            System.out.println(moneda.mensajedeRespuesta(montoaConvertir,monedaOrigen,montoConvertido,monedaDestino));
                        } catch (NumberFormatException e){
                            System.out.println("Número no encontrado "+e.getMessage());
                        } catch (RuntimeException e){ //| IOException e
                            System.out.println(e.getMessage());
                            System.out.println("Finalizando la aplicación.");
                        }
                        break;
                    case "5":
                        //5) Dólar =>> Peso colombiano > moneda origen [USD] moneda destino [COP] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/USD/COP/1
                        monedaOrigen = "USD";
                        monedaDestino = "COP";
                        try{
                            Moneda moneda = consumirAPI.convertirMonedaOrigenMonedaDestino(apiKEY,monedaOrigen,monedaDestino,direccion,montoaConvertir);
                            System.out.println(moneda);
                            montoConvertido = moneda.conversion_result();
                            System.out.println(moneda.mensajedeRespuesta(montoaConvertir,monedaOrigen,montoConvertido,monedaDestino));
                        } catch (NumberFormatException e){
                            System.out.println("Número no encontrado "+e.getMessage());
                        } catch (RuntimeException e){ //| IOException e
                            System.out.println(e.getMessage());
                            System.out.println("Finalizando la aplicación.");
                        }
                        break;
                    case "6":
                        //6) Peso colombiano =>> Dólar > moneda origen [COP] moneda destino [USD] direccion > https://v6.exchangerate-api.com/v6/80d97146956c01505f48b00b/pair/COP/USD/950
                        try{
                            monedaOrigen = "COP";
                            monedaDestino = "USD";
                            Moneda moneda = consumirAPI.convertirMonedaOrigenMonedaDestino(apiKEY,monedaOrigen,monedaDestino,direccion,montoaConvertir);
                            System.out.println(moneda);
                            montoConvertido = moneda.conversion_result();
                            System.out.println(moneda.mensajedeRespuesta(montoaConvertir,monedaOrigen,montoConvertido,monedaDestino));
                        } catch (NumberFormatException e){
                            System.out.println("Número no encontrado "+e.getMessage());
                        } catch (RuntimeException e){ //| IOException e
                            System.out.println(e.getMessage());
                            System.out.println("Finalizando la aplicación.");
                        }
                        break;
                    default:
                        System.out.println("Opcion desconocida, teclee otra");
                        break;
                }
            }
        } while (!"7".equals(opcion));
        //********************* menu *******************************

    }
}