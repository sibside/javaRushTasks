package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("c://java/tempOut.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Vasya");
            user.setLastName("Pupkin");
            user.setMale(false);
            user.setCountry(User.Country.UKRAINE);
            user.setBirthDate(new Date());
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            if(loadedObject.equals(javaRush))
                System.out.println("OK!");
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            String usersIs = users != null ? "yes" : "no";
            writer.println(usersIs);
            writer.flush();

            if(usersIs.equals("yes")){
                for(User u:users){
                    writer.println(u.getFirstName()+" "+u.getLastName()+" "+u.isMale()+" "+u.getCountry().toString()+" "+u.getBirthDate().getTime());
                    writer.flush();
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String usersIs = reader.readLine();
            if(usersIs.equals("yes")){
                String line;
                while ((line = reader.readLine())!=null){
                    String[] buff = line.split(" ");
                    User user = new User();
                    user.setFirstName(buff[0]);
                    user.setLastName(buff[1]);

                    boolean isMale = buff[2].equals("true")?true:false;
                    user.setMale(isMale);

                    if(buff[3].equals("UKRAINE"))
                        user.setCountry(User.Country.UKRAINE);
                    else if(buff[3].equals("RUSSIA"))
                        user.setCountry(User.Country.RUSSIA);
                    else if(buff[3].equals("OTHER"))
                        user.setCountry(User.Country.OTHER);

                    Date d = new Date(Long.parseLong(buff[4]));
                    user.setBirthDate(d);
                    users.add(user);
                }
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
