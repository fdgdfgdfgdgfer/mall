package com.jfz.improve.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentPartESDto {

    private String id;

    private String docId;

    private String kgId;

    private String content;

    private String type;
}
