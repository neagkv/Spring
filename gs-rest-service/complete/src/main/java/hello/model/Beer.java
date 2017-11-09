package hello.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Type;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Beer {

    String message;
    Data data;
//    int id;
//    String name;
//    String nameDisplay;
//    String description;
//    String abv;
//    String ibu;
//    String Style_id;
//    String isOrganic;
    String status;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "message='" + message + '\'' +
                ", data=" + data + '\'' +
                "status=" + status +
                '}';
    }
}


