package hello.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Address {

        String message;
        Data data;

        String status;


        @Override
        public String toString() {
            return "Beer{" +
                    "message='" + message + '\'' +
                    ", data=" + data + '\'' +
                    "status=" + status +
                    '}';
        }
    }







