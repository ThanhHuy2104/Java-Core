
package iostream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        // 1. Đọc ghi bytes bằng file riêng
        String bytePath = "abc.txt";
        byte[] bytes = "Java Core".getBytes(StandardCharsets.UTF_8);

        IOManager.writeBytes(bytePath, bytes, false);
        String content = IOManager.readBytes(bytePath);
        System.out.println("content = " + content);

        // 2. Ghi object bằng file riêng
        String objectPath = "cars.dat";

        Car car = new Car("Honda", "Black");

        IOManager.writeObject(objectPath, car, false);

        Car object = (Car) IOManager.readObject(objectPath);

        System.out.println("object = " + object);


    }
}
