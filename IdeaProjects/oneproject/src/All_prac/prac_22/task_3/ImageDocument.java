package All_prac.prac_22.task_3;

public class ImageDocument implements IDocument{
    @Override
    public void open() {
        System.out.println("Image Document opened");
    }

    @Override
    public void save() {
        System.out.println("Image Document saved");
    }
}
