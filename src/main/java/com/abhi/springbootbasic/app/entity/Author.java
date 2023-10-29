package com.abhi.springbootbasic.app.entity;

import lombok.*;
import lombok.extern.java.Log;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Data
@Builder
@Log
public class Author {

    private int id;

    @NonNull
    private String name;

    @Setter(AccessLevel.PROTECTED)
    private String surname;
}
