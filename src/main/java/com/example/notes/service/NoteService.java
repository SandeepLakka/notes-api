package com.example.notes.service;

import com.example.notes.model.Note;
import com.example.notes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    @Autowired // this type of auto wiring is not recommended
    private NoteRepository noteRepository;

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public boolean deleteNote(String id) {
        if (noteRepository.existsById(id)){
            noteRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }

    public Optional<Note> getNoteById(String id) {
        return noteRepository.findById(id);
    }

    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }
}
