package com.example.smarttable.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ChatResponse {
    String fileName;
    String previewContent;
    String aiAnswer;
}
