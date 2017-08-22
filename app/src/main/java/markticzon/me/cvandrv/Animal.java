package markticzon.me.cvandrv;

/**
 * Created by it.admin on 8/19/2017.
 */

public class Animal {
    private String name;
    private int age;
    private int photos;

    public Animal(String name, int age, int photos) {
        this.name = name;
        this.age = age;
        this.photos = photos;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhotos() {
        return photos;
    }

    public void setPhotos(int photos) {
        this.photos = photos;
    }






}
