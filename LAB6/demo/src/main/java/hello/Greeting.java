package hello;

import java.util.Random;

public class Greeting {
private final long id;
private final String name;
private final long age;
private final String gender;
private final String content;


        public Greeting(long id, String content, String name,long age,String gender) {
        this.id = id;
        this.content = content;
        this.name=name;
        this.age= age;
        this.gender=gender;
        }
        public long getId() {
        return id;
        }
        public String getContent() {
        return content;
        }

        public String getName() {
                return name;
        }
        public long getAge() {
                return age;
        }

        public String getGender() {
                return gender;
        }
}
