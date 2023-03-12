package Stream;


public class Cat implements Comparable <Cat>{

        private String Name;
        private int Age;
        private String Type;

        public Cat(String name, int age, String type) {
            Name = name;
            Age = age;
            Type = type;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getType() {
            return Type;
        }

        public void setType(String type) {
            Type = type;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "Name='" + Name + '\'' +
                    ", Age=" + Age +
                    ", Type='" + Type + '\'' +
                    '}';
        }



    @Override
    public int compareTo(Cat o) {
        if (this.Age < o.Age){
            return -1;
        } else if (this.Age > o.Age) {
            return 1;
        }
        return 0;
    }

}

