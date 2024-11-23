package sidrepca;
import sidrepca.service.SidrepcaServiceImpl;
import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/sidrepca", new SidrepcaServiceImpl());
        System.out.println("Serviço rodando em http://localhost:8080/sidrepca?wsdl");
    }
}
