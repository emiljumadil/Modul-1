//package Day9;
//import java.util.*;
//
//
//public class User {
//        private final UUID id;
//        private final String username;
//        private final String password;
//        private final List<String> tasks;
//
//    public User(String username, String password) {
//            this.id = UUID.randomUUID();
//            this.username = username;
//            this.password = password;
//            this.tasks = new ArrayList<>();
//        }
//
//
//        public String getUUID() {
//            return id.toString();
//        }
//
//        public String getUsername() {
//            return username;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public List<String> getTasks() {
//            return tasks;
//        }
//
//        public void addTask(String task) {
//            tasks.add(task);
//        }
//
//        public boolean removeTask(String task) {
//            return tasks.remove(task);
//        }
//    }
