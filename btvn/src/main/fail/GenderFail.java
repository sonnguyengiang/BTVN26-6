package main.fail;

public class GenderFail extends Exception{
    @Override
    public String getMessage() {
        return "giới tính không xác định - nhập lại";
    }
}
