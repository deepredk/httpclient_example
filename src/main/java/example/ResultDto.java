package example;

public class ResultDto {
    private String resultCode;
    
    public ResultDto(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    @Override
    public String toString() {
        return "{ resultCode: " + resultCode + " }";
    }
}
