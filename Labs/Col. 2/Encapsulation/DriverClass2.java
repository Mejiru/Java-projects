public class DriverClass2 {
    public static void main(String[] args) {
        PaperBook paperBook = new PaperBook("Absolute Java", "ABC Author", 2017, "Pearson Publication", "81243343-34234");
        System.out.println("Paper Book Details"); System.out.println();
        System.out.println(paperBook);
        System.out.println(); System.out.println();
        AudioBook audioBook = new AudioBook("Absolute Java", "XYZI Author", 2017, 150, 90,"Peter Park");
        System.out.println("Audio Book Details"); System.out.println();
        System.out.println(audioBook); System.out.println();
    }
}
