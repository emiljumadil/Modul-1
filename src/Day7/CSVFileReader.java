//package Day7;
//import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class CSVFileReader {
//    private String filePath;
//
//    public void readFile(String filename) throws FileNotFoundException {
//        File file = new File(filename);
//        private static final String FILE_NAME = "/Users/emiljumadil/IdeaProjects/hallo/src/resources/product_sales_data.csv";
//        private static final String DELIMITER = ",";
//        private static final String DATA_HEADER = "Product Name,Total Sold,Item Price";
//
//
//        public static List<ProductSales> readProductFromCsv() {
//            List<ProductSales> products = new ArrayList<>();
//
//            try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
//                String header = br.readLine();
//                if (header == null || !header.equalsIgnoreCase(DATA_HEADER)) {
//                    throw new IllegalArgumentException("Invalid CSV file format");
//                }
//
//                String line;
//                while ((line = br.readLine()) != null) {
//                    String[] data = line.split(DELIMITER);
//                    if (data.length != 3) {
//                        throw new IllegalArgumentException("Invalid CSV file format, expected 3 columns but got " + data.length);
//                    }
//                    products.add(createProduct(data));
//                }
//            } catch (Exception e) {
//                System.out.println("Something went wrong: " + e.getMessage());
//            }
//
//            return products;
//        }
//
//        private static ProductSales createProduct(String[] values) {
//            ProductSales product = new ProductSales();
//
//            product.setName(values[0].trim());
//            try {
//                product.setPrice(Double.parseDouble(values[2]));
//                product.setSold(Integer.parseInt(values[1]));
//            } catch (NumberFormatException e) {
//                throw new IllegalArgumentException("Invalid product price or sold value (it should be a number): " + values[1].trim());
//            }
//
//            return product;
//        }
//
//        private static void printSummary boolean salesProducts;
//        (List<ProductSales> salesProducts) {
//            int totalSold = 0;
//            BigDecimal totalSales = BigDecimal.ZERO;
//
//            ProductSales mostBought = null;
//            ProductSales leastBought = null;
//
//            for (ProductSales product : salesProducts) {
//                totalSales = totalSales.add(product.getSales());
//                totalSold += product.getSold();
//
//                if (mostBought == null || product.getSold() > mostBought.getSold()) {
//                    mostBought = product;
//                }
//
//                if (leastBought == null || product.getSold() < leastBought.getSold()) {
//                    leastBought = product;
//                }
//            }
//
//            System.out.println("Total Sold: " + totalSold);
//            System.out.println("Total Sales: " + totalSales);
//            System.out.println("Most Bought Product: " + mostBought);
//            System.out.println("Least Bought Product: " + leastBought);
//        }
//
//        public static void main(String[] args) {
//            List<ProductSales>  products = readProductFromCsv();
//            printSummary(products);
//        }
//    }
