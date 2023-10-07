public class Member {
    private int num;
    private String name;
    private String about;

    public String getAbout() {
        return about;
    }

    public Member(int num, String name, String about) {
        this.num = num;
        this.name = name;
        this.about = about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "num=" + num +
                ", name='" + name + '\'' +
                ", about='" + about + '\'';
    }
}
