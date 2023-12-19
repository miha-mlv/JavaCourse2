package All_prac.prac_22.task_3;

public class MusicDocument implements IDocument{
    @Override
    public void open() {
        System.out.println("Music Document opened");
    }

    @Override
    public void save() {
        System.out.println("Music Document saved");
    }
}
