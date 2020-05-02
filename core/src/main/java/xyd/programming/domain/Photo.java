package xyd.programming.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Photo {
    private String url;
    private LocalDateTime timestamp;

    public Photo(String url, LocalDateTime timestamp) {
        this.url = url;
        this.timestamp = timestamp;
    }
}
