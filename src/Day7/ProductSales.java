//package Day7;
//import java.math.BigDecimal;
//
//
//public class ProductSales {
//
//        private String name;
//        private double price;
//        private int sold;
//
//        public ProductSales(String name, double price, int sold) {
//            this.name = name;
//            this.price = price;
//            this.sold = sold;
//        }
//
//        public ProductSales() {
//
//        }
//
//        public BigDecimal getSales() {
//            BigDecimal sales = BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(sold));
//            return sales;
//        }
//
//        public int getSold() {
//            return sold;
//        }
//
//        public String toString() {
//            return "Product [name=" + name + ", price=" + price + ", sold=" + sold + "]";
//        }
//
//        public void setSold(int sold) {
//            if (sold < 0) {
//                throw new IllegalArgumentException("Sold cannot be negative");
//            }
//            this.sold = sold;
//        }
//
//        public void setName(String name) {
//            if (name == null || name.isEmpty()) {
//                throw new IllegalArgumentException("name cannot be null or empty");
//            }
//            this.name = name;
//        }
//
//        public void setPrice(double price) {
//            if (sold < 0) {
//                throw new IllegalArgumentException("Price cannot be negative");
//            }
//            this.price = price;
//        }
//    }
//}
