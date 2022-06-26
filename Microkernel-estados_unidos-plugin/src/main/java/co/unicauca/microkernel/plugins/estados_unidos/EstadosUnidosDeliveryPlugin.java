package co.unicauca.microkernel.plugins.estados_unidos;
import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;
/**
 *
 * @author Edwin
 */
public class EstadosUnidosDeliveryPlugin implements IDeliveryPlugin{
    
    public double calculateCost(Delivery delivery) {

        Product product = delivery.getProduct();
        double weight = product.getWeight();
        double distance = delivery.getDistance();

        double cost;

        if (weight <= 2) {

            cost = (distance <= 20) ? 4 : 5;

        } else {

            cost = (distance <= 20) ? 6 : 7;

        }

        return cost;

    }
}
