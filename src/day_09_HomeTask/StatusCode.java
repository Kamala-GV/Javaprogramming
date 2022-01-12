package day_09_HomeTask;

public class StatusCode {
    public static void main(String[] args) {
        int code = 400;
       String result= (code == 200) ? "Ok" : (code == 201) ? "Created"
                : (code == 202) ? "Accepted" : (code == 301) ? "Moved Permanently"
                : (code == 303) ? "See other" : (code == 304) ? " Not modified"
                : (code == 307) ?
                "Temporary redirect" : (code == 400) ? "Bad Request"
                : "gone";
        System.out.println(result);

    }
}