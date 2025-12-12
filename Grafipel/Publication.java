package Grafipel;

public interface Publication {
    void open();
    void close();
    void flipToPage(int page);
    void nextPage();
    void previousPage();
}