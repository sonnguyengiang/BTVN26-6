package main.fail;

public class EmailFail extends Exception{
    @Override
    public String getMessage() {
        return "Email đã có nhập lại đi fr :)";
    }
}
