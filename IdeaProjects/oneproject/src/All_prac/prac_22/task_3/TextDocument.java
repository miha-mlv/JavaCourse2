package All_prac.prac_22.task_3;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Text Document opened");
    }

    @Override
    public void save() {
        System.out.println("Text Document saved");
    }
}