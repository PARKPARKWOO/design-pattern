public class MemberImp extends Member {
    private int count;

    public MemberImp(int count) {
        super(0, "", "");
        this.count = count;
    }

    @Override
    public String toString() {
        return super.toString() +
                "count=" + count;
    }
}
