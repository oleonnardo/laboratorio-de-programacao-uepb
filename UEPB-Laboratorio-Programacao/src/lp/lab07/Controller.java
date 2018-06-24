/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.lab07;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @aluno Leonardo Araujo Silva
 * @matricula 161080120
 */
public class Controller {

    private static int id = 0;

    private Enumeration names;
    private String[] keys;
    private Hashtable<String, Agenda> hashtable;

    public Controller() {
        this.hashtable = new Hashtable<String, Agenda>();
    }

    public String[] getKeys() {
        return keys;
    }

    public Hashtable<String, Agenda> getHashtable() {
        return hashtable;
    }

    public void create(Agenda agenda) {
        this.hashtable.put(agenda.getNome().trim(), agenda);
        this.sort();
    }

    public void show() {
        for (int i = 0; i != this.keys.length; i++) {
            if (!this.keys[i].isEmpty()) {
                System.out.println(this.hashtable.get(this.keys[i]));
            }
        }
    }

    public void update(Agenda agenda, String index) {
        this.hashtable.replace(index, agenda);
        updateIndex(agenda.getNome(), index);
        this.sort();
    }

    public void remove(String index) {
        this.hashtable.remove(index);
        this.removeIndex(index);
    }

    public void updateIndex(String newValue, String index) {
        for (int i = 0; i < this.keys.length; i++) {
            System.out.println(this.keys[i]);
            if (this.keys[i].equals(index)) {
                this.keys[i] = newValue;
            }
        }
    }

    public void removeIndex(String index) {
        for (int i = 0; i < this.keys.length; i++) {
            if (this.keys[i].equals(index)) {
                if (this.keys.length < i) {
                    this.keys[i] = this.keys[i + 1];
                }
                this.keys[i] = "";
            }
        }
    }

    public void sort() {
        this.keys = (String[]) this.hashtable.keySet().toArray(new String[0]);
        Arrays.sort(this.keys);
    }

    public boolean hasContato(String key) {
        return this.hashtable.containsKey(key.toUpperCase());
    }

    public boolean isEmpty() {
        return this.hashtable.isEmpty();
    }

}
