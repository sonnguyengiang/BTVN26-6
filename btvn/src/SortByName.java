import java.util.Comparator;

public class SortByName implements Comparator<Nhanvien> {

    @Override
    public int compare(Nhanvien o1, Nhanvien o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
