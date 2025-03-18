/*
Name: Irfan Bin Islam
ID: 202200144
Section: CS||101
Assignment 1
 */
public enum BookT{

    JHTP( "Java How to Program", "2015" ),
    CHTP( "C How to Program", "2013" ),
    IW3HTP( "Internet & World Wide Web How to Program", "2012" ),
    CPPHTP( "C++ How to Program", "2014" ),
    VBHTP( "Visual Basic How to Program", "2014" ),
    CSHARPHTP( "Visual C# How to Program", "2014" );
    private final String title;
    private final String year;
    Book(String b_title,String b_year){
        title = b_title;
        year = b_year;
    }
    public String getTitle(){
        return title;
    }
    public String getYear(){
        return year;
    }
}
