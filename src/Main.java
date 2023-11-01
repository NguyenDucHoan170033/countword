/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controller.WordController;
import model.WordModel;
import view.WordView;

public class Main {
    
    public static void main(String[] args) {
        WordModel model = new WordModel();
        WordView view = new WordView();
        WordController control = new WordController(model,view);
        control.processUserInput();
    }
}
