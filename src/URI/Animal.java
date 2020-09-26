package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Animal {
    private static Animal1 A1, A2;

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String[] str = {"ave", "carnivoro", "aguia", "onivoro", "pomba",
                "mamifero", "onivoro", "homem", "herbivoro", "vaca"};

        A1 = new Animal1("");
        recursive(A1, str, 0);

        String[] str1 = {"inseto", "hematofago", "pulga", "herbivoro", "lagarta",
                "anelido", "hematofago", "sanguessuga", "onivoro", "minhoca"};

        A2 = new Animal1("");
        recursive(A2, str1, 0);

        String[] s = {b.readLine(), b.readLine(), b.readLine()};

        if (s[0].equals("vertebrado")) {
            search(A1, s, 1, new BufferedWriter(new OutputStreamWriter(System.out)));
        } else {
            search(A2, s, 1, new BufferedWriter(new OutputStreamWriter(System.out)));
        }

    }

    public static void search(Animal1 a, String str[], int index, BufferedWriter b) throws Exception {

        if (index < str.length) {

            if (a.getNextRight().getName().equals(str[index])) {
                search(a.getNextRight(), str, ++index, b);
            } else {
                search(a.getNextLeft(), str, ++index, b);
            }
        } else {
            b.write(a.getNextRight().getName());
            b.newLine();
            b.flush();
            b.close();
        }
    }

    public static void recursive(Animal1 a, String str[], int index) {
        if (index < (str.length / 2)) {
            if (index <= 2) {
                a.setNextRight(new Animal1(str[index]));
                a.getNextRight().setRoot(a);
                recursive(a.getNextRight(), str, ++index);
            } else if (index == 3) {
                a.setNextRight(a.getRoot().getRoot());
                a.getNextRight().setNextLeft(new Animal1(str[index]));
                a.getNextRight().getNextLeft().setRoot(a.getNextRight());
                recursive(a.getNextRight().getNextLeft(), str, ++index);
            } else {
                a.setNextRight(new Animal1(str[index]));
                a.getNextRight().setRoot(a);
                a.getNextRight().setNextRight(a.getRoot().getRoot());
                recursive(a.getNextRight().getNextRight(), str, ++index);
            }
        } else if (index < str.length) {
            if (index == 5) {
                a.setNextLeft(new Animal1(str[index]));
                a.getNextLeft().setRoot(a);
                recursive(a.getNextLeft(), str, ++index);
            } else if (index <= 7) {
                a.setNextRight(new Animal1(str[index]));
                a.getNextRight().setRoot(a);
                recursive(a.getNextRight(), str, ++index);
            } else if (index == 8) {
                a.setNextRight(a.getRoot().getRoot());
                a.getNextRight().setNextLeft(new Animal1(str[index]));
                recursive(a.getNextRight().getNextLeft(), str, ++index);
            } else {
                a.setNextRight(new Animal1(str[index]));
                a.getNextRight().setRoot(a);
            }
        }
    }

    private static class Animal1 {
        private String Name;
        private Animal1 Left, Right, Root;
        private boolean isVisit;

        public Animal1(String Name) {
            this.Name = Name;
            this.isVisit = false;
            this.Left = null;
            this.Right = null;
        }

        public Animal1 getRoot() {
            return this.Root;
        }

        public void setRoot(Animal1 Root) {
            this.Root = Root;
        }

        public Animal1 getNextRight() {
            return this.Right;
        }

        public void setNextRight(Animal1 right) {
            this.Right = right;
        }

        public Animal1 getNextLeft() {
            return this.Left;
        }

        public void setNextLeft(Animal1 left) {
            this.Left = left;
        }

        public String getName() {
            return this.Name;
        }

        public void setIsVisit(boolean isVisit) {
            this.isVisit = isVisit;
        }

        public boolean isVisit() {
            return this.isVisit;
        }
    }
}