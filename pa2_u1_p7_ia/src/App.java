import com.edu.ia.negocio.Pedido;
import com.edu.ia.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Juan Perez","Laptop",1500.0,"juanperez@example.com");//creamos manualmente el objeto de el Pedido
        PedidoService pedidoService = new PedidoService(); //creamos manualmente el objeto de PedidoService
        pedidoService.realizar(pedido);
        pedido = null;//el objeto sea elegible por el GC
        pedidoService=null;//el objeto sea elegible por el GC
    }
}
