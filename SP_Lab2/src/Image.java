public class Image extends Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public void print() {
        System.out.println(this.imageName);
    }
}
