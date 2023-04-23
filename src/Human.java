public class Human implements Comparable<Human>{
    public String last_name;
    public String first_name;
    public String second_name;

    public Human(String last_name, String first_name, String second_name) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.second_name = second_name;
    }

    @Override
    public int compareTo(Human human) {
        int d = this.last_name.compareTo(human.last_name);
        if (d == 0) {
            d = this.first_name.compareTo(human.first_name);
            if (d == 0)
                d = this.second_name.compareTo(human.second_name);
        }
        return d;
    }
    @Override
    public String toString() {
        return last_name + " " + first_name + " " + second_name;
    }

}
