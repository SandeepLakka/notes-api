package com.example.notes.repository;

import com.example.notes.model.Note;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public interface NoteRepository extends JpaRepository<Note, String> {
}
