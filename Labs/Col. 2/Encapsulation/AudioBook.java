public class AudioBook extends Book{
    private int size;
    private int length;
    private String artistName;
    public AudioBook(String a,String b,int c, int d, int f,String g){
        super(a,b,c);
        size =d;
        length=f;
        artistName=g;
    }
    public String toString(){
        return String.format("%s%nBook size:%d%nBook length: %d%nArtist name:%s%n",super.toString(),size,length,artistName);
    }
}