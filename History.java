package com.chrisuribe.memento;

import java.util.Stack;

public class History {

    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state){
        states.push(state);
        System.out.println("Pushed state..." + (states.peek()).getContent());
    }

    public EditorState pop() {

        System.out.println("Poped state...");
        return states.pop();
    }

}
