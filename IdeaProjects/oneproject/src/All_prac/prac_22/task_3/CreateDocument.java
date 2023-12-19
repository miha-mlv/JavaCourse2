package All_prac.prac_22.task_3;

public class CreateDocument {
    CreateDocument(){}
    public IDocument getDocument(String type)
    {
        if("Text".equalsIgnoreCase(type))
        {
            return new TextDocument();
        }
        else if("Music".equalsIgnoreCase(type))
        {
            return new MusicDocument();
        }
        else if("Image".equalsIgnoreCase(type))
        {
            return new ImageDocument();
        }
        return null;
    }
//    @Override
//    public IDocument createNew() {
//        return new TextDocument();
//    }
//
//    @Override
//    public IDocument createOpen() {
//        return new TextDocument();
//    }
}