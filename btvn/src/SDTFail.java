public class SDTFail extends Exception{
    @Override
    public String getMessage() {
        return "Số điện thoại đã tồn tại";
    }
}
