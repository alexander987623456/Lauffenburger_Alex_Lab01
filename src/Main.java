import javax.swing.*;
import java.io.*;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class Main {

    public static final String DATA_FILE_PATH = "PersonTestData.txt";
    public static final String ProductDATA_FILE_PATH = "ProductTestData.txt";
    private static JFileChooser fileChooser;

    public static void main(String[] args) {
        Person alex = new Person("alexander", "lauffenburger", "360996", "esq.", 2004);
        Product apple = new Product("apple", "fruit", "0004", 2.00);
        ArrayList<String[]> dataList = new ArrayList<>();
        ArrayList<String[]> productList = new ArrayList<>();
        System.out.println(alex.getFullName());
        System.out.println(alex.getFormalName());
        System.out.println(alex.getAge());
       // System.out.println(apple.getProductInfo());

alex.setYear(1900);
        System.out.println(alex.getYear() - alex.YOB);
        System.out.println(alex.toCSVDataRecord());
        System.out.println(apple.getProductInfo());
        System.out.println(apple.toCSVProductDataRecord());
        ArrayList<Object> list = new ArrayList<>();
        String[] newData = {alex.firstName, alex.lastName, alex.ID, alex.title, String.valueOf(alex.YOB)};
        dataList.add(newData);
        writeDataToFile(dataList);
        String [] productData = {apple.name, apple.description, apple.ProductID, String.valueOf(apple.cost)};
        productList.add(productData);
        writeProductDataToFile(productList);
        //

    }
    public static void writeDataToFile(ArrayList<String[]> dataList) {
        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(Path.of(DATA_FILE_PATH), CREATE));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {


            for (String[] data : dataList) {
                writer.write(String.join(",", data));
                writer.newLine();
            }

            System.out.println("Data written to " + DATA_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeProductDataToFile(ArrayList<String[]> ProductdataList) {
        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(Path.of(ProductDATA_FILE_PATH), CREATE));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out))) {


            for (String[] newProductdata : ProductdataList) {
                writer.write(String.join(",", newProductdata));
                writer.newLine();
            }

            System.out.println("Data written to " + ProductDATA_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
