//package Day9;
//import java.util.*;
//
//public class UserManagement {
//        private final Map<String, User> users = new HashMap<>();
//
//        public boolean register(String username, String password) {
//            if (users.containsKey(username)) {
//                return false;
//            }
//            users.put(username, new User());
//            return true;
//        }
//        public User login(String username, String password) {
//            User user = users.get(username);
//            if (user != null && user.getClass().equals(password)) {
//                return user;
//            }
//            return null;
//        }
//    public class User {
//
//        public List<String> getTasks() {
//            return List.of();
//        }
//}
//}
