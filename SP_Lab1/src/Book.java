import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> paragraphList;
    private List<String> imageList;
    private List<String> tableList;


    public Book(String title){
        paragraphList = new ArrayList<>();
        imageList = new ArrayList<>();
        tableList = new ArrayList<>();
        this.title = title;
    }


    public void createNewParagraph(String paragraph){
        paragraphList.add(paragraph);
    }

    public void createNewImage(String image){
        imageList.add(image);
    }

    public void createNewTable(String table){
        tableList.add(table);
    }

    public void print() {
        System.out.println(paragraphList);
        System.out.println(imageList);
        System.out.println(tableList);
    }
}
